package Laboratory1.challenge2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParallelRace {

    // Lane One function: Returns the largest number
    public static int findMax(List<Integer> numbers) {
        return numbers.stream()
                      .max(Integer::compareTo)
                      .orElse(0);
    }

    // Required for First Collision: Returns the smallest number
    public static int findMin(List<Integer> numbers) {
        return numbers.stream()
                      .min(Integer::compareTo)
                      .orElse(0);
    }

    // Required for First Collision: Returns the total number of elements
    public static int countElements(List<Integer> numbers) {
        return numbers.size();
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
        int min = findMin(userList);
        int totalElements = countElements(userList);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Number of elements: " + totalElements);
        
        scanner.close();
    }
}