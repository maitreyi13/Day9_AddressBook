package Day9_AddressBook;
import java.util.Scanner;

public class AddressBookMain {
    public void Address() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("******* New Contact *******");
        System.out.print("First Name    : ");
        String first_name = scanner.nextLine();
        System.out.print("Last Name     : ");
        String last_name = scanner.nextLine();
        System.out.print("Address       : ");
        String address = scanner.nextLine();
        System.out.print("City Name     : ");
        String city = scanner.nextLine();
        System.out.print("State Name    : ");
        String state = scanner.nextLine();
        System.out.print("Zip Code      : ");
        int zip = scanner.nextInt();
        System.out.print("Phone NO      : ");
        String phone = scanner.next();
        System.out.print("Email Id      : ");
        String email = scanner.next();

        System.out.println("First Name    : "+first_name+"\nLast Name     : "+last_name+"\nAddress       : "+address+"\nCity Name     : "+city+"\nState Name    : "+state+"\nZip Code      : "+zip+"\nPhone NO      : "+phone+"\nEmail Id      : "+email);
        System.out.println();
    }
}
