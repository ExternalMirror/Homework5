import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter university name: ");
        String university = scanner.nextLine();
        System.out.print("Enter metro station name: ");
        String metro = scanner.nextLine();
        System.out.print("Enter street name: ");
        String street = scanner.nextLine();
        String Sentence = university.concat(" ").concat(metro).concat(" metrosunda ").concat(street).concat(" küçəsində yerlesir");
        System.out.println(Sentence);

        scanner.close();
    }
}


//        StringBuilder Text = new StringBuilder("[Universitet] [metro] metrosunda [küçə] küçəsində yerləşir");

//[Unversitet] [metro] metrosunda [küçə] küçəsində
// yerləşir.Cümləsində [Unversitet] [metro] və [küçə] sözlərini
// uyğun unversitet,metro və küçə adları ilə  əvəz edin.