package clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimadle  {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }


    @Override
    public void go() {
        System.out.println("Животное " + nickName + " бегает");

    }
    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public void swim() {
        System.out.println("Животное " + nickName + " плавает");

    }

}