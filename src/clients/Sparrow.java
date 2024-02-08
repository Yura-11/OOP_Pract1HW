package clients;

import java.time.LocalDate;

public class Sparrow extends Animal{
    public Sparrow(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Sparrow(){
        super();
    }


    @Override
    public void swim(int meters){
        System.out.println("Животное по имени " + nickName + " не умеет плавать");

    }

}