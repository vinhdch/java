package session8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Practice {

    public float findSquare() {
        float number = 9.9f;
        float square = number * number;

        //Math.pow(number,2);
        return square;
    }

    public void plus2DiffTypeVariable() {
        int numberInt = 5;
        double numberDouble = 10.2;

        double result = numberDouble + numberInt;
        System.out.println(result);
    }

    public String removeSpecialCharacter(String specialCharacter) {
        // \\W = [^a-zA-Z0-9]
        // dau ^ co y nghia la nguoc lai
        String text = specialCharacter.replaceAll("\\W","");
        return text;
    }

    public void removeSpecialChar() {
//        String str= "This#string%contains^special*characters&.";
//        str = str.replaceAll("[^a-zA-Z0-9]", " ");
    }

    public ArrayList<String> joinArrayList(ArrayList<String> a, ArrayList<String> b) {
        a.addAll(b);
        return a;
    }

    public boolean checkArrayList(ArrayList<String> a) {
//        if (a == null || a.isEmpty()) {
//            return true;
//        }
//        return false;

        return a == null || a.isEmpty();
    }

    public boolean compare2ArrayList(ArrayList<String> a, ArrayList<String> b) {
        if (a != null) {
            return a.equals(b);
        } else if (b == null) {
            return true;
        }
        return false;
    }

    public Properties loadFileProperties() {
        String path = "C:/Users/vinhdong/Downloads/student.properties";
        try {
            InputStream inputStream = new FileInputStream(path);
            Properties properties = new Properties();

            properties.load(inputStream);

            return loadFileProperties();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Map<String, String> coverPropertiesToMap(Properties properties) {
        Map<String, String> map = new HashMap<>();
        for (Object key : properties.keySet()) {
            String value = (String) properties.get(key);
            map.put(key.toString(), value);
        }
        return map;
    }

    public void printMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("key: " + key);
            System.out.println("value: " + map.get(key));
        }
    }
}
