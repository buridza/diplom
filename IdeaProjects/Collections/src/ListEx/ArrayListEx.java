package ListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.printf("%20s %100s%n","После создания",arrayList);
        arrayList.sort(new ComparatorForInteger());
        System.out.printf("%20s %100s%n","После сортировки",arrayList);
        Collections.shuffle(arrayList);
        System.out.printf("%20s %100s%n","После шафла",arrayList);
        TreeSet<Number> treeSet = new TreeSet<>(arrayList);
        //treeSet.addAll(arrayList);
        /*for (Number in: treeSet) {
            System.out.println(in);
        }*/
        treeSet.toString();
        System.out.printf("%20s %70s%n","ТриСет",treeSet);


    }


}
