package ru.progwards.java1.lessons.arrays;


public class Eratosthenes {

    public static int [] eratosthenes (int arrayLength){
        int count=0;
        int [] arrayForCopy = new int[arrayLength];
        System.out.println("Инициируем массив числами с 2 до заданного значения");
        int [] abc_array = new int[arrayLength];
        for (int a = 2; a < arrayLength+2; a++) {
            abc_array[count] = a;
            count++;
        }

        System.out.println("выводим инициализированный массив на печать");

        for (int a = 0; a < abc_array.length; a++) {
            //System.out.print(abc_array[a] + " ; ");

        }
        System.out.println("  ");

        for (int a = 0; a < abc_array.length; a++) {
            for (int b = 2; b <= abc_array[a]; b++) {

                if ((abc_array[a]%b == 0) & (abc_array[a]/b != 1)) {
                    break;
                }
                else if ((abc_array[a]%b==0) & (abc_array[a]/b == 1)) {
                    //System.out.println( abc_array[a] + " - простое число");
                    arrayForCopy[a] = abc_array[a];
                }


            }
        }

        int arrayFinal [] = new int[arrayForCopy.length];

        for (int a = 0; a < arrayForCopy.length; a++) {

            int c = 0;

            if (arrayForCopy[a] != 0){
                arrayFinal [c] = arrayForCopy[a];
                System.out.println("hellow " + arrayFinal [c]);
                c++;
            }
        }

        int arrayFinal2 [] = new int[arrayLength];

        for (int a = 0; a < arrayLength; a++){
            int c = 0;
            if (arrayForCopy[a] ==0) break;
            else arrayFinal2 [0] = arrayForCopy[a];
            c++;
        }
        for (int a : arrayFinal2) {
            System.out.print("privet 2 : " + a + "; ");
        }

        System.out.println("arrayFinal.length : " + arrayFinal.length);



        System.out.println("выводим массива простых чисел");

        for (int a : arrayFinal) {
            System.out.print(a + " ");

        }

        return arrayForCopy;
    }

    public static void main(String[] args) {

        eratosthenes(100);
    }

}
