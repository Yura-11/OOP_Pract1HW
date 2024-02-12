import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 3), new Illness("Лишай"), 10.0); //Создаём экземпляр класса

        Animal dog = new Dog("Бобик", new Owner("Андрей Андреевич"),
                LocalDate.of(2023, 10, 4), new Illness("Лапка")); //Создаём экземпляр класса
//
//        System.out.println(cat);
//        cat.toGo(10);
//        cat.swim(0);
//        cat.fly(0);
//        System.out.println();
//
//
//        System.out.println(dog);
//        dog.toGo(20);
//        dog.fly(0);
//        dog.swim(10);
//        System.out.println();
//
        Sparrow sparrow = new Sparrow ("Кеша", new Owner("Евгения Алексеевна"),
                LocalDate.of(2023, 10, 4), new Illness("Простуда")); //Создаём экземпляр класса
//
//
//
//        System.out.println(sparrow);
//        sparrow.fly(40);
//        sparrow.toGo(3);
//        sparrow.swim(0);
//        System.out.println();
        personal.Doctor doctor = new personal.Doctor(" Андрей Сергеевич", "Ветеринар", 5);
        personal.Nurse nurse = new personal.Nurse("Антонина Андреевна", "Медсестра", 5);
        personal.Doctor doctor2 = new personal.Doctor("Семен Петрович", "Ветеринар", 5);
        personal.Nurse nurse2 = new personal.Nurse("Анна Петровна", "Медсестра", 5);


        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(cat, dog, sparrow);



        doctor.diagnosePatient(dog);
        nurse.assistDoctor(doctor, dog);
        doctor.prescribeMedication(dog, "Йод");
        nurse.administerMedication(dog, "Йод");
        nurse.monitorPatient(dog);
        doctor.admitPatient(dog);




        doctor2.diagnosePatient(cat);
        nurse2.assistDoctor(doctor2, cat);
        doctor2.prescribeMedication(cat, "Зеленка");
        nurse2.administerMedication(cat, "Зеленка");
        nurse2.monitorPatient(cat);
        doctor2.admitPatient(cat);


        clinic.addDoctor(doctor);
        clinic.addDoctor(doctor2);
        System.out.println(clinic.getAllDoctors());
        clinic.addNurse(nurse);
        clinic.addNurse(nurse2);
        List<Goable> list = new ArrayList<>();


        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Sparrow sparrow1 = new Sparrow();

       list.add(cat1);
       list.add(dog1);


        cat1.go();
        dog1.swim();
        sparrow1.fly();
        cat.go();




        System.out.println(clinic.getGoables());


    }

}


