package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C# + ANGULAR","Engin Demiroð");
		Course course2=new Course(2,"JAVA + REACT","Engin Demiroð");
		Course course3=new Course(3,"Temel Programlama","Engin Demiroð");

		Course[] courses= {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		System.out.println("Kurs adeti: "+courses.length);
		
		CourseManager courseManager=new CourseManager();
		courseManager.recordToLesson(course1);
		courseManager.recordToLesson(course2);
		courseManager.recordToLesson(course3);
	}

}
