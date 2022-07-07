package Day9_AddressBook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class AddressBookMain {
   static Scanner scanner = new Scanner(System.in);
    List <Contacts> ContactsArrayList = new ArrayList<>();
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
//        System.out.println("First Name    : "+first_name+"\nLast Name     : "+last_name+"\nAddress       : "+address+"\nCity Name     : "+city+"\nState Name    : "+state+"\nZip Code      : "+zip+"\nPhone NO      : "+phone+"\nEmail Id      : "+email);

        ContactsArrayList.add(contact);
        System.out.println(contact.toString());
    }

    public void editContact()
    {
        System.out.println("Enter the first name of the contact you want to edit: ");
        String firstName = scanner.next();
        boolean flag = false;
        for (Contacts contact : ContactsArrayList) {

            if (firstName.equals(contact.getFirstName())) {
                System.out.print("Enter new name: ");
                String name = scanner.next();
                contact.setFirstName(name);
                System.out.println("Contact edited successfully!");
                flag = true;
                break;
            }
        }
        System.out.print(ContactsArrayList);
        if (!flag) {
            System.out.println("The contact with first name : " + firstName + " is not found!");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("\nWelcome to Address Book\n");
        AddressBookMain addressbook = new AddressBookMain();
        addressbook.Address();
        System.out.println("Do you want to add contacts y/n");
        String status =scanner.next();
        if((status.equals("y"))) {
            addressbook.Address();
        } else {
            System.out.println("Thank you!");
        }
        System.out.println("Do you want to edit contacts y/n");
        String edit = scanner.next();
        if ((edit.equals("y"))){
            addressbook.editContact();
        }else
            System.out.println("Thank You!!");
    }
}
