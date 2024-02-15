package drugstore;

import drugstore.components.Azitronite;
import drugstore.components.Penicillin;
import drugstore.components.Water;

import java.util.*;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(water, penicillin);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        Pharmacy2 p4 = new Pharmacy2();
        p4.addComponents(azitronite, penicillin, water);

        Pharmacy2 p5 = new Pharmacy2();
        p5.addComponents(azitronite, penicillin, water, azitronite);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        System.out.println(components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c : p2) {
//            System.out.println(c);
//        }

        List<Pharmacy2> pharmacy2s = new ArrayList<>();
        pharmacy2s.add(p4);
        pharmacy2s.add(p1);
        pharmacy2s.add(p2);
        pharmacy2s.add(p3);
        pharmacy2s.add(p5);
111111111111
        for (Pharmacy2 pharmacy : pharmacy2s) {
            System.out.println(pharmacy);
        }


    }
}


