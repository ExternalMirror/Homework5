import java.util.Scanner;
public class Lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] sait = {"a","e","o","i","u"};
        String[] words = text.trim().split(" ");
        for (String currentWord : words) {
            char firstChar = currentWord.charAt(0);
            char lastChar = currentWord.charAt(currentWord.length() - 1);
            for (String s : sait) {
                if (firstChar == s.charAt(0) && lastChar == s.charAt(0)) {
                    System.out.println("Word '" + currentWord + "' has the same vowel at the start and end.");
                    break;
                }
            }
        }
    }
}
// daxil et metn, metn bosluq simvolu ile ayrilib, netice olaraq,
// ilk herfi son herfi eyn sait olan sozleri cixarin
