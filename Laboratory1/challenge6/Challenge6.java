package Laboratory1.challenge6;
import java.util.HashMap;
import java.util.Map;

public class Challenge6{
        public static void executeCommand(String command){
            Map<String, Runnable> commands= new HashMap<>();
            commands.put("GREET", () -> System.out.println("Greetings, traveler of time and code"));
            commands.put("FAREWELL", () -> System.out.println("May the bits be with you until the next mission"));
            commands.put("SING", () -> System.out.println("01010101"));
            commands.put("DANCE", () -> System.out.println("Spinning in party mode"));
            switch (command){
                case"GREET":
                case"FAREWELL":
                case"SING":
                case"DANCE":
                    commands.get(command).run();
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }
            public static void main(String[] args){
                
    }}