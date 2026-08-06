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

            commands.put("JOKE", () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
            commands.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
            commands.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
            commands.put("ANALYZE", () -> System.out.println("Processing data... result: You are amazing at programming!"));
            switch (command){
                case"GREET":
                case"FAREWELL":
                case"SING":
                case"DANCE":
                    commands.get(command).run();
                    break;
                case "JOKE":
                    commands.get(command).run();
                    break;
                case "SHOUT":
                    commands.get(command).run();
                    break;
                case "WHISPER":
                    commands.get(command).run();
                    break;
                case "ANALYZE":
                    commands.get(command).run();
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }
            public static void main(String[] args){
                executeCommand("GREET");
                executeCommand("FAREWELL");
                executeCommand("SING");
                executeCommand("DANCE");
                executeCommand("JOKE");
                executeCommand("SHOUT");
                executeCommand("WHISPER");
                executeCommand("ANALYZE");
        }
}