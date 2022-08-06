/*
 * Author : AdNovum Informatik AG
 */

package Learning_java.Entity;

import java.util.List;

public class Testcase {

	private String id;
	private String name;
	private String description;
	private List<TestSteps> steps;

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSteps(List<TestSteps> steps) {
		this.steps = steps;
	}
}
