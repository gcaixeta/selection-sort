import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> unsortedArray = new ArrayList<>(List.of(4, 8, 2, 3, 1 ,6 ,129, 10));
        System.out.println("Unsorted array: " + unsortedArray);
        List<Integer> orderedArray = SelectionSort.sort(unsortedArray);
        System.out.println("Sorted array: " + orderedArray);
    }
}
