/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer sammen med klassen "Frugt" spg. 8 omkring nedarvning i Java.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Jeg anvender keywordet "extends" for at nedarve egenskaber og metoder fra klassen "Frugt"
public class Banan extends Frugt {

    //Klassevariabler, der er særlige for denne klasse
    int antalBrunePletter;

    //Constructors
    /**
     * Hvis jeg vil anvende constructoren fra klassen "Frugt" til at instantiere et objekt af klassen "Banan",
     * skal den kaldes med keywordet "super". Signaturen skal være den samme som ved constructoren i superklassen
     * (altså med tre parametre)
     */
    public Banan(int alder, String importeretFra, String eksporteretTil) {
        super(alder, importeretFra, eksporteretTil); //Kalder superklassens constructor
        /**
         * Vi kunne også navngive de tre parametre noget andet. Det vigtige er, at antal og type af parametrene
         * er de samme som i vores constructor i superklassen
         */
    }

    //Jeg kunne altså instantiere et nyt Banan-objekt således:
    Frugt modenBanan = new Banan(1, "Ghana", "Sverige");

}