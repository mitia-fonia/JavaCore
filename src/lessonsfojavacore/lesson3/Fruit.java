package lessonsfojavacore.lesson3;

public abstract class Fruit {
    static String name;
    static Double weight;

    public Fruit(String name, Double weight){
        this.name =name;
        this.weight =weight;
    }
    public String  getName(){return name;}
    public Double getWeight(){return weight;}
}
