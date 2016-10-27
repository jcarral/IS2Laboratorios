package t4patternbox.adapter;

import java.util.Vector;

/**
 * Created by joseba on 26/10/2016.
 */
public class AddressBook {
    Vector<Person> personList=new Vector<Person>();
    public AddressBook(){
        personList.add(new Person("Jon", "Donostia"));
        personList.add(new Person("Ane", "Irun"));
        personList.add(new Person("Izaskun", "Tolosa"));
        personList.add(new Person("Mikel", "Hernani"));
    }
    public int getSize(){
        return personList.size();
    }
    public Person getPerson(int pos){
        return personList.elementAt(pos);
    }
}
