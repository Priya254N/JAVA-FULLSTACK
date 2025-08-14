package Logicbuildings;

public class RobotMovement {

	public String moveRobot(int input1, int input2, String input3, String input4) {
        int maxX = input1;
        int maxY = input2;
        String[] start = input3.split("-");
        int x = Integer.parseInt(start[0]);
        int y = Integer.parseInt(start[1]);
        char direction = start[2].charAt(0);
        String[] instructions = input4.split("");
        for (String instruction : instructions) {
            if (instruction.equals("M")) {
                int newX = x;
                int newY = y;
                if (direction == 'E') newX++;
                else if (direction == 'W') newX--;
                else if (direction == 'N') newY++;
                else if (direction == 'S') newY--;
                if (newX >= 0 && newX <= maxX && newY >= 0 && newY <= maxY) {
                    x = newX;
                    y = newY;
                } else {
                    return x + "-" + y + "-" + direction + "-ER";
                }
            } else if (instruction.equals("L")) {
                if (direction == 'E') direction = 'N';
                else if (direction == 'W') direction = 'S';
                else if (direction == 'N') direction = 'W';
                else if (direction == 'S') direction = 'E';
            } else if (instruction.equals("R")) {
                if (direction == 'E') direction = 'S';
                else if (direction == 'W') direction = 'N';
                else if (direction == 'N') direction = 'E';
                else if (direction == 'S') direction = 'W';
            }
        }
        return x + "-" + y + "-" + direction;
    }

    public static void main(String[] args) {
    	RobotMovement obj = new RobotMovement();
        System.out.println(obj.moveRobot(5, 5, "1-2-N", "LMLMLMLMM"));
    }
}