package Laboratory1.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParallelRace {

    //  Receives a list of numbers and returns the largest number
    public static int findMax(List<Integer> numbers) {
        return numbers.stream()
                      .max(Integer::compareTo)
                      .orElse(0); // Default value if the list is empty
    }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userList = new ArrayList<>();

        System.out.println("How many numbers do you want to enter?");
        int count = scanner.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            userList.add(scanner.nextInt());
        }

        int max = findMax(userList);
        System.out.println("Maximum value: " + max);
        
        scanner.close();
    }
}