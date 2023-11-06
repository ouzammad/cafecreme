package com.cafe;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    int un_euro=100 ;
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Bonjour! Je suis l'assistant de la machine à café. Dites moi les pieces jaunes dont vous disposez:");
    System.out.print("pieces de 1 cent");
    int un_cent= sc.nextInt();
    System.out.print("pieces de 5 cents");
    int cinq_cents= sc.nextInt();
    System.out.print("pieces de 10 cents");
    int dix_cents= sc.nextInt();
    System.out.print("pieces de 20 cents");
    int vingt_cents= sc.nextInt();
    System.out.print("pieces de 50 cents");
    int cinquante_cents= sc.nextInt();
    int somme = un_cent*1 + cinq_cents*5 + dix_cents*10 + vingt_cents*20 + cinquante_cents*50;
    int différence= un_euro-somme;
    if (différence>0) {

        System.out.println("Il vous manque "+différence+ " cents pour prendre un cafe.");

    }
    else if (différence<0) {
        System.out.println("Il vous restera "+ Math.abs(différence)+ " cents apres avoir pris votre cafe !");
      
    }
    else{
          System.out.println("Vous avez exactement de quoi payer le café-creme");

    }
    }
    
}
