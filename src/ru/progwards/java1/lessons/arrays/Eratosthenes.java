package ru.progwards.java1.lessons.arrays;


public class Eratosthenes {

    private boolean[] sieve;

    public Eratosthenes(int N){

        sieve = new boolean[N];
        for (int i = 0; i < N; i++) {
            sieve[i] = true;
        }
        sift(sieve);
    }


    private static void sift(boolean[] bArray) {
        for (int a = 2; a < bArray.length-1; a++) {
            for (int b = 2; b <= a; b++) {

                if ((a%b == 0) & (a/b != 1)) {

                    bArray[a] = false;
                    System.out.println(a + " - составное число");
                    System.out.println(bArray[a]);
                    break;
                }
                else if ((a%b==0) & (a/b == 1)) {

                    System.out.println(a + " - простое число");
                    System.out.println(bArray[a]);
                    bArray[a] = true;
                }
            }
        }
    }
    public boolean isSimple(int n){

        return sieve[n];
    }

    public static void main(String[] args) {

        //eratosthenes(100);
        Eratosthenes er = new Eratosthenes(20);
        System.out.println("простое или составное " + er.isSimple(5));

    }

}
