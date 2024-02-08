import clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("«Солнышко»", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 3), new Illness("Лишай"), 10.0); //Создаём экземпляр класса

        Animal dog = new Dog("«Бобик»", new Owner("Андрей Андреевич"),
                LocalDate.of(2023, 10, 4), new Illness("Лишай")); //Создаём экземпляр класса

        System.out.println(cat);
        cat.toGo(10);
        cat.swim(0);
        cat.fly(0);
        System.out.println();


        System.out.println(dog);
        dog.toGo(20);
        dog.fly(0);
        dog.swim(10);
        System.out.println();

        Sparrow sparrow = new Sparrow ("«Кеша»", new Owner("Евгения Алексеевна"),
                LocalDate.of(2023, 10, 4), new Illness("Простуда")); //Создаём экземпляр класса



        System.out.println(sparrow);
        sparrow.fly(40);
        sparrow.toGo(3);
        sparrow.swim(0);
        System.out.println();


    }
}