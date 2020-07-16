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
}
