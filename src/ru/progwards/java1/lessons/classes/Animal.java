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

    public double calculateFoodWeight(){
        double foodWieght = weight * getFoodCoeff();
        return foodWieght;
    }

    public String toString(){
        String toString = "I am " + getKind() + ", eat " + getFoodKind();
        return toString;
    }

    public String toStringFull(){
        String aboutAnimal = "I am " + getKind() + ", eat " + calculateFoodWeight();
        return aboutAnimal;
    }


    public static void main(String[] args) {
        Animal a1 = new Animal(25.1);
        System.out.println(a1.toString());
        System.out.println(a1.toStringFull());


    }

}
