package Day9_AddressBook;

import java.util.Scanner;

public class Add_Contact {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many entries do you want in a book: ");
        int entries = sc.nextInt();

        for (int i=1; i<= entries; i++) {
            AddressBookMain person = new AddressBookMain();
            person.Address();
        }
    }
}
