package com.it.JD01.javaBasics.tasksB.Communarka;

import com.it.JD01.javaBasics.tasksB.entity.*;

/**
 * Created by Denis on 02.11.2017.
 */
abstract public interface Manufacturer{
   abstract public CandyWithChop createCandyWithChop();
   abstract public CandyWithFried createCandyWithFried();
   abstract public CandyWithLiqueurAndJelly createCandyWithLiqueurAndJelly();
   abstract public CandyWithMilkAndChocolate createCandyWithMilAndChocolate();
   abstract public ChocolateDark createChocolateDark();
   abstract public ChocolateMilk createChocolateMilk();
   abstract public ChocolateDark createChocolateDarkWithAlmonds();
   abstract public ChocolateDark createChocolateDarkWithFruits();
   abstract public ChocolateMilk createChocolateMilkWhithAlmonds();
   abstract public ChocolateMilk createChocolateMilkWhithFruits();
}
