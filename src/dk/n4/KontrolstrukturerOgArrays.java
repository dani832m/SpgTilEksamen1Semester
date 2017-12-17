/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Denne klasse repræsenterer spg. 4-6 omkring kontrolstrukturer, arrays og ArrayLists.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Importerer nødvendige klasser
import java.util.ArrayList;

//Klassenavn defineres og Access Modifier angives
public class KontrolstrukturerOgArrays {

    public static void main(String[] args) {

        /** KONTROLSTRUKTURER */

        //Eksempel på et simpelt if/else-statement
        double bmi = 23; //Deklareret og initialiseret variabel

        if (bmi < 18.5) //Hvis dette er sandt, så udskrives der en tekst til konsollen
            System.out.println("Du er undervægtig.");
        else if (bmi < 25) //Hvis dette er sandt, så udskrives der en tekst til konsollen
            System.out.println("Du er normalvægtig.");
        else if (bmi < 30) //Hvis dette er sandt, så udskrives der en tekst til konsollen
            System.out.println("Du er overvægtig.");
        else //Hvis dette er sandt, så udskrives der en tekst til konsollen
            System.out.println("Du lider af fedme.");

        //Eksempel på en while-løkke
        int count = 1; //Deklareret og initialiseret variabel

        while (count < 11) { //Kørselsbetingelse: "count" skal være mindre end 11
            System.out.println(count + " elefant(er)"); //Hvis kørselsbetingelsen er sand, udføres dette
            count++; //Der lægges 1 til variablen "count"
        } //Kørselsbetingelsen vurderes igen

        //Eksempel på do-while-løkke
        int hello = 1; //Deklareret og initialiseret variabel

        do { //Dette udføres én gang uanset kørselsbetingelse
            System.out.println("Jeg siger 'Hej' " + hello + " gang(e)");
            hello++; //Der lægges 1 til variablen "hello"
        } while (hello < 6); //Kørselsbetingelse: "hello" skal være mindre end 6

        //Eksempel på for-loop
        for (int i = 1; i < 6; i++) { //Deklarering, initialisering, kørselsbetingelse og inkrementering på én gang
            System.out.println(i + " pølse(r)");
        }

        /** ARRAYS */

        //Eksempel på oprettelse og gennemløb af et almindeligt array
        int[] mitArray = new int[5]; //"mitArray" deklareret og initialiseret som nyt array af integers m. 10 elementer

        //Indexes i arrayet initialiseres
        mitArray[0] = 10; //På index 0 indsættes værdien 10
        mitArray[1] = 21; //På index 1 indsættes værdien 21
        mitArray[2] = 23; //Osv.
        mitArray[3] = 54;
        mitArray[4] = 121;

        //Vi viser, hvad der er på et konkret index i arrayet
        System.out.println(mitArray[3]);

        //Alternativt kan selve initialiseringen af elementer til arrayet også foregå, når man erklærer det
        int[] mitArray2 = { 32, 84, 44, 121, 542 };

        //Et array kan også gennemløbes vha. et loop
        int[] mitArray3 = new int[5];

        //Vi laver et for-loop der kører, så længe variablen "i" er mindre end antallet af elementer i vores array
        for (int i = 0; i < mitArray3.length; i++) {
            mitArray3[i] = i; //Initialiserer i-værdien til i'ende plads i arrayet
        }

        //Elementerne i et array kan printes/fremvises på flere forskellige måder. Her viser jeg det vha. et loop
        for (int i = 0; i < mitArray3.length; i++) {
            System.out.print(mitArray3[i] + "  ");
        }

        //Ovenstående demonstrerer "single dimensional arrays" - der findes også "multi dimensional arrays"
        int[][] multiArray = { {1, 2, 3}, {2, 4, 5}, {4, 4, 5} }; //Todimensional array
        //Resultatet af dette vil blive et array med tre "rækker" - og altså to dimensioner

        /** ARRAYLIST */

        //Eksempel på oprettelse af ArrayList
        ArrayList<String> obj = new ArrayList<>(); //Bemærk vi ved ArrayList bruger <> og ved alm. array []

        //Sådan tilføjer man elementer til sit ArrayList
        obj.add("Bent"); //Variabelnavn.add(Indhold);
        obj.add("Helle");
        obj.add("Tina");
        obj.add("Knud");
        obj.add("Nikita");

        //Viser indholdet i vores ArrayList
        System.out.println("Vi har disse navne i vores array lige nu: " + obj);

        //Du kan tilføje indhold til et konkret index
        obj.add(0, "Karsten");
        obj.add(1, "Douglas");

        //Du kan fjerne elementer i et array ved at angive værdien
        obj.remove("Knud");
        obj.remove("Nikita");

        System.out.println("Nu er indholdet i vores array: " + obj);

        //Du kan ligeledes fjerne et element ved at angive, hvilket index det befinder sig på
        obj.remove(1);

    }

}
