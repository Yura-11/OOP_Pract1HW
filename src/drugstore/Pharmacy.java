package drugstore;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    public List<Component> components = new ArrayList<>();


    @Override
    public int compareTo(Pharmacy that) {
        int fullPowerThat = 0;
        int fullPowerThis = 0;

        for (Component c : components) fullPowerThis += c.getPower();
        for (Component c : that.components) fullPowerThat += c.getPower();

        return Integer.compare(fullPowerThis, fullPowerThat);
    }
}




