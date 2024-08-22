import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = text.trim().split(" ");
        boolean condition = false;
        for (String word : words){
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    System.out.println(word);
                    condition = true;
                    break;
                }
            }
        }
        if (!condition){
            System.out.println("no such a word");
        }
    }
}
//metn daxil edilimis metnde sozler bosluq simvolu ile ayrilmisdir,
// netice olaraq qosa herfli sozleri ekrana cixarmaq lazimdir ( for mutleqdi ).