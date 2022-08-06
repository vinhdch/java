package session5;

public class Student {
    private String id;
    private String name;
    private String address;
    private Score score;


    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public float getAvgScore() {
        return score.getAvgScore();
    }

    public String getStudentType() {
        float agvScore = getAvgScore();
        if (agvScore < 25) {
            return "F";
        } else if (agvScore > 25 && agvScore < 45) {
            return "D";
        }
        return "B";
    }

    public String getId() {
        return id;
    }
}
