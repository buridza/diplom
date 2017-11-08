package com.it.JD01.javaBasics.tasksB.entity;

import java.util.Comparator;

public class CandyByMassComparator implements Comparator<Candy>{
    @Override
    public int compare(Candy o1, Candy o2) {
        if(o1.getMass()==o2.getMass())
            return 0;
        if(o1.getMass()>o2.getMass())
            return 1;
        else return -1;
    }
}
