import java.util.Scanner;

/*
 * Project: Turmrechnung/Schleifen
 * Klasse: 1aAPC / 2023
 * Author: Lea Wieser
 * Last Change: 30.11.2023
 *    by:   wieserl
 *    date: 1.12.2023
 * Copyright (c): LBS Eibiswald, 2023
 */
public class Main {
    public static void main(String[] args) {

        int number1, result; //Variablendefinition
        Scanner myScan = new Scanner(System.in); //Scanner Objekt initialisieren
        System.out.println("Wollen Sie fortfahren? j/n:");
        String antwort = myScan.next();

        while (antwort == "j") {
            System.out.print("Geben Sie eine Zahl an: ");
            number1 = myScan.nextInt();

            for (int i = 1; i <= 9; i++){ //For-Schleife für die Multiplikation
                result = number1 * i;
                System.out.println(i+" * "+number1+" = "+ result);
                number1 = result;
            }
            for (int i = 1; i <= 9; i++){ //For-Schleife für die Divsion
                result = number1 / i;
                System.out.println(i+" : "+number1+" = "+result);
                number1 = result;
            }
        }
    }
}