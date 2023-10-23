// Write a Java program to check if an array of integers contains three increasing adjacent numbers.
public class Main {
    public static final int L = 2;

    public static void main(String[] args) {
        int[] array1 = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 11, 12, 78, 4, 78, 7, 8, 87, 6, 10, 9, 6, 89};
        int[] array2 = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 123, 12, 78, 4, 78, 7, 8, 87, 6, 10, 9, 6, 89};

        System.out.println("The result for array is: " + checkArray(array1));
        System.out.println("The result for array is: " + checkArray(array2));
    }

    public static boolean checkArray(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 2; i++) {
            if(array[i]+1 == array[i+1] && array[i]+2 == array[i + 2]){
                result = true;
            }
        }
        return result;
    }
}