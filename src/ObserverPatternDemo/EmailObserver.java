package ObserverPatternDemo;

//An EmailObserver is an IObserver that observes a student's email address information.  When a student's
//email address changes, a call to update is performed, which simply prints the new email address.
public class EmailObserver implements IObserver {

    public EmailObserver() {}

    //Purpose: Prints the updated student's email address.
    public void update(Student s) {
        System.out.println("The student's email address is " + s.getEmail());
    }
}
