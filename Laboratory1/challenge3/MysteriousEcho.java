package Laboratory1.challenge3;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MysteriousEcho {

    // Collision requirement: Repeats the message three times separated by space (Student A/StringBuilder),
    // and reverses the final result using StringBuffer (Student B requirement)
    public static String echoCollision(String start) {
        List<String> repetitions = Collections.nCopies(3, start);
        String repeated = repetitions.stream()
                                    .collect(Collectors.joining(" "));
        
        // Reversing the final result using StringBuffer as required in the collision
        StringBuffer sb = new StringBuffer(repeated);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        // Lambda to invoke the function as required
        Function<String, String> echoFunction = MysteriousEcho::echoCollision;
        
        String st = "Hola Mundo";
        System.out.println("Original: " + st);
        System.out.println("Result (Collision): " + echoFunction.apply(st));
    }
}