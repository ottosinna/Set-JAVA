import java.util.Iterator;
import java.util.TreeSet;

class Set<T extends Comparable<T> > implements Iterable<T> {

    //member variables
    private TreeSet<T> set;

    //constructor(default)
    public Set() {
        set = new TreeSet<T>();
    }

    //add
    public void add(T input) {
        if(input == null) {
            throw new IllegalArgumentException("input must not be null, unable to add");
        }
        set.add(input);
    }

    public void remove(T input) {
        set.remove(input);
        //
    }

    public boolean contains(T input) {
        if(input == null) {
            return false;
        } 
        else if(set.contains(input)==true) {
            return true;    
        }
        return false;
        //
   
    }

    public boolean isEmpty(){
        //
        return set.isEmpty();
    }

    public int size(){
        //
        return set.size();
    }

    public void clear() {
        set.clear();
        // clear the set(remove all items)
    }

    // for iterable interface
    @Override
    public Iterator<T> iterator() {

        return set.iterator(); //fix me
    }
}