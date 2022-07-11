package Day9_AddressBook;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> ContactsArrayList = new ArrayList<Contacts>();
    public void Address() {
        Contacts contact = new Contacts();
        System.out.println("******* New Contact *******");
        System.out.print("First Name    : ");
        contact.setFirstName(scanner.next());
        System.out.print("Last Name     : ");
        contact.setLastName(scanner.next());
        System.out.print("Address       : ");
        contact.setAddress(scanner.next());
        System.out.print("City Name     : ");
        contact.setCity(scanner.next());
        System.out.print("State Name    : ");
        contact.setState(scanner.next());
        System.out.print("Zip Code      : ");
        contact.setZip(scanner.next());
        System.out.print("Phone NO      : ");
        contact.setPhoneNumber(scanner.next());
        System.out.print("Email Id      : ");
        contact.setEmail(scanner.next());
        ContactsArrayList.add(contact);
        System.out.println(ContactsArrayList);
    }

    public void editContact() {

        System.out.println("Enter the first name of the contact you want to edit: ");
        String name = scanner.next();

        for(int i = 0; i < ContactsArrayList.size(); i++){
            if (ContactsArrayList.get(i).getFirstName().equals(name)) {
                System.out.print("Enter first name   : ");
                ContactsArrayList.get(i).setFirstName(scanner.next());
                System.out.print("Enter Last name    : ");
                ContactsArrayList.get(i).setLastName(scanner.next());
                System.out.print("Enter Address      : ");
                ContactsArrayList.get(i).setAddress(scanner.next());
                System.out.println("Enter City       : ");
                ContactsArrayList.get(i).setCity(scanner.next());
                System.out.println("Enter State      : ");
                ContactsArrayList.get(i).setState(scanner.next());
                System.out.println("Enter Zip        : ");
                ContactsArrayList.get(i).setZip(scanner.next());
                System.out.println("Enter Phone      : ");
                ContactsArrayList.get(i).setPhoneNumber(scanner.next());
                System.out.println("Enter Email      : ");
                ContactsArrayList.get(i).setEmail(scanner.next());
                System.out.println("Contact edited successfully!");
                System.out.println(ContactsArrayList);
            } else
                System.out.println("The contact with first name : " + name + " is not found!");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the first name of the contact you want to edit: ");
        String dname = scanner.next();
        for (int i = 0; i < ContactsArrayList.size(); i++) {

            if (ContactsArrayList.get(i).getFirstName().equals(dname)) {
                ContactsArrayList.remove(i);
                System.out.println("List After deletion \n"+ContactsArrayList);

            } else {
                System.out.println("The contact with first name : " + dname + " is not found!");
            }
        }
    }
    public static void main (String[]args) {
        System.out.println("\nWelcome to Address Book\n");
        AddressBookMain bookMain = new AddressBookMain();
        bookMain.Address();
        int ans;
        do {
            System.out.println("\nEnter \n1.Add Contact \n2.Edit Contact \n 3.Delete Contact : ");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("How many contacts do you want to add: ");
                    int add = scanner.nextInt();
                    for (int i = 1; i <= add; i++) {
                        bookMain.Address();
                    }
                }
                case 2 -> bookMain.editContact();
                case 3 -> bookMain.deleteContact();
                default -> System.out.println("Thank You!!");
            }
            System.out.println("Do you want to continue?(0/1)");
            ans = scanner.nextInt();
        } while (ans == 1);
    }
}