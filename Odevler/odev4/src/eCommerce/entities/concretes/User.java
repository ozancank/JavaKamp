package eCommerce.entities.concretes;

import eCommerce.core.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean confirm_email;

	public User() {

	}

	public User(int id, String firstName, String lastName, String email, String password, boolean confirm_email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirm_email = confirm_email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		if (firstName == null)
			firstName = "";
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		if (lastName == null)
			lastName = "";
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		if (email == null)
			email = "";
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		if (password == null)
			password = "";
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isConfirm_email() {
		return confirm_email;
	}

	public void setConfirm_email(boolean confirm_email) {
		this.confirm_email = confirm_email;
	}

}
