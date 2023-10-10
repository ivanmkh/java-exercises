// Write a Java program to insert a word in the middle of another string.
// Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
public class Main {
    public static void main(String[] args) {
        String text = "Python 3.0";
        String[] words = text.split("[ ]+");
        StringBuilder sb = new StringBuilder();
        int middleOfTheText = words.length / 2;
        for (int i = 0; i < middleOfTheText; i++) {
            sb.append(words[i] + " ");
        }
        sb.append("Tutorial ");
        for (int i = middleOfTheText; i < words.length; i++) {
            sb.append(words[i] + " ");
        }
        System.out.printf("Output: %s", sb);
    }
}