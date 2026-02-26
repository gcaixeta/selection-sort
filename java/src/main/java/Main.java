import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorting array with 10 elements.");
        System.out.println();
        sortArray(randomArrayGenerator(10, 0, 100));
        System.out.println("Sorting array with 100 elements.");
        System.out.println();
        sortArray(randomArrayGenerator(100, 0, 100));
        System.out.println("Sorting array with 1000 elements.");
        System.out.println();
        sortArray(randomArrayGenerator(1000, 0, 10000));
    }

    public static List<Integer> randomArrayGenerator(int size, int min, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int number = random.nextInt(max - min + 1) + min;
            list.add(number);
        }

        return list;
    }

    public static void sortArray(List<Integer> unsortedArray) {
        System.out.println("Unsorted array: " + unsortedArray);
        List<Integer> orderedArray = SelectionSort.sort(unsortedArray);
        System.out.println("Sorted array: " + orderedArray);
    }
}
