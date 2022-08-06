package session6.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SomeException {

    public void builtInException(String path) {
        try {
            FileInputStream file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void nullPointException(String a, String b) {
        try {
            boolean result = a.equals(b);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void numberFormatException(String numberString) {
        try {
            int number = Integer.parseInt(numberString);
            System.out.println(numberString);
        } catch (NumberFormatException e) {
            System.out.println("chuoi nhap k phai so");
        }
    }

    public void arithmeticException(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("toan fail");
        }
    }

    // BT:
    public ArrayList<Integer> convert(ArrayList<String> listString) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String value : listString) {
            try {
                int tam = Integer.parseInt(value);
                result.add(tam);
            } catch (NumberFormatException e) {
                result.add(0);
            }
        }
        return result;
    }
}
