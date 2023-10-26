// Write a Java program to find the index of a value in a sorted array.
// If the value does not find return the index where it would be if it were inserted in order.
// Example:
// [1, 2, 4, 5, 6] 5(target) -> 3(index)
// [1, 2, 4, 5, 6] 0(target) -> 0(index)
// [1, 2, 4, 5, 6] 7(target) -> 5(index)
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};

        searchIndex(array, 5);
        searchIndex(array, 0);
        searchIndex(array, 7);
    }

    private static void searchIndex(int[] array, int searchNumber) {
        int searchIndex = -1;
        int previousIndex = -1;
        int resultIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                searchIndex = i;
            } else if (array[i] > searchNumber && previousIndex == -1) {
                previousIndex = i == 0 ? 0 : i - 1;
            }
        }
        previousIndex = searchIndex == -1 && previousIndex == -1 ? array.length : previousIndex;
        resultIndex = previousIndex == -1 ? searchIndex : previousIndex;

        System.out.printf("%d(target) -> %d(index)" + System.lineSeparator(), searchNumber, resultIndex);
    }
}