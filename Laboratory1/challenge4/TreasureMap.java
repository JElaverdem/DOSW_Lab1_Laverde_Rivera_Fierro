import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreasureMap {

    public static void processAndPrintMap(String typeName, Map<String, Integer> map) {
        System.out.println("\nProcessed " + typeName + " Data:");
        map.entrySet().stream()
           .map(entry -> new java.util.AbstractMap.SimpleEntry<>(entry.getKey().toUpperCase(), entry.getValue()))
           .sorted(Map.Entry.comparingByKey())
           .collect(Collectors.toMap(
               Map.Entry::getKey,
               Map.Entry::getValue,
               (e1, e2) -> e1 + e2, // Suma los duplicados si se convierten a mayúsculas
               LinkedHashMap::new
           ))
           .forEach((k, v) -> System.out.println("Key: " + k + " | Value: " + v));
    }

    public static void readAndProcessData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your data (press Enter twice or write 'END' to finish):");

        Map<String, Integer> currentMap = null;
        String currentTypeName = "";

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty() || line.equalsIgnoreCase("END")) {
                // Si hay un mapa activo antes de terminar, se procesa
                if (currentMap != null) {
                    processAndPrintMap(currentTypeName, currentMap);
                    currentMap = null;
                }
                if (line.equalsIgnoreCase("END")) break;
                continue;
            }

            // Detección del tipo de mapa mediante el encabezado
            if (line.toLowerCase().startsWith("hashmap")) {
                if (currentMap != null) processAndPrintMap(currentTypeName, currentMap);
                currentMap = new HashMap<>();
                currentTypeName = "HashMap";
            } else if (line.toLowerCase().startsWith("hashtable")) {
                if (currentMap != null) processAndPrintMap(currentTypeName, currentMap);
                currentMap = new Hashtable<>();
                currentTypeName = "Hashtable";
            } else if (line.toLowerCase().startsWith("treemap")) {
                if (currentMap != null) processAndPrintMap(currentTypeName, currentMap);
                currentMap = new TreeMap<>();
                currentTypeName = "TreeMap";
            } 
            // Procesamiento de las tuplas ("clave", valor)
            else if (line.startsWith("(") && line.endsWith(")")) {
                String cleanLine = line.replace("(", "").replace(")", "").replace("\"", "");
                String[] parts = cleanLine.split(",");

                if (parts.length == 2 && currentMap != null) {
                    String key = parts[0].trim();
                    int value = Integer.parseInt(parts[1].trim());

                    // Acumula duplicados en lugar de sobrescribir
                    currentMap.put(key, currentMap.getOrDefault(key, 0) + value);
                }
            }
        }

        if (currentMap != null) {
            processAndPrintMap(currentTypeName, currentMap);
        }
    }

    public static void main(String[] args) {
        readAndProcessData();
    }
}