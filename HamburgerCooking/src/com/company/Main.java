package com.company;

import com.company.Ingredients.Sauce;
import com.company.Ingredients.breads.WhiteBread;
import com.company.Ingredients.cutlets.ChickenCutlet;
import com.company.Ingredients.sauces.CheesySauce;
import com.company.Ingredients.viggies.TomatoesViggie;
import com.company.picker.ClassicBurgerBuilder;

public class Main {

    public static void main(String[] args) {

        WhiteBread whiteBread = new WhiteBread();
        ChickenCutlet chickenCutlet = new ChickenCutlet();
        CheesySauce cheesySauce = new CheesySauce();
        TomatoesViggie tomatoesViggie = new TomatoesViggie();

        BurgerBuilder classicBurgerBuilder = new ClassicBurgerBuilder();

        Burger burger = classicBurgerBuilder
                .addBread(whiteBread)
                .addCutlet(chickenCutlet)
                .addSauce(cheesySauce)
                .addVeggies(tomatoesViggie)
                .build();

        System.out.println(burger);
    }
}
