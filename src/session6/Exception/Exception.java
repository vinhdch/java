package session6.Exception;

public class Exception {

    public static void main(String[] args) {
        try {
            int[] myArray = {1,2,3};
            int getValue = myArray[5];
            System.out.println();
            // Exception => bao ham tat ca cac exception ben trong
        } catch (java.lang.Exception SOS) {
            System.out.println("bug");
        }
    }
}
