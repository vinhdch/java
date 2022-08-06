package session3;

public class Books {

    private String title;
    private String type;
    private int qualityOnStrore;
    private String name;
    private String original;
    private float price;
    private int total;
    private Author author;

    public Books(String title, String type, float price, int total, Author author) {
        this.title = title;
        this.type = type;
        this.price = price;
        this.total = total;
        this.author = author;
    }

    public void print() {
        System.out.println(String.format("Book_%s : %s","Title" , title));
        System.out.println(String.format("Book_%s : %s","Type" , type));
        System.out.println(String.format("Book_%s : %s","Price" , price));
        System.out.println(String.format("Book_%s : %s","Total" , total));
        author.print();
    }

    public void setBooks() {
        this.type = type;
        this.qualityOnStrore = qualityOnStrore;
        this.name = name;
        this.original = original;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.name = type;
    }

    // <modified> <datatype> methodName (param) => bat buoc phai có return => param nen <3
    public int add (int a, int b) {
        return a+ b;
    }


//    public void print() {
//        System.out.println(String.format("Book_%s : %s","Title", title));
//        author.print;
//    }

    public double totalPrice() {
        return price*total;
    }
}
