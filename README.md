# Eksamensspørgsmål

Dette repository indeholder kildekode, kommentarer, JavaDoc og reel tekst, der tilsammen besvarer diverse eksamensspørgsmål i faget Programmering for 1. semester på uddannelsen til datamatiker. Alt er 100 % udarbejdet af mig selv.

## Spørgsmål i Programmering:

### 1. Variabel
**Forklar hvordan man erklærer og benytter variabel i Java.**

En variabel kan sammenlignes med en skuffe eller en æske. Det er således en beholder for data, som man let kan åbne og anvende samt referere til i sit javaprogram.
En variabel deklareres ved først at skrive hvilken datatype, variablen skal indeholde. Dernæst skriver man variablens navn og afslutter linjen med et semikolon. Man kan initialisere variablen på samme linje, som man deklarerer den, men man kan også gøre det på en ny linje.

**Vis et eksempel på erklæring og initialisering af hhv. en instansvariabel og en lokal variabel.**

En instansvariabel er en variabel, man laver i en klasse, man ønsker at instantiere objekter fra. Variablen kan anvendes i hele klassen, og man kan sige, at den følger det instantierede objekt. Man vil som regel gøre en instansvariabel "private" for at indkapsle og dermed beskytte variablerne.
En lokal variabel er en variabel, der optræder i eksempelvis en metode, et loop og lignende, men som ikke kan benyttes uden for metoden/loopet. Altså en variabel, der er begrænset til et _"Local Scope"._
I klassen _"Medarbejder"_ er eksempel på både deklarering/initialisering af en instansvariabel og en lokal variabel.

**Forklar hvilke datatyper, der er i Java.**

I Java kan man arbejde med følgende primitive datatyper: byte, short, int, long, float, double, boolean, char. (Se evt. png-fil)

**Vis et eksempel på typecasting fra double til int.**

Eksempel på typecasting kan findes i _"RunMedarbejder"._

### 2. Klasser og objekter
**Forklar sammenhæng mellem klasser og objekter i Java.**

I Java anvender man det, der kaldes objektorienteret programmering. Med OOP kan man stort set løse ethvert problem og konstruere de programmer, man ønsker.
En af grundstenene i OOP er opbygningen af klasser og instantiering af objekter.
En klasse fungerer som et blueprint eller en template. Den indeholder relevante variabler, constructors og metoder, og det er ud fra klassen, man instantierer x antal af objekter, som kan opføre sig sådan som klassen giver lov til.
Udefrakommende kan ikke redigere i klassevariablerne, da disse typisk er gjort private. Måden man kommunikerer og manipulerer med objekter instantieret fra klassen er vha. metoder (eks. getters/setters)

**Vis et eksempel på oprettelse af et objekt og anvendelse af objektet.**

Klassen _”Medarbejder”_ er et eksempel på opbygning af en klasse, og i _”RunMedarbejder”_ oprettes et objekt instantieret ud fra klassen.

### 3. Opbygning af en javaklasse
**Vis og forklar hvilke elementer en javaklasse består af.**

Først og fremmest navngives klassen og _"Access Modifiers"_ sættes til eksempelvis _"private"_ eller _"public"._ Selve klassen består typisk af instansvariabler/datafields, som er de egenskaber, de instantierede objekter har tilfælles. Dernæst består den af constructors, som er de "skabeloner", der bruges til at instantiere nye objekter ud fra. Afslutningsvis består klassen ofte af metoder, som er de værktøjer eller muligheder, der gives for at kommunikere med og styre objekterne. Se eksempel på en typisk opbygning af en javaklasse i _"Medarbejder"._

### 4. Kontrolstrukturer
**Hvilke kontrolstrukturer findes i java?**

I Java er der adskillelige muligheder for at selektere sin kode. Man kan anvende switch, if/else, for-loop, while-loop, do-while-loop og sågar exception handling.

**Vis eksempel på hhv. en if/else og en for-løkke eller en while-løkke.**

Eksempel på if/else og diverse løkker kan findes i klassen _"KontrolstrukturOgArrays"._

### 5. Arrays
**Forklar hvad arrays er, og hvordan de kan anvendes i et javaprogram.**

Et array er en beholder for data. Man kan sammenligne et array med en kommode med et antal skuffer - hver skuffe kan indeholde en værdi, som man kan tage frem og anvende.
Arrayets størrelse af "fixed" - når antallet af skuffer (eller indexes som det hedder) er bestemt, så kan dette ikke ændres. Datatypen i et array skal desuden være den samme for alle elementer.
Har man et antal af elementer i et Javaprogram, som alle kan defineres inde for den samme datatype, vil det derfor være hensigtsmæssig at initialisere dem til et array for bedre at kunne håndtere dem og holde styr på dem.

**Vis et eksempel på oprettelse af et array, og efterfølgende gennemløb af arrayet.**

Eksempel på oprettelse og gennemløb af et array kan ses i klassen _"KontrolstrukturerOgArrays"._

**Vis hvordan man hhv. indsætter data og trækker data ud af arrayet.**

Eksempel på initialisering af array og udprint af elementer kan ses i klassen _"KontrolstrukturerOgArrays"._

### 6. ArrayLists
**Vis eksempel på oprettelse af en ArrayListe og gennemløb af den.**

Eksempel på oprettelse og gennemløb af ArrayList kan ses i _"KontrolstrukturerOgArrays"._

**Sammenlign arrays og ArrayLists.**

Arrays er "fixed size" og ArrayList er dynamisk - den kan hele tiden udvides efter behov. Derfor anvendes et almindeligt array, hvis man på forhånd kender til antallet af elementer, der skal håndteres.

### 7. Exceptions
**Forklar hvad exceptions er og, hvordan man benytter dem i et javaprogram.**

Exception-håndtering bruges til at undgå "fejl", der forstyrrer den normale programeksekvering. Tillader man eksempelvis brugeren at indtaste data af typen integer vha. Scanner-klassen, og brugeren fejlagtigt indtaster bogstaver, så kan man håndtere problemet med exceptions - hvis man ikke gør det, kan man risikere programmet crasher. Man strukturerer typisk sin kode således, at man vha. _"try-and-catch-blocks"_ fortæller compileren, hvad man ønsker at udføre (try-block) og hvis der opstår problemer i denne eksekvering, så skal det opfanges af en exception (catch-block). Man kan håndtere exceptions i den klasse/metode, hvori de opstår, eller man kan sende dem tilbage i hierarkiet (tilbage i stack'en). Dette kaldes _"throws"._

**Hvad er forskellen på checked og unchecked exceptions?**

* Checked exceptions: Denne form for exceptions er checked ved _"compile time"._ Det vil sige, at disse exceptions _SKAL_ håndteres enten ved _"try-and-catch-blocks"_ eller med keywordet _"throws"_. Hvis dette ikke gøres, så vil programmet slet ikke kunne kompileres.
* Unchecked exceptions: Disse exceptions er _IKKE_ checked ved _"compile time"._ Det betyder, at programmet vil _"throwe"_ en unchecked exception, og selvom du ikke håndterer denne exception, så vil programme compile alligevel, selvom det på sigt ikke vil være hensigtsmæssigt. Det er derfor udviklerens opgave at tænke fremad for at undgå, at disse unchecked exceptions kan få programmet til at crashe ved uhensigtsmæssig brug. Ofte handler unchecked exceptions om ugyldig brugerindtastning, filer der ikke kan findes mv.

**Vis et eksempel på en try-catch.**

Eksempel på try-and-catch med _"InputMismatchException"_ kan findes i klassen _"Exceptions"._

**Vis et eksempel på throws.**

Eksempel på throws kan findes i klassen _"ThrowException"._

### 8. Nedarvning
**Forklar nedarvning og fordelene ved det.**

I Java nedarves en klasse - og dermed dens egenskaber og metoder - altid fra en anden klasse. Som udgangspunkt stammer alle klasser fra den overordnede klasse
"Object". Når en klasse nedarves, får den nye klasse som sagt automatisk de egenskaber/metoder, som den klasse, den stammer fra.
Man kan snakke om et parent-child forhold eller et superclass-subclass forhold. Den klasse, der nedarves fra, kalder man
for parent eller superclass til den klasse, der modtager dens egenskaber. Den klasse, der modtager egenskaber fra
superclass'en kalder man så for subclass eller child.
Fordelene ved nedarvning er, at man ikke behøver angive klassevariabler og metoder flere steder. Det letter for det første udviklerens arbejde, men giver også bedre overblik over koden og bruger mindre plads i hukommelsen.

**Forklar overriding af metoder.**

Hvis man ønsker at ændre noget i en metode i sin subklasse, som den har arvet fra superklassen, så kan man anvende
_"Overriding"._ Her bruger man samme signatur, men ændrer funktionaliteten.

Læs mere:
* https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/

**Vis hvordan man laver en klasse, der nedarver fra en anden klasse.**

Se eksempel på nedarvning i klasserne _"Frugt"_ og _"Banan"._

**Vis hvordan man kalder superklassens constructor.**

En constructor er IKKE direkte nedarvet til subklassen (lige som instansvariabler og metoder er det). Hvis vi skal kalde en superklasses constructor i subklassen,
skal vi bruge keywordet _"super"._ Se eksempel på dette i klassen _"Banan"._

### 9. Polymorfi
**Forklar hvad polymorfi er, og hvordan man kan anvende det i et javaprogram.**

Java er et objektorienteret programmeringssprog, og polymorfi er en meget central del dette. Polymorfi vil sige, at et objekt kan tage flere former. En banan er en banan, men en banan er også en frugt - det vi kalder et "is-a-relationship". Omvendt er en frugt ikke nødvendigvis en banan. Når man opbygger sit program på denne måde, gør man det meget fleksibelt og dynamisk, og det kan senere let udvides, uden man skal omskrive koden. Det kan være lidt svært at forklare polymorfi uden et eksempel, se derfor klassen _"Polymorfi"._

**Vis hvordan man skriver et interface.**

Eksempel på dette kan ses i interfacet _"Karakter"._

**Vis hvordan en klasse benytter et interface.**

Eksempel på dette kan ses i klassen _"Polymorfi"._

### 10. Algoritmer
**Forklar hvad en algoritme er.**

En algoritme er en utvetydig og abstrakt beskrivelse af, hvordan et specifikt problem løses - i denne sammenhæng i et javaprogram.
Det er en universiel løsning til at håndtere et problem, uanset hvad de konkrete implicerede faktorer er. En søgealgoritme kan således søge i et bestemt datamateriale, uanset hvad der specifikt søges efter. En sorteringsalgoritme kan sortere et datasæt, uanset størrelsen og indholdet af data.

**Skriv pseudokode til en algoritme, der sorterer et array.**

* Deklarer og initialiser _"mitArray",_
* Laver for-loop der initialiserer mitArray[i] så længe i < mitArray.length,
* Anvender metoden sort() fra klassen Arrays til at sortere elementerne,
* Kører endnu et for-loop for at vise de sorterede værdier.

Se et eksempel på, hvordan man reelt sorterer et array med metoden _"sort()"_ i klassen _"SortingArrayWithMethod"._

**Hvad er Big-O, og hvilken kompleksitet har algoritmen?**

Nogle algoritmer tager utrolig lang tid at udføre, mens andre kan udføres på kortere tid. Fx er sorteringsalgoritmen _"Mergesort"_ en del hurtigere end _"Selection Sort"._
Til at beregne algoritmers effektivitet, og holde dem op mod hinanden, anvendes det, der kaldes _"Big-O notation"_ (På dansk: "Store-O-notation"). Ud fra matematiske beregninger kan vi dokumentere en algoritmes effektivitet i bedste, gennemsnitlige og værste tilfælde - alt afhængig af, hvad algoritmen skal finde, sortere o. lign. Man kan også anvende "Big-O" til at beregne, hvor meget plads algoritmen anvender. Se evt. png-filen _"ArraySorting_Complexity.png"_ eller _"Big-O_Complexity.png"._

### 11. Versioneringssystemer
**Forklar, hvad Git bruges til.**

Git er et versionseringssystem, der lader dig håndtere dine filer i versioner på den mest optimale måde i forhold til vedligeholdelse og overskueliggørelse af kildekode - typisk igennem computerterminalen. Et meget brugbart værktøj for udviklere, der arbejder i teams.

_Nøgleord: commit, push, pull._

Læs mere:
* https://da.wikipedia.org/wiki/Git
* http://git.or.cz/index

**Vis et eksempel på dit brug af GitHub.**

* https://github.com/dani832m

**Hvad er forskellen mellem Git og Github?**

Hvor _Git_ i sin grundform er et versioneringssystem, der lokalt lader dig håndtere filversioner igennem din terminal på dit styresysten, så er _GitHub_ en offentlig webservice, der i repositories versionerer dine filuploads efter Git-princippet. Lignende webservices er _GitLab_ og _Bitbucket._

### ![alt text](https://i.imgur.com/9sLiL1D.png "ErhvervsAkademi Sjælland")
