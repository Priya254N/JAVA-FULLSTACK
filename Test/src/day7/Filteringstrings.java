package day7;
import java.util.*;
import java.util.stream.Collectors;

public class Filteringstrings {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("admin");
        al.add("egg");
        al.add("user");

        // Filtering even numbers
        List<String> li = al.stream()
                             .filter(x -> x.contains("e"))
                             .collect(Collectors.toList());

        System.out.println(li);
        }
}

