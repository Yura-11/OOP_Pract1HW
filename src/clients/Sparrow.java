package clients;


import java.time.LocalDate;

public class Sparrow extends Animal implements Flyable, Goable{
    public Sparrow(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Sparrow(){
        super();
    }


    @Override
    public void fly() {
        System.out.println("Животное " + nickName + "Полетело");

    }
    @Override
    public double getFlySpeed() {
        return Flyable.super.getFlySpeed();
    }

    @Override
    public void go() {
        System.out.println("Животное " + nickName + " пошло куда то");

    }
    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}