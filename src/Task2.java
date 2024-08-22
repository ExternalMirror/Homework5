import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        String MaxConsonantWord="";
        int MaxConsonantCount = 0;
        int TotalConsonantCount = 0;
        int TotalIndexConsonantCount = 0;
//        char[] vowels = {'a','e','i','o','u','A','E','I','O'}
        for (String word : words){
            int ConsonantCount = 0;
            for (int i = 0; i<word.length();i++){
                char CurrentChar = word.charAt(i);
                if ((CurrentChar >= 'A' && CurrentChar <= 'Z') || (CurrentChar >= 'a' && CurrentChar <= 'z')){
                    char LowerCaseCurrent = Character.toLowerCase(CurrentChar);
                    if (!(LowerCaseCurrent == 'a' || LowerCaseCurrent == 'e' ||
                            LowerCaseCurrent == 'i' || LowerCaseCurrent == 'o' || LowerCaseCurrent == 'u')){
                        ConsonantCount++;
                        TotalIndexConsonantCount+=i;
                    }
                }
            }

            if (ConsonantCount>MaxConsonantCount){
                MaxConsonantCount = ConsonantCount;
                MaxConsonantWord = word;
            } else if (ConsonantCount == MaxConsonantCount) {
                MaxConsonantWord+=","+word;
            }
            TotalConsonantCount+=ConsonantCount;
        }
        System.out.println("Total amount of consonant is "+TotalConsonantCount);
        System.out.println("Total amount of index of consonant is "+TotalIndexConsonantCount);
        System.out.println("Word with most consonant is "+ MaxConsonantWord);
        System.out.println("Amount of consonants in word with most consonant is "+MaxConsonantCount);
    }
}
//Her hansi bir cumle daxil edilecek.Hemin cumlede olan
// samitlerin sayini tapmaq teleb olunur.Ve hemin samitlerin
// yerlesdiyi index-lerin cemini tapmaq teleb olunur.
//Daxil edilmis cumlede daha cox samit olan soz cap edilsin
// ve oradaki samitlerin sayi cap edilsin.
//