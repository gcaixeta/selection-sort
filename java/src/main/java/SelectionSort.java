import java.util.List;

public class SelectionSort {

    public static List<Integer> sort(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            int indexOfSmallest = findIndexOfSmallest(array, i);
            int smallestValue = array.get(indexOfSmallest);
            int aux = array.get(i);
            array.set(i, smallestValue);
            array.set(indexOfSmallest, aux);
        }
        return array;
    }


    public static int findIndexOfSmallest(List<Integer> array, int startingIndex) {
        int smallestIndex = startingIndex;
        int smallestValue = array.get(0);
        for (int i = startingIndex; i < array.size(); i++) {
            if (array.get(i) < array.get(smallestIndex)) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
