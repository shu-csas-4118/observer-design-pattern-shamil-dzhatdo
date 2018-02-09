package ObserverPatternDemo;

import java.util.ArrayList;

//The student class represents a real life student held in some database.  The student information
//is being observed by a collection of observers which is managed by an ObserverManager which dictates
//which observers to notify when a specific action in done.

//Business Logic:
//When any information in a student is changed, the observers corresponding to that observer are notified.
//The student's updated information is printed to the screen.

public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ObserverManager observers;
	private ArrayList<Course> courses = new ArrayList<>();

	//Constructor:  This constructor takes as input the basic data for the student, including the first and last
    //names, ID number, and email address.  It also initializes the ObserverManager for the student, and creates
    //a new ArrayList for the courses.
	public Student(String f, String l, int i, String e) {
		firstName = f;
		lastName = l;
		idNumber = i;
		email = e;
		observers = new ObserverManager();
    }

	//This constructor takes no input, and just initializes a new ObserverManager and ArrayList for courses.
	public Student() {
		observers = new ObserverManager();
    }

	//Purpose: Returns the first name of this student.
	public String getFirstName() {
		return firstName;
	}

	//Purpose: Updates the student's first name if it is new.  Also notifies all observers of type "firstName"
    //         with the new student information.
	public void setFirstName(String newF) {
	    if (!firstName.equals(newF)) {
            firstName = newF;
            notifyAllObservers("firstName");
        }
	}

	//Purpose: Returns the last name of this student.
	public String getLastName() {
		return lastName;
	}

	//Purpose: Updates the student's last name if it is new.  Also notifies all observers of the type "lastName"
    //         with the new student information.
	public void setLastName(String newL) {
	    if (!lastName.equals(newL)) {
            lastName = newL;
            notifyAllObservers("lastName");
        }
	}

	//Purpose: Returns the ID number of this student.
	public int getIdNumber() {
		return idNumber;
	}

	//Purpose: Updates the student's ID number if it is new.  Also notifies all observers of the type "idNumber"
    //         with the new student information.
	public void setIdNumber(int newI) {
	    if (idNumber != newI) {
            idNumber = newI;
            notifyAllObservers("idNumber");
        }
	}

	//Purpose: Returns the email address of this student.
    public String getEmail() {
        return email;
    }

    //Purpose: Updates the email address of this student if it is new.  Also notifies all observers of the type
    //         "email" with the new student information.
	public void setEmail(String newE) {
	    if (!email.equals(newE)) {
            email = newE;
            notifyAllObservers("email");
        }
	}

	//Purpose: Attaches an observer to the ObserverManager with the given input type.
	public void attachObserver(String type, IObserver observer) {
		observers.addObserver(type, observer);
	}

	//Purpose: Adds a given course to the student's course list if it is not already in that list.  Also
    //         notifies all observers of the type "course" with the new student information.
	public void addCourse(Course course) {
	    if (courses.indexOf(course) < 0) {
            courses.add(course);
            notifyAllObservers("course");
        }
    }

    //Purpose: Removes a given course from the student's course list if it is in the student's course list.
    //         Also notifies all observers of the type "course" with the new information.
    public void removeCourse(Course course) {
	    if (courses.indexOf(course) > -1) {
            courses.remove(course);
            notifyAllObservers("course");
        }
    }

    //Purpose: Returns the list of courses this student is taking.
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //Purpose: Notifies all observers of the given type attached to this student.
    public void notifyAllObservers(String type) {
		observers.notifyAllObservers(type, this);
	}
	
	
}
