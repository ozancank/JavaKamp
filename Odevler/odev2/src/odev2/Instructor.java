package odev2;

public class Instructor extends User {
	private String biography;
	private Course[] givenCourses;

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public Course[] getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(Course[] givenCourses) {
		this.givenCourses = givenCourses;
	}

}
