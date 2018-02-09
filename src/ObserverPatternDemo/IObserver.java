package ObserverPatternDemo;

/*An IObserver is an interface for observer classes.  The interface implements the following methods:
    1. update: Student -> void
 */

public interface IObserver {

	//Purpose: Updates the student information of this student and prints the new information.
	void update(Student s);
}
