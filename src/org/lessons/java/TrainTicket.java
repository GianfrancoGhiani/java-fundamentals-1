package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {

//   Esercizio 1: Calcolo biglietto del treno
//   Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere e l’età del
//   passeggero (numero intero). Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio,
//   secondo queste regole:
//   il prezzo del biglietto è definito in base ai km (0.21 € al km)
//   va applicato uno sconto del 20% per i minorenni
//   va applicato uno sconto del 40% per gli over 65
//   Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
//   Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat
    public static void main(String[] args) {
        // adding a listener to incoming data from System
        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometers will you travel?");
        //pick up the String value and parse it to an int
        int tripKm = Integer.parseInt(input.nextLine());
        System.out.println("How old are you?");
        //pick up the String value and parse it to an int
        int age = Integer.parseInt(input.nextLine());


        double priceToKm = 0.21;
        double totalPrice;
        DecimalFormat dec = new DecimalFormat("####.##");
        String message;
        if (age<18){
            totalPrice = (priceToKm - (priceToKm/100 * 20)) * tripKm;
            message = "You are underage so you have 20% of discount, the ticket price is: €";
        } else if (age>65) {
            totalPrice = (priceToKm - (priceToKm/100 * 40)) * tripKm;
            message = "You are elderly so you have 40% of discount, the ticket price is: €";
        } else {
            totalPrice = priceToKm * tripKm;
            message = "The ticket price is: €";
        }
        message+= dec.format(totalPrice);
        System.out.println(message);
    }
}
