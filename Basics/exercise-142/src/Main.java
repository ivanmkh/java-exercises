import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

// Write a Java program to check if two strings are anagrams or not.
// According to Wikipedia "An anagram is a word or phrase formed by
// rearranging the letters of a different word or phrase, typically
// using all the original letters exactly once.
// For example, the word anagram can be rearranged into nag a ram,
// or the word binary into brainy."
// Sample Output:
// String-1 : wxyz
// String-2 : zyxw
// Check if two given strings are anagrams or not?: true
public class Main {
    public static void main(String[] args) {
        System.out.print("String-1 : ");
        String string1 = new Scanner(System.in).nextLine();
        System.out.print("String-2 : ");
        String string2 = new Scanner(System.in).nextLine();

        ArrayList<Character> array1 = stringToSortedArray(string1);
        ArrayList<Character> array2 = stringToSortedArray(string2);
        System.out.printf("Check if two given strings are anagrams or not?: %b", compare(array1, array2));
    }

    public static ArrayList<Character> stringToSortedArray(String string){
        HashSet<Character> set = new HashSet<Character>();
        for(Character ch : string.toCharArray()){
            set.add(ch);
        }
        ArrayList<Character> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        return arrayList;
    }

    public static boolean compare(ArrayList<Character> array1, ArrayList<Character> array2) {
        return array1.equals(array2);
    }
}