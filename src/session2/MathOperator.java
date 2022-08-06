package session2;

public class MathOperator {
    public void demoOperator (int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("sum: " + sum);

        int sub = number1 - number2;
        System.out.println("sub is:" + sub);

        int mul = number1 * number2;
        System.out.println("mul is:" + mul);

        int div = number1 / number2;
        System.out.println("div is:" + div);
    }

    public void demo(int value1, int value2) {
        boolean result = value1 < value2;
        System.out.println(result);

        boolean result2 = value1 == value2;
        System.out.println(result2);

        boolean result1 = value1 != value2;
        System.out.println(result1);
    }

    public void logical(int a, int b, int c) {
        boolean result = (a <b) && (a < c) && (b<c);
        System.out.println(result);

        boolean result1 = !(a <b);
        System.out.println(result1);

        boolean result2 = (a <b) || (a < c) ;
        System.out.println(result2);
    }

    public void demo1(int a, int b) {
        a +=b;
        System.out.println(a);

        a -=b;
        System.out.println(a);
    }

    public void demo2(int a, int b) {
        int max2 = (a>b) ? a:b;

        if (a>b) {
            max2 = a;
        }
        max2 = b;
        System.out.println(max2);
    }

}
