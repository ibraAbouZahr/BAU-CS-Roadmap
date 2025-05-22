
public class TaskList {
	Node head;

	public void addTask(Task task) {
		Node p = new Node(task);

		if (head == null) {
			head = p;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = p;
		}
	}

	public void listTasks() {
		Node current = head;
		while (current.next != null) {
			Task t = current.task;
			System.out.println("Title: " + t.getTitle());
			System.out.println("Description: " + t.getDescription());
			System.out.println("Due Date: " + t.getDueDate());
		}
	}
	public TaskList getTasksForDate(String targetDueDate) {
		TaskList tasksForTargetDueDate = new TaskList();
		
		Node current = head;
		while(current!= null) {
			Task  task = current.task;
			
		}
	}
	public void removeTask(String title) {
		Node current = head;
		Node temp = null;
		while (current.next != null) {
			Task t = current.task;
			if(title != t.getTitle()) {
				break;
			
			
		}
			else if(title == t.getTitle()) {
				temp.next = current;
			}
		}
		
	}
}
