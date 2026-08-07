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

        int maxn = findMax(userList);
        int minn = findMin(userList);
        int totalElements = countElements(userList);

        System.out.println("Maximum value: " + maxn);
        System.out.println("Minimum value: " + minn);
        System.out.println("Number of elements: " + totalElements);
        
        scanner.close();

        boolean maxMultipleOf2 = (maxn % 2 == 0) ? true : false;
        boolean maxDivisibleBy2 = (maxn % 2 == 0) ? true : false;

        boolean sizeEven = (totalElements % 2 == 0) ? true :false;
        boolean sizeOdd = (totalElements % 2 != 0) ? true :false;
        new Results (maxn, minn, totalElements, maxMultipleOf2, maxDivisibleBy2, sizeEven, sizeOdd);
    }
}

class Results {
    public int maxValue;
    public int minValue;
    public int totElements;
    public boolean isMultiple;
    public boolean isDivisor;
    public boolean isEven;
    public boolean isOdd;

    public Results(int maxV, int minV, int totalElements, boolean isMult, boolean isDiv, boolean isEv, boolean isOd){
        maxValue = maxV;
        minValue = minV;
        totElements = totalElements;
        isMultiple = isMult;
        isDivisor = isDiv;
        isEven = isEv;
        isOdd = isOd;
    }
}