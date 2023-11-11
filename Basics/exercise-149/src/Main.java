import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to check if a given string is a permutation of another given string.
public class Main {
    public static void main(String[] args) {
        String string1 = "xxyz";
        String string2 = "yxzx";
        System.out.println("The result is: " + isPermutation(string1, string2));
    }
    public static boolean isPermutation(String original, String checkString) {
        ArrayList<Character> originalList = stringToList(original);
        ArrayList<Character> checkList = stringToList(checkString);
        Collections.sort(originalList);
        Collections.sort(checkList);

        return originalList.equals(checkList);
    }

    public static ArrayList<Character> stringToList(String string){
        ArrayList<Character> list = new ArrayList<>();
        for (char ch: string.toCharArray()){
            list.add(ch);
        }
        return list;
    }
}