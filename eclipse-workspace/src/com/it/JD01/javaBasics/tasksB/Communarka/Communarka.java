package com.it.JD01.javaBasics.tasksB.Communarka;

import com.it.JD01.javaBasics.tasksB.entity.*;

import java.util.Random;

/**
 * Created by Denis on 02.11.2017.
 */
public class Communarka extends Candy implements Manufacturer{
    public Communarka() {
    }

    @Override
    public CandyWithChop createCandyWithChop() {
        return new CandyWithChop(20,"Столичные", 40);
    }

    @Override
    public CandyWithFried createCandyWithFried() {
        return new CandyWithFried(40, "Грильяж Микс", 50);
    }

    @Override
    public CandyWithLiqueurAndJelly createCandyWithLiqueurAndJelly() {
        return new CandyWithLiqueurAndJelly(10,"Беловежская Пуща", 4,7);
    }

    @Override
    public CandyWithMilkAndChocolate createCandyWithMilAndChocolate() {
        return new CandyWithMilkAndChocolate(50,"Тоффетка", 5,7);
    }

    @Override
    public ChocolateDark createChocolateDark() {
        return new ChocolateDark(20,"Аленка", 50, 50, false,false);
    }

    @Override
    public ChocolateMilk createChocolateMilk() {
        return new ChocolateMilk(40, "Коммунарка", 50, 10,false, false, 30);
    }

    @Override
    public ChocolateDark createChocolateDarkWithAlmonds() {
        return new ChocolateDark(20,"Аленка с орехами", 50, 50, false,true);
    }

    @Override
    public ChocolateDark createChocolateDarkWithFruits() {
        return new ChocolateDark(20,"Аленка с фруктами", 50, 50, true,false);
    }

    @Override
    public ChocolateMilk createChocolateMilkWhithAlmonds() {
        return new ChocolateMilk(40, "Коммунарка с орехами", 50, 10,false, true, 30);
    }

    @Override
    public ChocolateMilk createChocolateMilkWhithFruits() {
        return new ChocolateMilk(40, "Коммунарка с фруктами", 50, 10,true, false, 30);
    }
}
