/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer spg. 1-3. Metoder og constructors sættes i spil i klassen "RunMedarbejder"
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Klassenavn defineres og Access Modifier angives
public class Medarbejder {

    //Instansvariabler
    private String navn = "NONAME"; //Deklarering og initialisering af en instansvariabel
    private int alder = 0; //Andet eksempel på deklarering og initialisering af en instansvariabel
    private char afdeling;
    private String stilling;

    //Constructors
    public Medarbejder() { //En default constructor, også kaldet no-arg-constructor
    }

    public Medarbejder(String navn, int alder) { //En constructor, der tager to parametre
        //Meddeler, at parametrene er lig instansvariablerne
        this.navn = navn;
        this.alder = alder;
    }

    public Medarbejder(String navn, int alder, char afdeling, String stilling) { //Her tages fire parametre
        //Meddeler, at parametrene er lig instansvariablerne
        this.navn = navn;
        this.alder = alder;
        this.afdeling = afdeling;
        this.stilling = stilling;
    }

    //Methods
    public String getNavn() { //En metode, der returnerer variablen "navn" (En getter)
        System.out.println("Medarbejderen hedder " + navn + ".");
        return navn;
    }

    public void setNavn(String navn) { //En metode, der setter variablen "navn" (En setter)
        this.navn = navn;
        System.out.println("Medarbejderens navn er nu sat til at være: " + navn + ".");
    }

    public int getAlder() { //En metode, der returnerer variablen "alder" (En getter)
        System.out.println("Medarbejderen er " + alder + " år gammel.");
        return alder;
    }

    public void setAlder(int alder) { //En metode, der setter variablen "alder" (En setter)
        this.alder = alder;
        System.out.println("Medarbejderens alder er nu sat til at være: " + alder + " år gammel.");
    }

    public void hils() { //En metode, hvor der anvendes en lokal variabel - "sigHej"
        String sigHej = "Du hilste på medarbejderen '" + navn + "'."; //Lokal variabel deklareret/initialiseret
        System.out.println(sigHej);
    }

}