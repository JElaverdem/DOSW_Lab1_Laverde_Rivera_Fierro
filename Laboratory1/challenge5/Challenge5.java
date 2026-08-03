import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge5{
    // Organize the Hashset and filter it
    private static HashSet<Integer> CreationHash(){
        HashSet<Integer> h= new HashSet<>(List.of(4, 9, 15, 7, 18, 21, 10, 5));
        HashSet<Integer> result=h.stream()
                                .filter(n -> n%3!=0) //filters the numbers that are multiples of 3
                                .collect(Collectors.toCollection(HashSet::new));
        return result;
    }
    public static void main(String[] args){
        CreationHash();

    }
}