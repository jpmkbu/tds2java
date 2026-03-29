public class Contact {
    String name;
    String firstName;
    String address;
    int phone;


    public Contact(String name, String firstName, String address, int phone) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getFullName() {
        return firstName + " " + name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }
}
