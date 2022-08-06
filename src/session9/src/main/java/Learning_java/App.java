package Learning_java;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Scanner myObj = new Scanner(System.in);
        //System.out.println("nhap a: ");
        //double a = myObj.nextDouble();
        //System.out.println("enter phep tinh");
        //String operator = myObj.next();
        //System.out.println("nhap b: ");
        //double b = myObj.nextDouble();
        //Calculation calculation = new Calculation();
        //double result = 0;
        //
        //switch (operator) {
        //    case "+":
        //        result = calculation.sum(a, b);
        //        break;
        //    case "-":
        //        result = calculation.subtract(a, b);
        //        break;
        //    case "*":
        //        result = calculation.multiple(a, b);
        //        break;
        //    case "/":
        //        result = calculation.divide(a, b);
        //        break;
        //}
        //System.out.println("ket qua: " + result);

        ReadExcelFile readExcelFile = new ReadExcelFile();
        readExcelFile.readFileExcel();
    }
}
