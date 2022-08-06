package session3;

public class Author {

    private String name;
    private String birth;
    private String phone;
    private String address;

    public Author(String name, String birth, String phone, String address) {
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.address = address;
    }

    public void print() {
        System.out.println(String.format("----Author_%s : %s","Name" , name));
        System.out.println(String.format("----Author_%s : %s","Birth" , birth));
        System.out.println(String.format("----Author_%s : %s","Phone" , phone));
        System.out.println(String.format("----Author_%s : %s","Adress" , address));
    }
}
