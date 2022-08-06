package session3;

import org.w3c.dom.ls.LSOutput;

public class ExecuteSession3 {

    public static void main(String[] args) {
        Session3 session = new Session3();
        String dongia = session.getNumberInString("don gia la 180.67d () TU");

        boolean isChecked = session.checkEvenNumber(21);

    }
}
