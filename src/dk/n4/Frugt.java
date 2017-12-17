/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer sammen med klassen "Banan" spg. 8 omkring nedarvning i Java.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Access Modifier og klassenavn
public class Frugt {

    //Klassevariabler
    int alder;
    String importeretFra;
    String eksporteretTil;

    //Constructors
    public Frugt() { //No-arg-constructor
    }

    public Frugt(int alder, String importeretFra, String eksporteretTil) { //Tager imod tre parametre
        this.alder = alder;
        this.importeretFra = importeretFra;
        this.eksporteretTil = eksporteretTil;
    }

    //Metoder
    public void dejligSmag() { //Returnerer ikke noget, og tager ikke imod nogen parametre
        System.out.println("Denne frugt smager herligt!");
    }

}
