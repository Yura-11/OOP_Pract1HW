package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component>, Copmparable_pharmacy, Comparable<Pharmacy> {

    private List<Component> components = new ArrayList<Component>();

    private int index = 0;




    public void addComponents(Component ... components) {
       for (Component c : components){
           this.components.add(c);
       }
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

    @Override
    public Iterator<Component> iterator() { // Анонимнй класс
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Pharmacy PharmacyNew) {
        return 0;

        }

}

