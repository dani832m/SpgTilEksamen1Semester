/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse instantierer bl.a. objekter ud fra klassen "Medarbejder" og demonstrerer typecasting.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Access Modifier og klassenavn
public class RunMedarbejder {

    //Eksekverer programkoden (Main Method)
    public static void main(String[] args) {

        //Tre medarbejdere instantieres som objekter fra klassen "Medarbejder"
        Medarbejder medarbejder1 = new Medarbejder(); //No-arg-constructor anvendes
        Medarbejder medarbejder2 = new Medarbejder("Bobby",43); //To argumenter
        Medarbejder medarbejder3 = new Medarbejder("Hugo",32, 'D', "Lagerchef"); //Fire arg.

        //Vi kan manipulere objektet vha. metoderne fra klassen "Medarbejder"
        medarbejder1.setNavn("Ingolf"); //Vi angiver her navnet på objektet "medarbejder1"
        medarbejder1.setAlder(21); //Vi angiver her alderen på objektet "medarbejder1"

        medarbejder2.getNavn(); //Vi henter her navnet på "medarbejder2"
        medarbejder2.getAlder(); //Vi henter her navnet på "medarbejder2"

        medarbejder3.hils(); //Kalder metoden "hils", hvori der benyttes en lokal variabel

        //Eksempel på typecasting
        double TotaleKmTilAndeby = 482.32;
        double KmTilbagelagt = 21.9;
        double NuKmTilAndeby = TotaleKmTilAndeby - KmTilbagelagt;

        //Resultatet UDEN typecasting
        System.out.println("Vi ankommer til Andeby om: " + NuKmTilAndeby + " kilometer.");

        //Resultatet MED typecasting
        System.out.println("Vi ankommer til Andeby om: " + (int)NuKmTilAndeby + " kilometer.");

    }

}