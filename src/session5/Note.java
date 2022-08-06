package session5;

import java.util.ArrayList;

public class Note {

    public static void main(String[] args) {
        noteFunction();
    }
    public static void noteFunction () {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("us");
        countries.add("VN");
        countries.add("uk");

        ArrayList<String> countries2 = (ArrayList<String>) countries.clone();
        countries.add("Rance");
    }

    public static void print(ArrayList<String> values) {
        for (String value : values) {
            System.out.println(value);
        }
    }
}
