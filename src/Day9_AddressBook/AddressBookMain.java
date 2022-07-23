package Day9_AddressBook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> ContactsArrayList = new ArrayList<>();
    static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();
    static AddressBookMain details = new AddressBookMain();
    static boolean flag = true;

    public void Address() {
        Contacts contact = new Contacts();
        System.out.println("******* New Contact *******");
        System.out.print("First Name    : ");
        contact.setFirstName(scanner.next());
        duplicasy(contact.getFirstName());
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
//        System.out.println(ContactsArrayList);
    }
    public void editContact() {

        System.out.println("Enter the first name of the contact you want to edit: ");
        String name = scanner.next();

        for (Contacts contacts : ContactsArrayList) {
            if (contacts.getFirstName().equals(name)) {
                System.out.print("Enter first name   : ");
                contacts.setFirstName(scanner.next());
                System.out.print("Enter Last name    : ");
                contacts.setLastName(scanner.next());
                System.out.print("Enter Address      : ");
                contacts.setAddress(scanner.next());
                System.out.print("Enter City       : ");
                contacts.setCity(scanner.next());
                System.out.print("Enter State      : ");
                contacts.setState(scanner.next());
                System.out.print("Enter Zip        : ");
                contacts.setZip(scanner.next());
                System.out.print("Enter Phone      : ");
                contacts.setPhoneNumber(scanner.next());
                System.out.print("Enter Email      : ");
                contacts.setEmail(scanner.next());
                System.out.print("Contact edited successfully!");
//                System.out.println(ContactsArrayList);
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
                System.out.println("List After deletion \n" + ContactsArrayList);

            } else {
                System.out.println("The contact with first name : " + dname + " is not found!");
            }
        }
    }
    public void duplicasy(String firstName){
        for (Contacts contacts : ContactsArrayList) {
            String contactName = contacts.getFirstName();
            if (firstName.equals(contactName)) {
                System.out.println("This Person is Already Present");
                Address();
            }
        }
    }
    public void display(){
        System.out.println(ContactsArrayList);
    }

    public void createAddressBook() {

        while (flag) {
            System.out.println("What do you want to do: ");
            System.out.print("1.Create new address book\n2.Edit existing address book\n3.Display all address books\n4.Exit : ");
            int choose = scanner.nextInt();
            boolean k = true;
            switch (choose) {
                case 1 -> {
                    System.out.print("Enter the name of address book: ");
                    String address_name = scanner.next();
                    if (hashmap.containsKey(address_name)) {
                        System.out.println("Address book name exits, Enter different name");
                        break;
                    }
                    ContactsArrayList = new ArrayList<>();

                    while (k) {
                        System.out.println("What do you want to do: ");
                        System.out.print("1.Add details\n2.Edit details\n3.Delete contact\n4.Display Contact\n5.Exit : ");
                        int choose1 = scanner.nextInt();

                        switch (choose1) {
                            case 1 -> details.Address();
                            case 2 -> details.editContact();
                            case 3 -> details.deleteContact();
                            case 4 -> details.display();
                            case 5 -> {
                                System.out.println("Thank You!");
                                k = false;
                            }
                            default -> System.out.println("Choose valid option");
                        }
                        hashmap.put(address_name, ContactsArrayList);
//                        System.out.println(hashmap);
                    }
                }
                case 2 -> {
                    System.out.println("Enter the name of address book: ");
                    String address_name_old = scanner.next();
                    if (hashmap.containsKey(address_name_old)) {

                        ContactsArrayList = new ArrayList<>();
                        ContactsArrayList = hashmap.get(address_name_old);
                        boolean j = true;
                        while (j) {
                            System.out.println("What do you want to do: ");
                            System.out.print("1.Add details\n2.Edit details\n3.Delete contact\n4.Display contact\n5.Exit : ");
                            int choose1 = scanner.nextInt();

                            switch (choose1) {
                                case 1 -> details.Address();
                                case 2 -> details.editContact();
                                case 3 -> details.deleteContact();
                                case 4 -> details.display();
                                case 5 -> {
                                    System.out.println("Thank you!");
                                    j = false;
                                }
                                default -> System.out.println("Choose valid option");
                            }
                            hashmap.put(address_name_old, ContactsArrayList);
                            System.out.println(hashmap);
                        }
                        flag = false;
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                }
                case 3 -> {
                    System.out.println(hashmap);
                    System.out.println();
                }
                case 4 -> {
                        System.out.println("Thank You!");
                        flag = false;
                }
                default -> System.out.println("Enter valid option");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to Address Book Program *****");
        details.createAddressBook();
    }
}