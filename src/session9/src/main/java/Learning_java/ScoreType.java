/*
 * Author : AdNovum Informatik AG
 */

package Learning_java;

public class ScoreType {

	public String getScoreType (int avgScore) {
		if (avgScore <25) {
			return "F";
		} else if (avgScore >= 25 && avgScore <45) {
			return "E";
		} else if (avgScore >= 45 && avgScore <60) {
			return "D";
		} else if (avgScore >= 60 && avgScore <75) {
			return "C";
		} else if (avgScore >= 60 && avgScore <75) {
			return "B";
		}
		return "A";
	}

}
