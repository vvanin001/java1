package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {



    public Duck(double weight){
        super(weight);
    }

    @Override
    public AnimalKind getKind(){
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff(){
        double foodCoeff = 0.04;
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
