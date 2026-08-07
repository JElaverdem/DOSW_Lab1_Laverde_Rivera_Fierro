package Laboratory1.challenge4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureMap {

    public static Map<String, Integer> getMapData() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pairs will you enter?");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter data exactly as (\"silver\", 8):");

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine().trim();
            line = line.replace("(", "").replace(")", "").replace("\"", "");
            String[] parts = line.split(",");

            if (parts.length == 2) {
                String key = parts[0].trim();
                int value = Integer.parseInt(parts[1].trim());
                hashtable.put(key, value);
            } else {
                System.out.println("Format error. Please write like (\"silver\", 8):");
                i--;
            }
        }

        return hashtable;
    }

    public static void processAndPrintMap(Map<String, Integer> map) {
        map.entrySet().stream()
           .map(entry -> new java.util.AbstractMap.SimpleEntry<>(entry.getKey().toUpperCase(), entry.getValue()))
           .sorted(Map.Entry.comparingByKey())
           .collect(Collectors.toMap(
               Map.Entry::getKey,
               Map.Entry::getValue,
               (e1, e2) -> e1,
               java.util.LinkedHashMap::new
           ))
           .forEach((k, v) -> System.out.println("Key: " + k + " | Value: " + v));
    }

    public static void main(String[] args) {
        Map<String, Integer> mapB = getMapData();
        System.out.println("\nProcessed Hashtable Data (Student B):");
        processAndPrintMap(mapB);
    }
}