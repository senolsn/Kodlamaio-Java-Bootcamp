package oopKodlamaIO.entities;

public class Course {

	private String id;
	private String name;
	private String categoryId;
	private String header;
	private String description;
	private String instructor;
	private int price;

	public Course() {

	}

	public Course(String id, String name, String categoryId, String header, String description, String instructor, int price) {
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.header = header;
		this.description = description;
		this.instructor = instructor;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
