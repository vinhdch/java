package session6.Exception;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            String[] countries = new String[2];
            countries[0] = "VN";
            countries[0].length();
            System.out.println(countries[5]);
        } catch (NullPointerException e) {
            System.out.println("gia tri null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nam ngoai gia tri bien");
        }
    }
}
