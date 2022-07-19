package com.company.picker;

import com.company.Burger;
import com.company.BurgerBuilder;
import com.company.Ingredients.Bread;
import com.company.Ingredients.Cutlet;
import com.company.Ingredients.Sauce;
import com.company.Ingredients.Viggie;

public class ClassicBurgerBuilder implements BurgerBuilder {
    private String bread;
    private String cutlet;
    private String sauce;
    private String viggie;

    @Override
    public BurgerBuilder addBread(Bread bread) {
        this.bread = bread.getName();
        return this;
    }

    @Override
    public BurgerBuilder addCutlet(Cutlet cutlet) {
        this.cutlet = cutlet.getName();
        return this;
    }

    @Override
    public BurgerBuilder addSauce(Sauce sauce) {
        this.sauce = sauce.getName();
        return this;
    }

    @Override
    public BurgerBuilder addVeggies(Viggie viggie) {
        this.viggie = viggie.getName();
        return this;
    }

    @Override
    public Burger build() {
        return new Burger(bread, cutlet, sauce, viggie);
    }
}
