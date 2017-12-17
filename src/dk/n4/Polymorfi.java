/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer sammen med interfacet "Karakter" spg. 9 omkring polymorfi i Java.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//For at et interface kan implementeres med keywordet "implements" skal klassen være abstrakt
public abstract class Polymorfi implements Karakter {

    //Her definerer vi metodekroppen fra det interface, vi implementerer (Karakter)
    @Override
    public void karakter() {
        System.out.println("Daniel bør få 12! :)");
    }

    public static void main(String[] args) {

        //Opretter et nyt Banan-objekt, men med mulighed for egenskaber fra "Frugt" (implicit casting)
        Frugt modenBanan = new Banan(1,"Ghana","Sverige"); //Is-a-relationship

        /**
         * Variablens type, her er det "Frugt", bestemmer hvilke metoder, der er MULIGE at kalde. Objektets type,
         * her er det "Banan", bestemmer hvilken metodekrop, der bliver udført, hvis en metode kaldes.
         */

        /* Banan forkertBanan = new Frugt();
        Ovenstående kan IKKE lade sig gøre, da en frugt ikke nødvendigvis er en banan! */

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Herunder angiver jeg, at variablen "modenBanan2" skal være lig med "modenBanan".

        Banan modenBanan2 = (Banan)modenBanan; //Dette kaldes "explicit casting"

        /**
         * Hvis jeg IKKE type caster "modenBanan" til at være af klassen "Banan", så vil compileren håndtere objektet
         * som "Frugt" og give fejl. Den tænker: "Jamen du fortalte mig jo tidligere, at "modenBanan" skulle være at
         * typen "Frugt".
         * Jeg er derfor nødt til at fortælle compileren, at det er en banan, ved at skrive (banan) foran. */

    }

}
