package session4;

public class SwitchCase {
    public void timeTable (String day) {
        switch (day) {
            case "mon":
                System.out.println("monday");
                break;
            case "tues":
                System.out.println("tuesday");
                break;
            case "wed":
                System.out.println("wednesday");
                break;
            default:
                System.out.println("other day");
        }
    }
}
