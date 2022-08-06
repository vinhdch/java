package session5.array_array_list;

import session3.Author;
import session3.Books;

import java.util.ArrayList;

public class ArraylistDemo {

    // List = ArrayList
    ArrayList<String> countries;

    public void initialize() {

        // co the khai bao <data type> o new array hoac k
        ArrayList<String> countries = new ArrayList<String>();
        ArrayList<Integer> intArrayList = new ArrayList<>();
    }

    // gan gia tri cho arrayList
    public void addValueArrayList() {
        //ArrayList<String> countries = new ArrayList<String>();
        countries.add("us");
        countries.add("VN");
        countries.add("uk");
    }

    //lay gia tri ra
    public void getValueArrayList() {
        // lay 1 gia tri
        String vn = countries.get(1);

        // lay all gia tri
        for (String country : countries) {
            System.out.println(country);
        }

        // lay all for i
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }

    // get do dai
    public int getSize() {
        return countries.size();
    }

    //update value trong array
    public void updateValue() {
        countries.set(2,"France");

        for (String country : countries) {
            System.out.println(country);
        }
    }

    // remove
    public void removeValue() {
        // remove theo index
        countries.remove(1);
        // remove theo object
        countries.remove("France");
    }

    // noi 2 array lai voi nhau
    public void joinArrayList() {
        ArrayList<String> countries= new ArrayList<>();
        countries.add("Sing");
        countries.add("Chile");
        countries.add("Brazil");

        this.countries.addAll(countries);
        print();
    }

    public void print() {
        for (String country : countries) {
            System.out.println(country);
        }
    }

    public void demoArrayListObject() {
        Author tacGia = new Author("tran van A","1990","123456789","123 cong hoa");

        // create book object
        Books java21days = new Books("Java21days","edu",25.7f,1000, tacGia);

        Books java7days = new Books("Java7days","edu",10.5f,2000,tacGia);

        ArrayList<Books> books = new ArrayList<>();
        books.add(java21days);
        books.add(java7days);

        for (Books book : books) {
            book.print();
        }

        double total =0;
        for (Books book : books) {
            total = total + book.totalPrice();
        }
    }

    //BT: dua tren array book, tinh tong tien cua cac cuon sach
}
