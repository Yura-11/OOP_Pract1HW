package drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {  //ALt + insert
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("title = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(o.power, this.power);
    }
}


