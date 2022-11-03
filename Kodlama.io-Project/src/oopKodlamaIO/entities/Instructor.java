package oopKodlamaIO.entities;

public class Instructor {

	private String id;
	private String firstName;
	private String lastName;
	private String image;
	private String biography;
	private String header;

	public Instructor() {

	}

	public Instructor(String id, String firstName, String lastName, String image, String biography, String header) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.image = image;
		this.biography = biography;
		this.header = header;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

}
