package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{

    public Cow(double weight) {
        super(weight);
    }
    public AnimalKind getKind(){
        return AnimalKind.COW;
    }
    public FoodKind getFoodKind(){
        return FoodKind.HAY;
    }
    public double getFoodCoeff(){
        return 0.05;
    }
}
