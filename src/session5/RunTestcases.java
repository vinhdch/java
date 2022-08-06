package session5;

import java.util.ArrayList;

public class RunTestcases {
    public static void main(String[] args) {

        TestStep testStep1 = new TestStep("open app",
                "show login screen");
        TestStep testStep2 = new TestStep("input userid/pass",
                "hide pass");
        TestStep testStep3 = new TestStep("press login button",
                "navigate to homepage");

        ArrayList<TestStep> testStep = new ArrayList<>();

        testStep.add(testStep1);
        testStep.add(testStep2);
        testStep.add(testStep3);

        Testcases loginSuccess = new Testcases("001",
                "verify login success",
                "....",
                "having account", testStep);
    }
}
