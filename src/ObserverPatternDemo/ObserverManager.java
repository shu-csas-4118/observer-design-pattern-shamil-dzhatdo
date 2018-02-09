package ObserverPatternDemo;

import java.util.ArrayList;
import java.util.Hashtable;

//An ObserverManager is a class which contains a HashTable of IObserver lists.  Each list of
//IObservers is paired with a key which represents which type of data those observers are observing.
public class ObserverManager {

    private Hashtable<String, ArrayList<IObserver>> observers;

    public ObserverManager() {
        observers = new Hashtable<>();
    }

    //Purpose: Adds a new observer of the given type to the hash table.  If a new type of observer
    //         is being added, a new entry in the hash table is created with an empty list of IObservers.
    //         The new observer is then added to the ArrayList that corresponds with its observer type.
    public void addObserver(String type, IObserver observer) {
        ArrayList<IObserver> O = observers.get(type);
        if (O == null)
            O = new ArrayList<>();
        O.add(observer);
        observers.put(type, O);
    }

    //Purpose: Notifies all of the observers of the given type in the HashTable, using the given
    //         student information.
    public void notifyAllObservers(String type, Student student) {
        ArrayList<IObserver> O = observers.get(type);
        for (IObserver observer: O)
            observer.update(student);
    }
}
