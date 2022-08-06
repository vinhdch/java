package session6.Inherit;

public class Employee extends Person{
    private String company;
    private byte age = 20;

    public Employee(String fullname, String address, String phone, String company) {
        super(fullname, address, phone);
        this.company = company;
    }

    public void usingSupperKeyword() {
        System.out.println(super.fullname); // neu k trung bien thi co the bo 'supper'
    }

    public void getVariableType() {

        byte age = 10; // local
        System.out.println(age); // local
        System.out.println(this.age); // instance
        System.out.println(super.age); // parent class
    }

    public void printEmployee() {
        print();
        System.out.println(company);
        System.out.println(age);
    }
}
