package com.company;

public class Burger {
    private String bread;
    private String cutlet;
    private String sauce;
    private String vegetables;

    Burger(){
        super();
    }

    public Burger(String _bread, String _cutlet, String _sauce, String _vegetables){
            this();
            bread = _bread;
            cutlet = _cutlet;
            sauce = _sauce;
            vegetables =_vegetables;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCutlet() {
        return cutlet;
    }

    public void setCutlet(String cutlet) {
        this.cutlet = cutlet;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public boolean doQualityCheck() {
        return (bread != null && !bread.trim().isEmpty()) && (cutlet != null && !cutlet.trim().isEmpty())
                && (sauce != null && !sauce.trim().isEmpty()) && (vegetables != null && !vegetables.trim().isEmpty());
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Car [bred=").append(bread).append(", cutlet=").append(cutlet)
                .append(", sauce=").append(sauce).append(", vegetables=").append(vegetables);
        return builder.toString();
    }
}
