package lessonsfojavacore.lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        changeElements(2,7);
        Orange orange = new Orange();
        ArrayList<Orange> orangesList = new ArrayList<>();
        orangesList.add(orange);
        orangesList.add(orange);
        orangesList.add(orange);
        orangesList.add(orange);
        orangesList.add(orange);
        orangesList.add(orange);
        Box orangeBox1 = new Box<>("коробка апельсинов № 1: ",orangesList);
        System.out.println("Вес "+orangeBox1.getName() +orangeBox1.getWeightOfBox());
        ArrayList<Orange> orangesList2 = new ArrayList<>();
        orangesList2.add(orange);
        orangesList2.add(orange);
        orangesList2.add(orange);
        orangesList2.add(orange);
        orangesList2.add(orange);
        orangesList2.add(orange);
        Box orangeBox2 = new Box<>("коробка апельсинов № 2: ",orangesList2);
        System.out.println("Вес "+orangeBox2.getName() +orangeBox2.getWeightOfBox());
        System.out.println(orangeBox1.compare(orangeBox2));
        Apple apple = new Apple();
        ArrayList<Apple> applesList1 = new ArrayList<>();
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        applesList1.add(apple);
        ArrayList<Apple> applesList2= new ArrayList<>();
        Box appleBox1=new Box("коробка яблок № 1: ", applesList1);
        Box appleBox2 = new Box("коробка яблок № 2: ",applesList2);
        System.out.println("Вес "+appleBox1.getName()+ appleBox1.getWeightOfBox());
        System.out.println("Вес "+appleBox2.getName() +appleBox2.getWeightOfBox());
        orangeBox1.shiftFruits(orangeBox2);
        appleBox2.shiftFruits(appleBox1);
    }
    public static void changeElements(int a, int b){
        String p;
        String [] mass={"Каждый ","охотник ","желает ","знать ","где ","сидит ","фазан "};
        System.out.println("Изначальный массив:"+ Arrays.toString(mass));
        p=mass[a-1];
        mass[a-1]=mass[b-1];
        mass[b-1]=p;
        System.out.println("Массив после смены:"+Arrays.toString(mass));
    }

}
