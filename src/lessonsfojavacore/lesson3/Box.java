package lessonsfojavacore.lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box <T extends Fruit> {
    private String name;
    private ArrayList <T> fruitList;
    public Box(String name, ArrayList<T> fruitList){
        this.fruitList= fruitList;
        this.name= name;
    }
    public Double getWeightOfBox(){
        Double result =0.0;
        for(T t: getFruitList()){
            if(t!=null){
                Double weight =t.getWeight();
                result= result + weight;
            }
        }
        return result;
    }
    public String getName(){return name;}
    public boolean compare(Box <? extends Fruit> box){
        if(this.getWeightOfBox().doubleValue()==box.getWeightOfBox().doubleValue()) return true;
        return false;
    }
    public void shiftFruits(Box<T> box){
        System.out.println("В "+this.getName()+" было: " + this.getWeightOfBox());
        System.out.println("В "+box.getName()+" было: " + box.getWeightOfBox());
        for(T t: box.getFruitList()){
            this.getFruitList().add(t);
        }
        box.getFruitList().clear();
        System.out.println("В "+this.getName()+" стало: " + this.getWeightOfBox());
        System.out.println("В "+box.getName()+" стало: " + box.getWeightOfBox());
    }
     public ArrayList <T> getFruitList(){return fruitList;}
}
