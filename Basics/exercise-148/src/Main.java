import java.util.HashSet;

// Write a Java program to find the index of the first unique character in a given string.
// Assume that there is at least one unique character in the string.
// Sample Output:
// Original String: wresource
// First unique character of the above: 0
public class Main {
    public static void main(String[] args) {
        String string1 = "wresource";
        String string2 = "wekrewk";
        System.out.printf("First unique character of \"%s\" has index %d\n", string1, getFirstUnique(string1));
        System.out.printf("First unique character of \"%s\" has index %d\n", string2, getFirstUnique(string2));
    }

    private static int getFirstUnique(String originalString) {
        // remove repeated characters
        HashSet<Character> repeated = new HashSet<>();
        for (int i = 0; i < originalString.length(); i++) {
            for (int j = i + 1; j < originalString.length(); j++) {
                if (originalString.charAt(i) == originalString.charAt(j)) {
                    repeated.add(originalString.charAt(i));
                }
            }
        }
        StringBuilder uniqueOnly = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            if (!repeated.contains(originalString.charAt(i))) {
                uniqueOnly.append(originalString.charAt(i));
            }
        }
        // take first one's index in the original string
        return originalString.indexOf(uniqueOnly.toString().charAt(0));
    }
}