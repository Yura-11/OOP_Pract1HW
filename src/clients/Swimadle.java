package clients;

public interface Swimadle {

    void swim();
    default double getSwimSpeed(){
        return 10;
    }
}