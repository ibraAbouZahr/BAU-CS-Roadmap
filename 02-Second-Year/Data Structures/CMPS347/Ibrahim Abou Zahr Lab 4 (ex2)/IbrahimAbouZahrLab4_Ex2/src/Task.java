
public class Task {
	String title;
	String description;
	String dueDate;

	public Task(String title, String description, String dueDate) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;

	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getDueDate() {
		return dueDate;
	}

}
