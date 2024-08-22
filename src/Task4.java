import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char CurrentChar = text.charAt(i);
            if (CurrentChar>='A' && CurrentChar<='Z'){
                result.append(Character.toLowerCase(CurrentChar));
            }else if (CurrentChar>='a' && CurrentChar<='z'){
                result.append(Character.toUpperCase(CurrentChar));
            }else {
                result.append(CurrentChar);
            }
        }
        System.out.println(result);
    }
}
//Cumle daxil edin.Daxil olunmush setirde kicik
// herfleri boyuk herfe, boyuk herfleri ise kicik herfe
// cevirmek teleb olunur.Meselen ,
//HelLO  Netice: hELlo
//            if (text.charAt(i)==' '){
//                continue;
//            }