package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public class Computer extends Player {
    String [] names = {"Вова", "Влад", "Маша", "Таня", "Петя", "Ваня"};
    public Computer(Intellect intellect) {
        super("", intellect);
        Double a = Math.random();
        int p = (int)(a*names.length);
        name = names[p];

        }



}
