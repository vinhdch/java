package session7;

import java.util.*;

public class Practice {

    // where is momo
    // tim chu momo o vi tri bao nhieu trong cau
    // ex: my name is momo => vi tri = 11
    // hoi ky lai: neu k tim dc chu momo / neu cos 2 chu momo / phan biet hoa thuong hay k / null /.....

   public String FindMomo (String text) {
       String result = "momo is not exist";
       String[] array;
       try {
           array = text.split(" ");
       } catch (NullPointerException e) {
           return result;
       }
       for(int i =0; i < array.length;i++) {
           // equals => k filter dc text chua ky tu dac biet e.g "momo."
           if (array[i].toLowerCase().contains("momo")) {
                result = i +1 + "";
                // them dau "" de convert thanh string
                // +1 de cho vi tri chu momo giong nhu bt vi trong code i bat dau to 0
           }
       }
       return result;
   }

   public void check1 () {
       Scanner S = new Scanner(System.in);
       System.out.println("Enter a value: ");
       int x = S.nextInt();
       if (x > 0) {
           System.out.println("The value is positive");
       } else {
           if (x < 0) {
               System.out.println("The value is negative");
           } else {
               System.out.println("The value is zero");
           }
       }
       System.out.println("Bye!");
    }
    /*
    viet 1 function co bao nhieu so bi trung torng 1 Array<Integer> theo dang ben duoi
    ArrayList<Integer> number = {100,300,100,300,400,300,200,500,500};
     */

    public static Map<Integer, Integer> findingDuplicateNumber(ArrayList<Integer> listNumber) {
        Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for (int number : listNumber) {
            // containsKey => kiem tra su ton tai cua 1 gia tri trong Map
            if (resultMap.containsKey(number)) {
                int value = resultMap.get(number) + 1;
                resultMap.put(number,value);
            } else {
                resultMap.put(number,1);
            }
        }
        return  resultMap;
    }

    public void printMap(Map<Integer, Integer> map) {
        for (int key : map.keySet()) {
            String message = String.format("Co %d so %d,", map.get(key), key);
            System.out.println(message);
        }
    }
 }
