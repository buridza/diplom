package com.it.JD01.javaBasics.tasksB.Communarka;

import com.it.JD01.javaBasics.tasksB.entity.*;

public class Roshen extends Candy implements Manufacturer{
    @Override
    public CandyWithChop createCandyWithChop() {
        return new CandyWithChop(30,"Столичные", 50);
    }

    @Override
    public CandyWithFried createCandyWithFried() {
        return new CandyWithFried(10, "Грильяж Микс", 30);
    }

    @Override
    public CandyWithLiqueurAndJelly createCandyWithLiqueurAndJelly() {
        return new CandyWithLiqueurAndJelly(5,"Беловежская Пуща", 8,10);
    }

    @Override
    public CandyWithMilkAndChocolate createCandyWithMilAndChocolate() {
        return new CandyWithMilkAndChocolate(53,"Тоффетка", 5,12);
    }

    @Override
    public ChocolateDark createChocolateDark() {
        return new ChocolateDark(20,"Шоколадка", 50, 50, false,false);
    }

    @Override
    public ChocolateMilk createChocolateMilk() {
        return new ChocolateMilk(42, "Roshen", 74, 26,false, false, 36);
    }

    @Override
    public ChocolateDark createChocolateDarkWithAlmonds() {
        return new ChocolateDark(20,"Шоколадка с орехами", 50, 50, false,false);
    }

    @Override
    public ChocolateDark createChocolateDarkWithFruits() {
        return new ChocolateDark(20,"Шоколадка с фруктами", 50, 50, false,false);
    }

    @Override
    public ChocolateMilk createChocolateMilkWhithAlmonds() {
        return new ChocolateMilk(42, "Roshen с орехами", 74, 26,false, false, 36);
    }

    @Override
    public ChocolateMilk createChocolateMilkWhithFruits() {
        return new ChocolateMilk(42, "Roshen с фруктами", 74, 26,false, false, 36);
    }
}
