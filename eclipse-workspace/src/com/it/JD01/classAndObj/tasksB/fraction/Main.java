package com.it.JD01.classAndObj.tasksB.fraction;

import com.it.JD01.classAndObj.tasksB.fraction.entity.Fraction;
import com.it.JD01.classAndObj.tasksB.fraction.logic.FractionLogic;

import java.util.Random;

/**
 * Created by Denis on 29.10.2017.
 */
public class Main {
    public static Fraction newFraction(){
        Random random = new Random();
        return new Fraction(random.nextInt(100),random.nextInt(100));
    }
    public static void sum(Fraction[] fr){
        FractionLogic fractionLogic = new FractionLogic();
        for (int i = 0; i < fr.length-1; i+=2) {
            fr[i]=fractionLogic.sum(fr[i], fr[i+1]);
            fr[i]=fractionLogic.sokr(fr[i]);
        }
    }
    public static void main(String[] args) {
        int k=3;//число элементов массива
        Fraction[] allFraction = new Fraction[k];
        for (int i = 0; i < allFraction.length; i++) {
            allFraction[i]=newFraction();
            System.out.println(i + " " +allFraction[i]);
        }
        sum(allFraction);
        for (int i = 0; i < allFraction.length; i++) {
            System.out.println(allFraction[i]);
        }

    }
}
