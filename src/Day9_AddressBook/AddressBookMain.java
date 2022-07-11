package Day9_AddressBook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
   static Scanner scanner = new Scanner(System.in);
    List<Contacts> ContactsArrayList = new ArrayList<>();
    public void Address() {
        Contacts contact = new Contacts();
        System.out.println("******* New Contact *******");
        System.out.print("First Name    : ");
        String first_name = scanner.nextLine();
        contact.setFirstName(first_name);
        System.out.print("Last Name     : ");
        String last_name = scanner.nextLine();
        contact.setLastName(last_name);
        System.out.print("Address       : ");
        String address = scanner.nextLine();
        contact.setAddress(address);
        System.out.print("City Name     : ");
        String city = scanner.nextLine();
        contact.setCity(city);
        System.out.print("State Name    : ");
        String state = scanner.nextLine();
        contact.setState(state);
        System.out.print("Zip Code      : ");
        String zip = scanner.next();
        contact.setZip(zip);
        System.out.print("Phone NO      : ");
        String phone = scanner.next();
        contact.setPhoneNumber(phone);
        System.out.print("Email Id      : ");
        String email = scanner.next();
        contact.setEmail(email);
        System.out.println("First Name    : "+first_name+"\nLast Name     : "+last_name+"\nAddress       : "+address+"\nCity Name     : "+city+"\nState Name    : "+state+"\nZip Code      : "+zip+"\nPhone NO      : "+phone+"\nEmail Id      : "+email);
    }
    public void editContact() {
        System.out.println("Enter the first name of the contact you want to edit: ");
        String name = scanner.next();
        for (int i = 0; i < ContactsArrayList.size(); i++) {
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
            }   else
        System.out.println("The contact with first name : " + name + " is not found!");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the first name of the contact you want to edit: ");
        String dname = scanner.next();
        for (int i = 0; i < ContactsArrayList.size(); i++) {

            if (ContactsArrayList.get(i).getFirstName().equals(dname)) {
                ContactsArrayList.remove(i);
                System.out.println("List After removing"+ContactsArrayList);

            } else {
                System.out.println("The contact with first name : " + dname + " is not found!");
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book");
        AddressBookMain bookMain = new AddressBookMain();
        bookMain.Address();
        System.out.println("\nEnter \n1.Add Contact \n2.Edit Contact \n3.Delete Contact : ");
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

    }
}
