package session7;

import session5.Student;

import java.util.HashMap;
import java.util.Map;

public class DemoMapHashMap {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "one");
        myMap.put(2, "two");

//        var data : Map<String, Student> dataa = demoMapStudent();
//        var student : Student = getDataInMap(data);

        System.out.println("demo");

        Map<String, String> capital = capitalList();
        demoForLoopMapKey(capital);
        demoForLoopMapValue(capital);

        // get size
        int size = capital.size();

        // check map empty?
        boolean isEmpty = capital.isEmpty();

        // remove all items on map
        capital.clear();
    }

    public static Map<String, String> capitalList() {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("UK","London");
        capitals.put("VN","HN");
        capitals.put("US","NYC");

        return capitals;
    }

    public static Map<String, Student> demoMapStudent() {
        Map<String, session5.Student> students = new HashMap<>();

        session5.Student thanhStudent = new session5.Student("SV-001",
                "vinh","1246CVDD");
        session5.Student vinhStudent = new session5.Student("SV-002",
                "HUU VINH","1246dd");

        students.put(thanhStudent.getId(), thanhStudent);
        students.put(vinhStudent.getId(), vinhStudent);

        return students;
    }

    public static Student getDataInMap(Map<String, Student> students) {
        // lay value dua tren key
        Student temp = students.get("SV-001");
        return temp;
    }

    // lay gia tri theo key
    public static void demoForLoopMapKey(Map<String, String> capitalList) {
        for (String key : capitalList.keySet()) {
            String value = capitalList.get(key);
        }
    }

    // lay gia tri theo value
    public static void demoForLoopMapValue(Map<String, String> capitalList) {
        for (String value : capitalList.values()) {
            System.out.println(value);
        }
    }
}
