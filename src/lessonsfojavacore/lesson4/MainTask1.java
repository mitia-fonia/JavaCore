package lessonsfojavacore.lesson4;

import java.util.*;

public class MainTask1 {
    public static ArrayList<String>stringList = new ArrayList<>();

    public static void main(String[] args){
        stringList.add("каждый");
        stringList.add("охотник");
        stringList.add("желает");
        stringList.add("знать");
        stringList.add("где");
        stringList.add("сидит");
        stringList.add("фазан");
        stringList.add("каждый");
        stringList.add("желает");
        stringList.add("знать");
        stringList.add("фазан");
        stringList.add("каждый");
        stringList.add("желает");
        stringList.add("фазан");
        stringList.add("каждый");
        stringList.add("фазан");
        stringList.add("сидит");
        System.out.println(stringList);
        System.out.println(" Кол-во элеменков в List =  " + stringList.size());
        HashSet<String> stringHashSet = new HashSet<>(stringList);
        System.out.println(stringHashSet);
        System.out.println("Кол-во элеменков в Set = " + stringHashSet.size());

        HashMap<String,Integer> duplicates = new HashMap<>();
        for(String str: stringHashSet){
            duplicates.put(str,count(str));
        }
        System.out.println(duplicates);
    }
    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : stringList){
            if(strThis.equals(str)) result++;
        }
        return result;
    }
}
