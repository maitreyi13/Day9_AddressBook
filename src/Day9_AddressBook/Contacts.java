package Day9_AddressBook;

import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many entries do you want in a book: ");
        int entries = sc.nextInt();

        AddressBookMain person = new AddressBookMain();
        for (int i = 1; entries >= i; i++) person.Address();

        System.out.print("Enter 1 to Edit\n Enter 2 to Delete :\n");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                System.out.print("Please enter name you want to edit: ");
                String editname = sc.next();
                add.search(name);
                break;
            case 2:
                System.out.print("Please enter name you want to edit: ");
                String deletename = sc.next();
                add.search(name);
                add.remove(name);
                break;
        }
    }
}
