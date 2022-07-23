package Day9_AddressBook;
import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Map<String, AddressBook> addressBookMap = new HashMap<>();

        while (true) {
            System.out.println("\nWelcome to Address Book System");
            System.out.println("1.New Address Book\n2.Select Address Book\n3.Delete Address Book\n4.Search Contact Data\n5.Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    addressBookMap.put(bookName, new AddressBook());
                    AddressBook.addressBookOptions(addressBookMap.get(bookName));
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    Set<String> keys = addressBookMap.keySet();
                    for (String key : keys) {
                        System.out.println(key);
                    }
                    System.out.print("Enter Address Book Name: ");
                    String name = sc.nextLine();
                    System.out.println("Current Address Book is : " + name);
                    AddressBook.addressBookOptions(addressBookMap.get(name));
                    break;
                case 3:
                    System.out.print("Enter Address Book Name: ");
                    name = sc.nextLine();
                    addressBookMap.remove(name);
                    break;
                case 4:
                    addressBook.searchByOptions();
                case 5:
                    AddressBook.viewByOption();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}