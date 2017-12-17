/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer spg. 7 omkring Exceptions i Java.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Importerer nødvendige klasser
import java.util.InputMismatchException;
import java.util.Scanner;

//Access Modifier og klassenavn
public class Exceptions {

    public static void main(String[] args) {

        //Deklarerer og initialiserer nyt Scanner-objekt
        Scanner input = new Scanner(System.in);

        //Try-block - Afvikles, hvis brugeren indtaster valid input
        try {
            System.out.print("Indtast din alder: ");
            int alder = input.nextInt();
            System.out.println("Du påstår, at du er " + alder + " år gammel.");
        }

        //Catch-block - Hvis brugeren IKKE indtaster heltal, bliver det catched og fejlbesked gives
        catch (InputMismatchException e) {
            System.out.print("Din alder skal bestå af et helt tal.");
        }

    }

}
