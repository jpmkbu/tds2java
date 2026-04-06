package td010;

public class Animal {
    private String name;
    private int weight;
    private boolean hungry;
    private boolean injured;


    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.injured = false;
        this.hungry = false;
    }
}
