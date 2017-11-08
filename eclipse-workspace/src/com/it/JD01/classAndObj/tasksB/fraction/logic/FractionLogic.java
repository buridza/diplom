package com.it.JD01.classAndObj.tasksB.fraction.logic;

import com.it.JD01.classAndObj.tasksB.fraction.entity.Fraction;

/**
 * Created by Denis on 29.10.2017.
 */
public class FractionLogic extends Fraction {
    public Fraction sum(Fraction fr1, Fraction fr2){
        return new Fraction(fr1.getCh()*fr2.getZn()+fr2.getCh()*fr1.getZn(),fr1.getZn()*fr2.getZn());
    }
    public Fraction minus(Fraction fr1, Fraction fr2){
        return new Fraction(fr1.getCh()*fr2.getZn()-fr2.getCh()*fr1.getZn(),fr1.getZn()*fr2.getZn());
    }
    public Fraction multiply(Fraction fr1, Fraction fr2){
        return new Fraction(fr1.getCh()*fr2.getCh(),fr1.getZn()*fr2.getZn());
    }
    public Fraction divide(Fraction fr1, Fraction fr2){
        return new Fraction(fr1.getCh()*fr2.getZn(),fr1.getZn()*fr2.getCh());
    }
    public Fraction sokr(Fraction fr){
        int min = Math.min(fr.getCh(),fr.getZn());
        for (int i = min; i > 0; i--) {
            if(fr.getCh()%i==0&&fr.getZn()%i==0){
                return new Fraction(fr.getCh()/i,fr.getZn()/i);
            }
        }
        return fr;
    }
}
