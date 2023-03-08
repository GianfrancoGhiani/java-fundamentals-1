package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

//        Esercizio 2: FizzBuzz
//        Consegna: Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi “Fizz”
//        al posto del numero e per i multipli di 5 stampi “Buzz”. Per i numeri che sono sia multipli di 3 che di 5 stampi “FizzBuzz”.
//        Esempio: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz……
//        Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)
        Scanner input = new Scanner(System.in);

        int inputNum = 0;
        do{
            System.out.println("Insert a number between 0 and 1000");
            inputNum = Integer.parseInt(input.nextLine());
        }while((inputNum <= 0) && (inputNum >1000));
        for (int i = 1; i <= inputNum; i++) {
            if ((i % 3) == 0 && (i % 5)== 0){
                System.out.println("FizzBuzz");
            } else if ((i % 5)== 0) {
                System.out.println("Buzz");
            }else if ((i % 3) == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}
