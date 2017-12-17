/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer spg. 7 omkring Exceptions i Java. Her demonstreres et eksempel på "throw".
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Access Modifier og klassenavn
public class ThrowException {

    //Statisk metode, der ikke returnerer noget, men tager imod ét parameter
    static void hvorGammel(int alder) {
        //Hvis alderen sættes til under 18, så kastes en "ArithmeticException" tilbage i call stack'en
        if (alder < 18)
            throw new ArithmeticException("Ikke gammel nok!");
        else
            System.out.println("Du er gammel nok.");
    }

    public static void main(String args[]){
        hvorGammel(13); //Metoden testes
    }

}