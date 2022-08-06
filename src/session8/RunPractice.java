package session8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public class RunPractice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.add("test");
        list1.add("test");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("test");
        list2.add("test");

        boolean isCheck = practice.checkArrayList(list1);
        boolean isCheck2 = practice.checkArrayList(null);

        boolean compare = practice.compare2ArrayList(list1,list2);

        Properties properties = practice.loadFileProperties();
        Map<String, String> map = practice.coverPropertiesToMap(properties);
        practice.printMap(map);
    }
}
