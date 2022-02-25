package maluevArtem.homework_2_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        numbers.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(s -> System.out.print(s + " "));
    }
}
