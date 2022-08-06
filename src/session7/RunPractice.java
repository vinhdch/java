package session7;

import java.util.ArrayList;
import java.util.Map;

import static session7.Practice.findingDuplicateNumber;

public class RunPractice {

    public static void main(String[] args) {
        Practice practice = new Practice();
        //System.out.println(practice.FindMomo("my name momo, momo."));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(100);
        arrayList.add(400);
        arrayList.add(200);
        findingDuplicateNumber(arrayList);

        Map<Integer, Integer> mapp = findingDuplicateNumber(arrayList);
        // 2 cach khai bao nay giong nhau
        // var  : Map<Integer, Integer> = practice.findingDuplicateNumber(arrayList);
        practice.printMap(mapp);
    }
}
