/**
 * EKSAMENSSPØRGSMÅL I PROGRAMMERING
 * Dette interface repræsenterer sammen med klassen "Polymorfi" spg. 9 omkring polymorfi i Java.
 * @author Daniel Lyck
 * @since december 2017
 */

//Package hvori Source Code er lokaliseret
package dk.n4;

//Ordet "class" er her skiftet ud med "interface"
public interface Karakter {

    //Metoder i interfaces er "public abstract" pr. definition
    void karakter(); //I et interface angives kun metodehovedet, kroppen defineres først i klassen

}