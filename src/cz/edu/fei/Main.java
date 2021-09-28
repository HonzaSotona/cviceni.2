package cz.edu.fei;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //načítání jména a přijmení
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadejte jmeno a přijmení");
        String text = vstup.nextLine();
        System.out.println(text + "\n");

        //Číslo - zápor, kladné či nula

        Scanner cislo = new Scanner(System.in);
        System.out.println("Zadejte číslo");
        int zadani = cislo.nextInt();
        System.out.println("Zadané číslo " + zadani);

            //Nula + zápor + kladné
        if (zadani == 0){
                System.out.println("Číslo které jste zadali je nula");
        }else if (zadani < 0){
                System.out.println("Zadali jste záporné číslo");
        }else if (zadani > 0){
                System.out.println("Zadali jste kladné číslo \n");



        }
            //porovnání čísel
      //  double a1 = 10.5, a2 = 5.6, a3 = 9.1;

        System.out.println("Porovnávač čísel ");

        Scanner cislo1 = new Scanner(System.in);
        System.out.println("Zadejte první číslo: ");
        double a1 = cislo1.nextDouble();

        Scanner cislo2 = new Scanner(System.in);
        System.out.println("Zadejte druhé číslo: ");
        double a2 = cislo1.nextDouble();

        Scanner cislo3 = new Scanner(System.in);
        System.out.println("Zadejte třetí číslo: ");
        double a3 = cislo1.nextDouble();

        if (a1 > a2) {
            if (a1 > a3)
                System.out.println(a1 + " je největší číslo");
            else
                System.out.println(a3 + " je největší číslo");
        }else{
            if (a2 > a3)
                System.out.println(a2 + " je největší číslo");
            else
                System.out.println(a3 + " je největší číslo");
        }


    }

}
