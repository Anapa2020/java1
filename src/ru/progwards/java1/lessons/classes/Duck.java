package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{

    public Duck(double weight) {
        super(weight);
    }
    public AnimalKind getKind(){
        return AnimalKind.DUCK;
    }
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    public double getFoodCoeff(){
        return 0.04;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
