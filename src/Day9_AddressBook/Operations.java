package Day9_AddressBook;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {
    static ArrayList<Contacts> contactDetails = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();
    public static void AddressBook(Operations operations) {
        int select;
        do {
            System.out.println("""
                    Select the Choice:
                    1. Add Address Book\s
                    2. Search Contact by State
                    3. Search Contact by City
                    4. Count by City
                    5. Count by State
                    6. Sorted Contacts
                    7. exit""");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int selection;
                    do {
                        System.out.println("Enter Name For Address Book");
                        String AddressBookName = sc.next();
//                contactsDetails.add(AddressBookName);
                        if (hashmap.containsKey(AddressBookName)) {
                            System.out.println("The AddressBook already contains");
                            break;
                        } else {
                            ArrayList<Contacts> contactDetails1 = new ArrayList<>();
                            menuChoose(operations, contactDetails1);
                            hashmap.put(AddressBookName,contactDetails1);
                        }
                        System.out.println("AddressBook Added" + hashmap + " ");
                        System.out.println("""
                                1. Add New Address Book\s
                                2. Search Contact by State
                                3. Search Contact by City
                                4. Count by City
                                5. Count by State
                                6. Sorted Contacts\s
                                7. exit""");
                        selection = sc.nextInt();
                    } while (selection == 1);
                case 2:
                    searchByState();
                    break;
                case 3:
                    searchByCity();
                    break;
                case 4:
                    countByCity();
                    break;
                case 5:
                    countByState();
                    break;
                case 6:
                    System.out.println("Sorted Contacts Alphabetically:");
                    sortConatct(hashmap);
                    break;
                default:
            }
            select = sc.nextInt();
        }while (select == 1);

    }
//    private static List<Contacts> SearchInMultipleBook(String name) {
//        for (Map.Entry<String, ArrayList<Contacts>> entry : hashmap.entrySet()) {
//            for (Contacts contacts : entry.getValue()) {
//                if (contacts.getCity().equals(name) || contacts.getState().equals(name)) {
//                    System.out.println("\nAddress Book Name :" + entry.getKey());
//                    System.out.println("First Name :" + contacts.getFirstName());
//                    System.out.println("Last Name :" + contacts.getLastName());
//                    System.out.println("Email-ID :" + contacts.getEmail());
//                    System.out.println("Address :" + contacts.getAddress());
//                    System.out.println("City Name :" + contacts.getCity());
//                    System.out.println("Contact Number :" + contacts.getContactNo());
//                }
//            }
//        }
//        System.out.printf("No record found:");
//        return null;
//    }
    //Using Java Stream
    public static void searchByCity() {
        System.out.println("Enter city Name:");
        String city = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(System.out::println);
    }
    public static void searchByState() {
        System.out.println("Enter State Name:");
        String state = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(System.out::println);
    }
    public static void countByCity() {
        System.out.println("Enter the city Name:");
        String city = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(System.out::println);
        long count = contactDetails.stream().filter(n -> n.getCity().equalsIgnoreCase(city)).count();
        System.out.println("Total number of Persons in city " + city + ":" + count);
    }
    public static void countByState() {
        System.out.println("Enter the State Name:");
        String state = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(System.out::println);
        long count = contactDetails.stream().filter(n -> n.getState().equalsIgnoreCase(state)).count();
        System.out.println("Total number of Persons in city " + state + ":" + count);
    }
    public static void sortConatct(HashMap<String, ArrayList<Contacts>> multipleAddressBook) {
        for(Map.Entry<String,ArrayList<Contacts>> personSorted : multipleAddressBook.entrySet()){
            List<Contacts> sortedContacts;
            sortedContacts = personSorted.getValue().stream().sorted(Comparator.comparing(contacts -> contacts.getFirstName() + contacts.getLastName())).collect(Collectors.toList());
            System.out.println("Sorted Contacts By Name : ");
            for (Contacts item : sortedContacts){
                System.out.println(item.toString());
            }
        }
    }

    public static void addDetails(ArrayList<Contacts> contactsDetails) {
        Contacts info = new Contacts();
        if (contactsDetails.size() == 0) {
            System.out.println("Enter the First Name");
            info.setFirstName(sc.next());
            System.out.println("Enter the Last Name");
            info.setLastName(sc.next());
            System.out.println("Enter the Address");
            info.setAddress(sc.next());
            System.out.println("Enter the city");
            info.setCity(sc.next());
            System.out.println("Enter the State");
            info.setState(sc.next());
            System.out.println("Enter the your zip Code");
            info.setZip(sc.next());
            System.out.println("Enter the Contact Number");
            info.setContactNo(sc.next());
            System.out.println("Enter the Email Id");
            info.setEmail(sc.next());
            contactsDetails.add(info);
            System.out.println("Contact details added");
        }
        else {
            System.out.println("Enter first name");
            String firstName = sc.next();

            for (Contacts contacts : contactsDetails) {
                if (contacts.getFirstName().equals(firstName)) {
                    System.out.println("The Name is already present.");
                    Operations.addDetails(contactsDetails);
                }
            }
            System.out.println("Re-enter first name");
            info.setFirstName(sc.next());
            System.out.println("Enter Last Name");
            info.setLastName(sc.next());
            System.out.println("Enter contact Number:");
            info.setContactNo(sc.next());
            System.out.println("Enter Email: ");
            info.setEmail(sc.next());
            System.out.println("Enter Address: ");
            info.setAddress(sc.next());
            System.out.println("Enter City Name: ");
            info.setCity(sc.next());
            System.out.println("Enter State: ");
            info.setState(sc.next());
            System.out.println("Enter Zip Code:");
            info.setZip(sc.next());
            contactsDetails.add(info);
        }
    }
    public void displayContacts(ArrayList<Contacts> contactDetails) {
        for (Contacts contactDetailsValue : contactDetails) {
            System.out.println(contactDetailsValue);
            System.out.println("---------------------------");
        }
    }

    public void editDetails() {
        System.out.println("Enter the first name you want to edit ");
        String searchFirstName = sc.next();
        for (Contacts contact : Operations.contactDetails) {
            String name = contact.getFirstName();
            System.out.println(name);
            if (name.equals(searchFirstName)) {
                System.out.println("""
                        1. First Name\s
                        2. Last Name\s
                        3. Address\s
                        4. City\s
                        5. State\s
                        6. Zip Code\s
                        7. Contact No\s
                        8. Email""");
                System.out.println("Enter value to update: ");
                int num = sc.nextInt();
                switch (num) {
                    case 1 -> {
                        System.out.println("Enter the first name You want to update");
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                    }

                    case 2 -> {
                        System.out.println("Enter the Last NAme You want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                    }
                    case 3 -> {
                        System.out.println("Enter the Address You want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                    }
                    case 4 -> {
                        System.out.println("Enter the City You want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                    }
                    case 5 -> {
                        System.out.println("Enter the State You want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                    }
                    case 6 -> {
                        System.out.println("Enter the Zip code You want to update");
                        String updatedZipCode = sc.next();
                        contact.setZip(updatedZipCode);
                    }
                    case 7 -> {
                        System.out.println("Enter the Contact numberYou want to update");
                        String updatedContact = sc.next();
                        contact.setContactNo(updatedContact);
                    }
                    case 8 -> {
                        System.out.println("Enter the email You want to update");
                        String updatedEmail = sc.next();
                        contact.setEmail(updatedEmail);
                    }
                    default -> System.out.println("Invalid number!");
                }
                System.out.println("details updated");
            } else
                System.out.println("No record found!");
        }
    }
    public void deleteContact() {
        System.out.println("Enter First Name for which you want to delete contact: ");
        String firstname = sc.next();
        Iterator<Contacts> removeContact = Operations.contactDetails.iterator();

        while (removeContact.hasNext()) {
            Contacts nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            } else {
                System.out.println("Contact not found.");
            }
        }
    }
    public static void menuChoose(Operations operations, ArrayList<Contacts> contactDetails){
        Scanner sc = new Scanner(System.in);
        int chooseNumber;
        do {
            System.out.println("Enter the number that you want to choose to perform the certain task");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber) {
                case 1 -> {
                    System.out.println("Add Details");
                    addDetails(contactDetails);
                }
                case 2 -> {
                    System.out.println("Edit details");
                    operations.editDetails();
                }
                case 3 -> {
                    System.out.println("Delete Details");
                    operations.deleteContact();
                }
                case 4 -> {
                    System.out.println("Display details");
                    operations.displayContacts(contactDetails);
                }
                case 5 -> System.out.println("Exit");
                default -> System.out.println("invalid Option choose");
            }
        }while (chooseNumber != 5 );
    }
}