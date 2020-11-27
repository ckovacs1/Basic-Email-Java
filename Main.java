
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner first = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String nameFirst = first.nextLine();

        System.out.println("Enter the last name: ");
        String nameLast  = first.nextLine();

        System.out.println("Enter the email domain: ");
        String domain = first.nextLine();

        System.out.println("Enter the ID number: ");
        int idNum = first.nextInt();

        System.out.println("The generated email is:");

        Email email = new Email(nameFirst, nameLast, idNum, domain);
        System.out.println(email.generateEmail());

    }
}
