package session5;

import java.util.ArrayList;

public class Testcases {

    private String id;
    private String name;
    private String description;
    private String precondition;
    private ArrayList<TestStep> testStep;


    public Testcases(String id, String name, String description, String precondition, ArrayList<TestStep> testStep) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.precondition = precondition;
        this.testStep = testStep;
    }
}
