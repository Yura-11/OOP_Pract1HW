package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component>, Comparable<Pharmacy2> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

@Override
public String toString() {
        return "Медикаменты" + components;
}

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс

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
    public int compareTo(Pharmacy2 that) {
        int fullPowerThat = 0;
        int fullPowerThis = 0;

        for (Component c : components) fullPowerThis += c.getPower();
        for (Component c : that.components) fullPowerThat += c.getPower();

        return Integer.compare(fullPowerThis, fullPowerThat);
    }

}