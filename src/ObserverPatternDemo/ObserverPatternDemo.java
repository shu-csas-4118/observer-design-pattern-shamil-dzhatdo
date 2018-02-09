package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		//Create the student and courses to be added/removed from the student's course list.
		Student student = new Student("Shaml", "Dzhatdoyev", 123456, "shamil.dzhatdoyev@student.shu.edu");
		Course SW1  = new Course("Software Engineering 1", 4117, 3, "Thomas Marlowe");
		Course SW2 = new Course("Software Engineering 2", 4118, 3, "Garett Chang");
		Course FLAT = new Course("Formal Langauges and Automata Theory", 4113, 3, "Marco Morazan");

		//Create the observers which are to be added to the student's ObserverManager.
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		CourseObserver courseObserver = new CourseObserver();
		EmailObserver emailObserver = new EmailObserver();

		//Attach the four observers to the student.
		student.attachObserver("idNumber", idObserver);
		student.attachObserver("firstName", firstNameObserver);
		student.attachObserver("course", courseObserver);
		student.attachObserver("email", emailObserver);

		//Here, we set the first name of the student to a new name.
        System.out.println("Here, only the student's first name observer should update.");
		student.setFirstName("Shamil");
		//Then we set the ID number of the student to a new number.
        System.out.println("\nHere, only the student's ID number observer should update.");
		student.setIdNumber(543210);
		//Then we set the email address of the student to a new address.
        System.out.println("\nHere, only the student's email address observer should update.");
		student.setEmail("shamil.dzhatdo@shu.edu");
		//Here, we add 3 courses to the student's course list.
        System.out.println("\nHere, only the student's course observer should update.");
		student.addCourse(SW1);
		student.addCourse(SW2);
		student.addCourse(FLAT);
		//Finally, we remove a course from the course list.
		student.removeCourse(SW1);
	}

}
