package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    public Hamster(double weight) {
        super(weight);
    }
    public AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    public double getFoodCoeff(){
        return  0.03;
    }

    @Override
    public String toStringFull() {
        return super.toStringFull();
    }
}
