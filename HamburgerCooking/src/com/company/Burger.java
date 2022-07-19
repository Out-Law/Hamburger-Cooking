package com.company;

import com.company.Ingredients.Bread;
import com.company.Ingredients.Cutlet;
import com.company.Ingredients.Sauce;
import com.company.Ingredients.Viggie;

public class Burger {
    private String bread;
    private String cutlet;
    private String sauce;
    private String veggies;

    Burger(){
        super();
    }

    public Burger(String _bread, String _cutlet, String _sauce, String _veggies){
            bread = _bread;
            cutlet = _cutlet;
            sauce = _sauce;
            veggies =_veggies;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread.getName();
    }

    public String getCutlet() {
        return cutlet;
    }

    public void setCutlet(Cutlet cutlet) {
        this.cutlet = cutlet.getName();
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce.getName();
    }

    public String getVegetables() {
        return veggies;
    }

    public void setVegetables(Viggie veggies) {
        this.veggies = veggies.getName();
    }

    public boolean doQualityCheck() {
        return (bread != null && !bread.trim().isEmpty()) && (cutlet != null && !cutlet.trim().isEmpty())
                && (sauce != null && !sauce.trim().isEmpty()) && (veggies != null && !veggies.trim().isEmpty());
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Car [bred=").append(bread).append(", cutlet=").append(cutlet)
                .append(", sauce=").append(sauce).append(", vegetables=").append(veggies);
        return builder.toString();
    }
}
