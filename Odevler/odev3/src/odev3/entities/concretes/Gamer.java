package odev3.entities.concretes;

import odev3.core.abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String nickname;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	private int yearOfBirth;
	private String email;

	public Gamer() {
	}

	public Gamer(int id, String nickname, String firstName, String lastName, String nationalityNumber, int yearOfBirth,
			String email) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
		this.yearOfBirth = yearOfBirth;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		if (nickname == null)
			nickname = "";
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getNationalityNumber() {
		if (nationalityNumber == null)
			nationalityNumber = "";
		return nationalityNumber;
	}

	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getEmail() {
		if (email == null)
			email = "";
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
