package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    int a,b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    public ComplexNum(){

    }

    @Override
    public String toString(){

        if (b>=0) return a + "+" + b + "i";
        else return a + "+" + (-b) + "i";
    }

    public ComplexNum add(ComplexNum num){
        ComplexNum temp = new ComplexNum();
        temp.a = a + num.a;
        temp.b = b + num.b;
        return (temp);
    }
    public ComplexNum sub(ComplexNum num){
        ComplexNum temp = new ComplexNum();
        temp.a = a - num.a;
        temp.b = b - num.b;
        return (temp);
    }
    public ComplexNum mul(ComplexNum num){
        ComplexNum temp = new ComplexNum();
        temp.a = (a * num.a) - (b * num.b);
        temp.b = (b * num.a) + (a * num.b);
        return (temp);
    }
    public ComplexNum div(ComplexNum num){
        ComplexNum temp = new ComplexNum();
        temp.a = (a * num.a) + (b * num.b) / (num.a*num.a + num.b*num.b);
        temp.b = (b * num.a) - (a * num.b) / (num.a*num.a + num.b*num.b);
        return (temp);
    }

    public static void main(String[] args) {


    }


}
