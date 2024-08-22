import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = text.split(" ");
        String Vowels = "aeiuoAEIUO";
        if (Vowels.indexOf(text.charAt(0))!=-1 && Vowels.indexOf(text.charAt(text.length()-1))==-1){
                for (int i = 0; i< words.length/2;i++){
                    String temp = words[i];
                    words[i] = words[words.length - 1 -i];
                    words[words.length - 1 -i] = temp;
                }
                String ReversedText = String.join(" ", words);
                System.out.println(ReversedText);
        }else {
            System.out.println("This text doesn't meet conditions");
        }
    }
}
//	Cümlə daxil edin. Əgər cümlə saitlə başlayıb,samitlə
//bitirsə cümlədə sözlərin yerini simmetrik
//dəyişin.(məsələn:saitlə başlayıb samitlə bitirsə 1-ci və 4-
//cü sözün ,2-ci ilə 3-cü sözün yerini dəyişin).