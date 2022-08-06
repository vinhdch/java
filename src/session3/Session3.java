package session3;

public class Session3 {

    public String getNumberInString(String text) {
        // input.replaceAll("[^0-9\\.]","")
        return text.replaceAll("\\D","");
    }

//    public boolean checkEvenNumber(int number) {
//        if (number %2 == 0) {
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
//    }

    public boolean checkEvenNumber(int number) {
        return (number %2 == 0);
    }

    public boolean checkEvenNumber2(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
