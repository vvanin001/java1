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

    @Override
    public double getFoodCoeff(){
        double foodCoeff = 0.03;
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

    public static void main(String[] args) {

        Hamster h1 = new Hamster(52.5);
        System.out.println(h1.toString());
        System.out.println(h1.toStringFull());
    }
}
