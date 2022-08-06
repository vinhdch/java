package session6.Inherit;

import java.nio.charset.Charset;
import java.util.Random;

public class Student extends Person{
    private String school;

    public Student(String fullname, String address, String phone, String school) {
        super(fullname, address, phone);
        this.school = school;
    }

    public String randomText() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generateString = new String(array, Charset.forName("UTF-8"));
        return generateString;
    }
}
