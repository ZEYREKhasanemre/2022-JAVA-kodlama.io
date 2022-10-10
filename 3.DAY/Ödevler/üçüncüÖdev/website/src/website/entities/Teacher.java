package website.entities;

public class Teacher {
	private int id;
	private String firstName;
	private String lastName;
	private String courseName;
	private String category;
	private int price;
	
	
	public Teacher() {}

	public Teacher(int id, String firstName, String lastName, String courseName, String category, int price) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseName = courseName;
		this.category = category;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	

}
