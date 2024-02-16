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
        p1.addComponents(new Component("az", 1D,4 ));
        p1.addComponents(new Component("uf", 1D, 6));


        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(new Component("iig", 6D, 18));
        p2.addComponents(new Component("jsj", 3D, 8));

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(new Component("vkfh", 5D, 9));
        p3.addComponents(new Component("aadd", 10D, 10));



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

        pharmacy2s.add(p1);
        pharmacy2s.add(p2);
        pharmacy2s.add(p3);





        Collections.sort(pharmacy2s);

        System.out.println("Sorted");
        System.out.println(pharmacy2s);
        }
    }
