package com.it.JD01.javaBasics.tasksB;

import com.it.JD01.javaBasics.tasksB.Communarka.Communarka;
import com.it.JD01.javaBasics.tasksB.Communarka.Roshen;
import com.it.JD01.javaBasics.tasksB.entity.Candy;
import com.it.JD01.javaBasics.tasksB.entity.CandyByMassComparator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Denis on 02.11.2017.
 */
public class Main {
    static ArrayList<Candy> createRoshen(){
        ArrayList<Candy> roshenProd = new ArrayList<>();
        Roshen roshen = new Roshen();
        roshenProd.add(roshen.createCandyWithChop());
       roshenProd.add(roshen.createCandyWithFried());
       roshenProd.add(roshen.createCandyWithLiqueurAndJelly());
       roshenProd.add(roshen.createCandyWithMilAndChocolate());
       roshenProd.add(roshen.createChocolateDarkWithAlmonds());
       roshenProd.add(roshen.createChocolateDark());
       roshenProd.add(roshen.createChocolateDarkWithFruits());
       roshenProd.add(roshen.createChocolateMilk());
       roshenProd.add(roshen.createChocolateMilkWhithAlmonds());
       roshenProd.add(roshen.createChocolateMilkWhithFruits());
        return roshenProd;
    }
    static ArrayList<Candy> createCommunarka(){
        ArrayList<Candy> communarkaProd = new ArrayList<>();
        Communarka communarka = new Communarka();
        communarkaProd.add(communarka.createCandyWithChop());
        communarkaProd.add(communarka.createCandyWithFried());
        communarkaProd.add(communarka.createCandyWithLiqueurAndJelly());
        communarkaProd.add(communarka.createCandyWithMilAndChocolate());
        communarkaProd.add(communarka.createChocolateDarkWithAlmonds());
        communarkaProd.add(communarka.createChocolateDark());
        communarkaProd.add(communarka.createChocolateDarkWithFruits());
        communarkaProd.add(communarka.createChocolateMilk());
        communarkaProd.add(communarka.createChocolateMilkWhithAlmonds());
        communarkaProd.add(communarka.createChocolateMilkWhithFruits());
        return communarkaProd;
    }
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Candy> allProd = new ArrayList<>();
        allProd.addAll(createRoshen());
        allProd.addAll(createCommunarka());
        ArrayList<Candy> newYearsGift = new ArrayList();
        for (int i = 0; i < random.nextInt(50); i++) {
           newYearsGift.add(allProd.get(random.nextInt(allProd.size())));
        }
        double allMass=0;
        for (Candy candy: newYearsGift) {
            allMass += candy.getMass();
        }

        System.out.println(allMass + " Грамм в собранном подарке");
        for (Candy candy: newYearsGift) {
            System.out.print(candy.getMass()+" ");
        }
        System.out.println();
        newYearsGift.sort(new CandyByMassComparator());
        for (Candy candy: newYearsGift) {
            System.out.print(candy.getMass()+" ");
        }
        System.out.println();
        for (Candy candy: newYearsGift) {
            if(candy.getSugarLevel()>40 && candy.getSugarLevel()<60)System.out.print(candy.getSugarLevel()+" ");
        }
    }


}
