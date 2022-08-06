package session4;

public class IfElseDemo {

    public int getMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public String getting(int time) {
        if (time < 18) {
            return "Good day";
        } else {
            return "Good evening";
        }
    }

    // nested-if statement
    public void choice(byte tuoi, String appearance, boolean smart) {
        if (appearance.equals("handsome")) {
            if (tuoi > 30) {
                System.out.println("Get married");
            } else {
            }
        } else {

        }
    }

    // if-else-if ladder statement

    public void choiceIfElseIf(byte tuoi, String appearance, boolean smart) {
        if (smart && tuoi > 30) {
            System.out.println("get married");
        } else if (appearance.equals("handsome")) {
            System.out.println("dep gai");
        } else {
            System.out.println("xau");
        }
    }

    public  float getSalary(float salary) {
//        float tax = getSalary(salary);
        return salary - getTax(salary);
    }

    public float getTax(float salary) {
        if (salary > 3000) {
            return (float) (salary * 0.2);
        }
        return (float) (salary * 0.15);
    }
}
