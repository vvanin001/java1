package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    //double weight;

    public Hamster(double weight){
        super(weight);
    }

    @Override
    public AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }

    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
}
