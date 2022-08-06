package session6.Exception;

import java.util.ArrayList;

public class RunException {

    public static void main(String[] args) {
        SomeException someException = new SomeException();
//        someException.builtInException("vavava");
//        someException.nullPointException(null,"test");
//        someException.numberFormatException("1234s");
        //someException.arithmeticException(4,0);

        ArrayList<String> listString = new ArrayList<>();
        listString.add("assv1232");
        listString.add("1232");
        listString.add("12124");
        //var listInt: ArrayList<Integer> = someException.convert(listString);
    }
}
