package com.company;

import com.company.Ingredients.Bread;
import com.company.Ingredients.Cutlet;
import com.company.Ingredients.Sauce;
import com.company.Ingredients.Viggie;

public interface BurgerBuilder {

    public BurgerBuilder addBread(Bread bread);
    public BurgerBuilder addCutlet(Cutlet cutlet);
    public BurgerBuilder addSauce(Sauce sauce);
    public BurgerBuilder addVeggies(Viggie viggie);

    // End
    public Burger build();


}
