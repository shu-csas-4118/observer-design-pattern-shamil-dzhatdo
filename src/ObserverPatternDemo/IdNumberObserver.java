package ObserverPatternDemo;

//An IdNumberObserver is an IObserver which updates with the student's ID number.  When the student's
//ID number changes to a new value, a call to update is done with this observer, which prints the new
//ID number.
public class IdNumberObserver implements IObserver {

    public IdNumberObserver() {}

    //Purpose: Prints the updated student's ID number.
	public void update(Student s) {
        System.out.println("Student's ID number is " + s.getIdNumber());
	}

}
