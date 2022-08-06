package session6.Inherit;

public class Person {
    public String fullname;
    private String address;
    private String phone;
    public byte age = 30;

    public Person(String fullname, String address, String phone) {
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
    }

    private void privateMethod() {
        System.out.println(fullname);
        System.out.println(phone);
    }

    public void publicMethod() {
        System.out.println(fullname);
        System.out.println(phone);
        System.out.println(address);
    }

    public void print() {
        System.out.println(fullname);
        System.out.println(phone);
        System.out.println(address);
    }
}