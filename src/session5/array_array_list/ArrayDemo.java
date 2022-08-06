package session5.array_array_list;

public class ArrayDemo {

    String[] countries = new String[3];

    public void initialize() {

        String[] countries = new String[3];
        double[] doubleArray = new double[5];
    }

    public void addValueArray() {
       // String[] countries = new String[3];

        // index: bat dau tu o
        countries[0] = "china";
        countries[1] = "us";
        countries[2] = "UK";
    }

    public void getValueArray() {
        // lay 1 gia tri
        String us = countries[1];

        // lay all gia tri for i
        for (int i = 0; i< countries.length; i++) {
            System.out.println(i);
        }

        // lay all gia tri for each
        for (String country : countries) {
            System.out.println(country);
        }
    }

    public int getLength() {
        return countries.length;
    }

    public void updateValue() {
        countries[1] = "Canada";
    }
}
