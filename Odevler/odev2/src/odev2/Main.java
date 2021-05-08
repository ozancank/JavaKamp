package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# + Angular");
		Course course2 = new Course(2, "Java + React");
		Course course3 = new Course(3, "Temel Kurs");

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ozan Can");
		student.setLastName("Kösemez");
		student.setTakenCourses(new Course[] { course1, course2 });

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setGivenCourses(new Course[] { course1, course2, course3 });

		UserManager userManager = new UserManager();
		userManager.addMultipleUser(new User[] { student, instructor });
	}

}
