// Admin class representing a department or course
public class Admin {
	private int id; // ID of the department or course
	private String name; // Name of the department or course

	// Getter and Setter methods for ID and Name
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// Overriding toString method to display ID and Name
	@Override
	public String toString() {
		return "id= " + id + ", name= " + name ;
	}

	// Constructor to initialize ID and Name
	public Admin(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
