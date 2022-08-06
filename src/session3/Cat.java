package session3;

public class Cat {

    // fields
    private String type;
    private byte age;
    private String color;
    private String original;
    private String name;

    // constructor
    public Cat() {

    }

    public Cat(String name) {

        this.name = name;
    }

    public Cat(String type, byte age, String color, String original, String name) {
        this.type = type;
        this.age = age;
        this.color = color;
        this.original = original;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void printInfo() {
        System.out.println("Name "+name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
