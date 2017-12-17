/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer spg. 10 omkring algoritmer (Ekstra show-off).
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Importerer klassen "Arrays"
import java.util.Arrays;

public class SortingArrayWithMethod {

    //Main Method
    public static void main(String[] args) {

        //Deklarerer og initialiserer et usorteret array
        int[] array = { 2, 1, 9, 6, 4 };

        //For-loop der printer det usorterede array
        System.out.println("Det usorterede array udgør:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + array[i]);
        }

        //Her anvender vi klassen "Arrays" metode "sort()" til at sortere integer-værdierne i vores array
        Arrays.sort(array);

        //For-loop der printer det nu sorterede array
        System.out.println("Det sorterede array udgør:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + array[i]);
        }

    }

}