package session5;

public class Score {
    private byte writing;
    private byte reading;
    private byte listening;

    public float getAvgScore() {
        return (writing + reading + listening)/3;
    }
}
