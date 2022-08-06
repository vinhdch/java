package session4;

public class Loop {

//    public void demoForI() {
//        for (int i = 0; i <5; i++) {
//            System.out.println("Gia tri:" + i);
//        }
//    }

    public void printOddNumber() {
        for (int i1 = 1; i1 < 10; i1 = i1 +2) {
            System.out.println("So le is:" + i1);
        }
    }

    // for each
    public void demoEach() {
        String[] cars = {"Volvo", "Toyota","Mazda","Ford"};
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public void printEachDigit(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(words);
        }
    }
}
