package com.company;

public interface BurgerBuilder {

    // Этап 1
    public BurgerBuilder fixChassis();

    // Этап 2
    public BurgerBuilder fixBody();

    // Этап 3
    public BurgerBuilder paint();

    // Этап 4

    public BurgerBuilder fixInterior();

    // Выпуск автомобиля

    public Burger build();


}
