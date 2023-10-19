// Write a Java program to check if the value 20 appears three times and no 20's
// are next to each other in the array of integers.
public class Main {

    public static final int SPEC_NUMBER = 20;
    public static void main(String[] args) {
        System.out.println("Specified number: " + SPEC_NUMBER);

        int[] threeTimes = {20, 23, 20, 244, 20, 6};
        int[] twoTimes = {43, 10, 20, 244, 20, 6};
        int[] theTimesNextToEachOther = {20, 20, 3, 20, 54, 6};
        int[] zeroTime = {43, 23, 3, 5, 54, 6};

        System.out.printf("Result for threeTimes is %b \n", checkArray(threeTimes, SPEC_NUMBER));
        System.out.printf("Result for twoTimes is %b \n", checkArray(twoTimes, SPEC_NUMBER));
        System.out.printf("Result for theTimesNextToEachOther is %b \n", checkArray(theTimesNextToEachOther, SPEC_NUMBER));
        System.out.printf("Result for zeroTime is %b \n", checkArray(zeroTime, SPEC_NUMBER));
    }

    public static boolean checkArray(int[] array, int number) {
        int encounters = 0;
        for (int i = 0; i < array.length - 1; i++) {
            encounters = array[i] == number && array[i] != array[i+1] ? ++encounters: encounters;
        }
        return encounters == 3;
    }
}