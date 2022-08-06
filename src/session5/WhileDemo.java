package session5;

public class WhileDemo {

    public void demoWhile(int value) {
        int i = 0;
        while (i < value) {
            System.out.println(i);
            i++;
        }
    }

    public void demoDoWhile(int value) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < value);
    }
}
