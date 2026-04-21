package taskmanager;
import java.util.Date;

public class Task {
	
	
	// ATTRIBUTES 
	
	private int taskID;
	private String title;
	private String description;
	private Date dueDate;
	private boolean status;
	
	
	// CONSTRUCTOR METHOD (PARAMETIZED)	
	
	public Task(int taskID, String title, String description, Date dueDate) {
		this.taskID = taskID;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.status = false;
		
	
	// GETTER METHODS (FOR READ METHODS)
		
	}
	
	public int getTaskID() {
		return taskID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public boolean getStatus( ) {
		return status;
	}
	

	
	// SETTER METHOD (FOR WRITE METHODS)
	
	public void setTitle(String title ) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
	// SPECIAL METHODS 
	
	public void markComplete() {
		this.status = true;
	}
	
	public void markIncomplete() {
		this.status = false;
	}
}
