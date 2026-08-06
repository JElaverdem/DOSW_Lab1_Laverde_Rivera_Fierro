package Laboratory1.challenge3;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MysteriousEcho {

    // Student A requirement: Repeats the message three times, separated by a space using StringBuilder and stream()
    public static String repeatMessage(String start) {
        List<String> repetitions = Collections.nCopies(3, start);
        return repetitions.stream()
                          .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        // Lambda to invoke the function as required
        Function<String, String> echoFunction = MysteriousEcho::repeatMessage;
        
        String st = "Hola Mundo";
        System.out.println("Original: " + st);
        System.out.println("Repeated (Student A): " + echoFunction.apply(st));
    }
}