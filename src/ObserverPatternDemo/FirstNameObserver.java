package ObserverPatternDemo;

//A FirstNameObserver is an IObserver which observes a student's first name.  When a student's first name
//is changed, a call is made to update, which prints the updated student first name.
public class FirstNameObserver implements IObserver {

	public FirstNameObserver() {}

	//Purpose: Prints the updated student first name.
	public void update(Student s) {
        System.out.println("Student's first name is " + s.getFirstName());
	}
}
