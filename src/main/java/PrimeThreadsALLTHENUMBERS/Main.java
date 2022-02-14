package PrimeThreadsALLTHENUMBERS;

import java.util.Scanner;


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
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 350000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {


                if (i % num == 0) {


                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 0 to 350'000 : \n"
                + primeNumbers);


    }
}


class part2 extends Thread {
    public synchronized void run()
    {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 350001; i <= 500000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {


                if (i % num == 0) {


                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 350001 to 500000 : \n"
                + primeNumbers);


    }
}
