package day5;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class SmartAttendanceAnalyzer {

    static class LogEntry {
        String empId;
        String name;
        String action;
        LocalDateTime timestamp;

        LogEntry(String empId, String name, String action, LocalDateTime timestamp) {
            this.empId = empId;
            this.name = name;
            this.action = action;
            this.timestamp = timestamp;
        }
    }

    public static void main(String[] args) {
        String inputFile = "attendance_log.txt";
        String summaryFile = "summary_report.txt";
        String errorFile = "error_report.txt";

        Map<String, Map<LocalDate, List<LogEntry>>> logMap = new HashMap<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.trim().split(" ");
                if (tokens.length < 4) continue;

                String empId = tokens[0];
                String name = tokens[1];
                String action = tokens[2];
                String dateTimeStr = tokens[3] + " " + tokens[4];

                LocalDateTime timestamp = LocalDateTime.parse(dateTimeStr, dtf);
                LocalDate date = timestamp.toLocalDate();

                LogEntry entry = new LogEntry(empId, name, action, timestamp);

                logMap
                    .computeIfAbsent(empId, k -> new HashMap<>())
                    .computeIfAbsent(date, d -> new ArrayList<>())
                    .add(entry);
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        try (BufferedWriter summaryWriter = new BufferedWriter(new FileWriter(summaryFile));
             BufferedWriter errorWriter = new BufferedWriter(new FileWriter(errorFile))) {

            for (String empId : logMap.keySet()) {
                Map<LocalDate, List<LogEntry>> dailyLogs = logMap.get(empId);

                for (LocalDate date : dailyLogs.keySet()) {
                    List<LogEntry> entries = dailyLogs.get(date);
                    entries.sort(Comparator.comparing(e -> e.timestamp));

                    Duration totalDuration = Duration.ZERO;
                    boolean errorFlag = false;
                    StringBuilder errorBuilder = new StringBuilder();

                    for (int i = 0; i < entries.size(); i++) {
                        LogEntry current = entries.get(i);
                        if (!current.action.equals("IN")) {
                            errorFlag = true;
                            errorBuilder.append("Expected IN but found ")
                                        .append(current.action)
                                        .append(" at ")
                                        .append(current.timestamp)
                                        .append("\n");
                            continue;
                        }

                        if (i + 1 >= entries.size() || !entries.get(i + 1).action.equals("OUT")) {
                            errorFlag = true;
                            errorBuilder.append("Missing OUT for IN at ")
                                        .append(current.timestamp)
                                        .append("\n");
                            break;
                        }

                        LogEntry next = entries.get(i + 1);
                        if (next.timestamp.isBefore(current.timestamp)) {
                            errorFlag = true;
                            errorBuilder.append("OUT before IN for ")
                                        .append(empId)
                                        .append(" on ")
                                        .append(date)
                                        .append("\n");
                        } else {
                            Duration duration = Duration.between(current.timestamp, next.timestamp);
                            totalDuration = totalDuration.plus(duration);
                        }
                        i++; // Skip the OUT entry
                    }

                    if (errorFlag) {
                        errorWriter.write("Employee: " + empId + ", Date: " + date + "\n");
                        errorWriter.write(errorBuilder.toString());
                        errorWriter.write("--------\n");
                    } else {
                        long hours = totalDuration.toHours();
                        long minutes = totalDuration.toMinutes() % 60;
                        summaryWriter.write(String.format("Employee: %s, Date: %s, Duration: %dh %dm\n",
                                empId, date, hours, minutes));
                    }
                }
            }

            System.out.println("Reports generated: " + summaryFile + " and " + errorFile);

        } catch (IOException e) {
            System.out.println("Error writing reports: " + e.getMessage());
        }
    }
}