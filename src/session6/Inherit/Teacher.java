package session6.Inherit;

public class Teacher extends Person{
    private String school;
    private String dept_name;

    public Teacher(String fullname, String address, String phone, String school, String dept_name) {
        super(fullname, address, phone);
        this.school = school;
        this.dept_name = dept_name;
    }

    public void print() {
        System.out.println(school);
        System.out.println(dept_name);
        super.print();
    }
}
