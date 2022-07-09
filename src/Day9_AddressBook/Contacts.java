package Day9_AddressBook;
public class Contacts {
        String first_name ,last_name, address, city,state,zip,phone,email;

    public String getFirstName() {
        return first_name;
    }
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    public String getLastName() {
        return last_name;
    }
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phone;
    }
    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact :" +
                "\nFirst Name    : " + first_name  +
                ",\nLast Name     : " + last_name  +
                ",\nAddress       : " + address +
                ",\nCity          : " + city  +
                ",\nState         : " + state +
                ",\nZip Code      : " + zip +
                ",\nPhone Number  : " + phone  +
                ",\nEmail         : " + email;
    }
}