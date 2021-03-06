package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    double weight;

    public Cow(double weight){
        super(weight);
    }

    @Override
    public AnimalKind getKind(){
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind(){
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff(){
        double foodCoeff = 0.05;
        return foodCoeff;
    }

    @Override
    public String toString(){
        String toString = "I am " + getKind() + ", eat " + getFoodKind();
        return toString;
    }

    @Override
    public String toStringFull() {
        String aboutAnimal = "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
        return aboutAnimal;
    }
}