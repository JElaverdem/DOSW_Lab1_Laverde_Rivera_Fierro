import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.TreeSet;

public class Challenge5{
    // Organize the Hashset and filter it
    private static HashSet<Integer> CreationHash(){
        HashSet<Integer> h= new HashSet<>(List.of(4, 9, 15, 7, 18, 21, 10, 5));
        HashSet<Integer> result=h.stream()
                                .filter(n -> n%3!=0) //filters the numbers that are multiples of 3
                                .collect(Collectors.toCollection(HashSet::new));
        return result;
    }

    private static TreeSet<Integer> CreationTree(){
        TreeSet<Integer> tempTree = new TreeSet<>();
        Random ran = new Random();

        ran.ints(20, 0, 100).forEach(tempTree::add);

        TreeSet<Integer> finalTree = tempTree.stream()
                                            .filter(x -> x%5 != 0)
                                            .collect(Collectors.toCollection(TreeSet::new));

        return finalTree;
    }
    public static void main(String[] args){
        HashSet<Integer> finalHash = CreationHash();
        TreeSet<Integer> finalTree = CreationTree();

        finalHash.stream().forEach(finalTree::add);

        finalTree.stream().forEach(x -> System.out.println("Number in the arena:"+String.valueOf(x)));

    }
}