package ru.progwards.java1.lessons.classes;

public class Animal {

    double weight;

    public Animal(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){

        double foodCoeff = 0.02;
        return foodCoeff;
    }
    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }

    @Override
    public String toString(){
        String aboutAnimal = "I am " + getKind() + ", eat " + getFoodKind();
        return aboutAnimal;
    }


}
