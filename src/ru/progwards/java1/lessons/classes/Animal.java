package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    public Animal(double weight){
    this.weight = weight;
    }

    enum AnimalKind{
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
        ;


    }
    enum FoodKind{
        UNKNOWN,
        HAY,
        CORN,
    }

    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }
    public String toString(){
        return "I am" +  getKind() +"," + "eat" + getFoodKind();
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){
        return getWeight()*getFoodCoeff();
    }
    public String toStringFull(){
        return "I am " + getKind() + "," + "eat " + getFoodKind() + calculateFoodWeight();
    }
    public static void main(String[] args) {

        System.out.println(" I am  " + AnimalKind.ANIMAL +", eat " + FoodKind.UNKNOWN);
        System.out.println(" I am  " + AnimalKind.COW +", eat " + FoodKind.HAY);
        System.out.println(" I am  " + AnimalKind.HAMSTER +", eat " + FoodKind.CORN);
        System.out.println(" I am  " + AnimalKind.DUCK +", eat " + FoodKind.CORN);
    }
}


