package PrimeThreadsEfficent;

import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String args[])
    {
        part1 t1 = new part1();
        part2 t2 = new part2();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Scanner sc = new Scanner(System.in);

        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class part1 extends Thread {
    public synchronized void run()
    {
        int i = 0;
        int num = 1;
        int num_Primes = 1;
        boolean didnt_Break = true;

        for (i = 3; i <= 350000; i++) {
            didnt_Break = true;
            for (num = 2; num <= Math.sqrt(i); num++) {
                if (i % num == 0) {
                    didnt_Break = false;
                }
            }

            if (didnt_Break) {
                num_Primes++;
            }
        }

        System.out.println( "There are " + num_Primes +" prime numbers between 0 and 350000 . ");
    }
}

class part2 extends Thread {
    public synchronized void run()

    {
        int i = 0;
        int num = 1;
        int num_Primes = 1;
        boolean didnt_Break = true;

        for (i = 350000; i <= 500000; i++) {
            didnt_Break = true;
            for (num = 2; num <= Math.sqrt(i); num++) {
                if (i % num == 0) {
                    didnt_Break = false;
                }
            }

            if (didnt_Break) {
                num_Primes++;
            }
        }

        System.out.println("There are " + num_Primes +" prime numbers between 350000 and 500000. ");
    }
}
