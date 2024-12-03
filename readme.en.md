# Generic types and Sudoku game

With this exercise package, you will learn to define generic methods and classes. The topic is initially covered by creating general-purpose methods that can handle different types of data without having to repeat the program logic for different types. The tasks progress to implementing your own two-dimensional collection ([Grid](./src/main/java/grid/Grid.java)). Your own two-dimensional collection will eventually be used as the data structure for a Sudoku game.

To get acquainted with the topic, we recommend reading, for example, the [dev.java tutorial on Generics](https://dev.java/learn/generics/). Additionally, the video[ Generics In Java - Full Simple Tutorial (Coding with John, YouTube)](https://youtu.be/K1iu1kXkVoA) is a good resource to get started.

The task consists of several parts, which are evaluated separately using pre-written tests.

## Tehtävän aloittaminen

Start by cloning the Git repository to your local machine. The exercise must be done in your own copy, so make sure the repository URL includes your GitHub username! You can create your own copy through the GitHub Classroom link provided in your course assignment.

```sh
git clone https://github.com/make-sure-that-the-repository-address-contains-your-account.git
```

After cloning the project to your local machine, open it in your code editor.

## Submitting solutions

Once you have solved some or all of the tasks and committed your answers, submit the solutions for evaluation using the `git push` command. Git push will automatically trigger a GitHub Actions workflow that compiles and tests your solutions, providing a pass or fail result for each test.

Once the GitHub Actions has executed your code, you see the results in your GitHub repository's [Actions tab](../../actions/workflows/classroom.yml). It usually takes a few minutes for the assesment to be completed. 

By clicking on the latest *"GitHub Classroom Workflow"* execution from the link above, you will get detailed information about the task evaluation. At the bottom of the page, you can see the points you received. By clicking on the "Autograding" heading, you can view the steps performed during the evaluation and their results in more detail. You can find an illustrated guide on this topic in the GitHub documentation [View autograding results (github.com)](https://docs.github.com/en/education/manage-coursework-with-github-classroom/learn-with-github-classroom/view-autograding-results).

## Tehtävä 1: [Randomizer.java](./src/main/java/randomizer/Randomizer.java) *(perusteet, 25 %)*

Tehtävän ensimmäisessä vaiheessa tarkoituksena on toteuttaa omia metodeita, joiden avulla voit hakea listalta satunnaisen arvon, sekoittaa listan satunnaiseen järjestykseen tai ottaa listasta tietyn määrän satunnaisia arvoja. Vastaavaa satunnaisuutta voitaisiin hyödyntää esimerkiksi web-sovelluksessa, jossa etusivulle poimitaan muutamia satunnaisia myynti-ilmoituksia. Myös erilaisiin peleihin, kuten korttiepeleihin, liittyy usein vastaavaa satunnaisuutta.

Tehtävässä koodattava [Randomizer-luokka](./src/main/java/randomizer/Randomizer.java) koostuu valmiista metodeista, joiden javadoc-kommentit kertovat, miten metodin tulisi toimia. Sinun tehtäväsi on lukea kommentit ja toteuttaa metodin sisältö vastaamaan metodin nimeä sekä kuvausta.

Voit testata koodiasi esimerkiksi oman `main`-metodin avulla, tai voit hyödyntää tehtävän valmiita JUnit-yksikkötestejä, jotka löytyvät [RandomizerTest-luokasta](./src/test/java/randomizer/RandomizerTest.java). Voit suorittaa testit koodieditorisi testaustyökalulla ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) tai [Gradle-automaatiotyökalulla](https://docs.gradle.org/current/userguide/java_testing.html):

## Exercise 1: Randomizer.java *(basics, 25%)*

In the first phase of the task, the goal is to implement your own methods that allow you to fetch a random value from a list, shuffle the list into a random order, or take a certain number of random values from the list. Similar randomness could be utilized, for example, in a web application where a few random sales listings are picked for the front page. Various games, such as card games, also often involve similar randomness.

The [Randomizer](./src/main/java/randomizer/Randomizer.java) class to be coded in the task consists of predefined methods whose javadoc comments explain how the method should work. Your task is to read the comments and implement the method content to match the method name and description.

You can test your code using your own `main` method, or you can use the provided JUnit unit tests for the task, which can be found in the RandomizerTest class. You can run the tests using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or the [Gradle automation tool](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests RandomizerTest        # unix
.\gradlew.bat test --tests RandomizerTest    # windows
```

💡 Tip: Pay attention to the similarity of the methods: could you perhaps call other methods of the same class from these methods?

## Tehtävä 2: ["Generic randomizer"](./src/main/java/randomizer/Randomizer.java) *(soveltaminen, 25 %)*

Tehtävän toisessa osassa jatkat [Randomizer-luokan](./src/main/java/randomizer/Randomizer.java) kehittämistä siten, että kaikista luokan metodeista tehdään **geneerisiä**. Geneeristen metodien avulla voit hyödyntää esimerkiksi satunnaisen arvon hakevaa metodia niin merkkijonojen, numeroiden kuin omien luokkiesi yhteydessä.

Tehtävän tässä osassa sinun ei välttämättä tarvitse juurikaan muuttaa toteuttamiesi metodien sisältöä, vaan muutokset kohdistuvat pääasiassa metodien otsikoihin, joissa konkreettisen `String`-tyypin sijasta käytetään `Type`-tyyppimuuttujaa. Jos et vielä perehtynyt geneerisiin tyyppeihin [dev.java-tutoriaalin](https://dev.java/learn/generics/) tai [Coding with John-videon](https://youtu.be/K1iu1kXkVoA) avulla, sinun kannattaa aloittaa niistä.

## Exercise 2: "Generic randomizer" *(applying, 25%)*

In the second part of the task, you will continue developing the [Randomizer](./src/main/java/randomizer/Randomizer.java) class so that all the class methods become **generic**. With generic methods, you can use, for example, the method that fetches a random value with strings, numbers, and your own classes.

In this part of the task, you may not need to change much of the content of the methods you have implemented. Instead, the changes mainly focus on the method headers, where a `Type` type variable is used instead of a concrete `String` type. If you haven't yet familiarized yourself with generic types through the [dev.java tutorial](https://dev.java/learn/generics/) or the [Coding with John-videon](https://youtu.be/K1iu1kXkVoA), you should start with those.

### Testing the changes

In this task, the changes made to the [Randomizer](./src/main/java/randomizer/Randomizer.java) class must not break existing functionality. The tests performed in the previous part with the [Ran(./src/test/java/randomizer/RandomizerTest.java)domizerTest] class should still pass.

Testing the changes made to the method headers will cause compilation errors at the start of the task because the necessary changes have not yet been made to the methods called in the test class. Therefore, the test class is placed outside the source code files in the project. You need to move the `GenericRandomizerTest` test class used for task inspection to the correct directory when starting the task. This can be done with the `git mv` command, which also updates the information about the file move in version control:

```
# suorita seuraava komento projektin juurihakemistossa:
git mv GenericRandomizerTest.txt src/test/java/randomizer/GenericRandomizerTest.java
```

Once you have copied the test class to the [src/test/java/randomizer/](./src/test/java/randomizer/) directory using the above command, you can run the tests as follows:

```
./gradlew test --tests GenericRandomizerTest        # unix
.\gradlew.bat test --tests GenericRandomizerTest    # windows
```


## Tehtävä 3: [Grid.java](./src/main/java/grid/Grid.java) *(soveltaminen, 25 %)*

Tässä tehtävässä toteutettava [Grid-luokka](./src/main/java/grid/Grid.java) edustaa **kaksiulotteista** ruudukkoa. Ruudukkoa voi käyttää esimerkiksi pelilaudan kuten shakkilaudan, ristinollan tai sudoku-ruudukon mallintamiseen. Grid on tarkoitus toteuttaa **geneerisenä** (`Grid<Type>`), jolloin ruudukon sisältönä voi olla tilanteesta riippuen esimerkiksi numeroita (`Grid<Integer>`), merkkijonoja (`Grid<String>`) tai muita olioita (`Grid<ChessPiece>`) riippuen sen käyttötarkoituksesta. Yhden Grid-olion kaikki arvot ovat kuitenkin aina keskenään samaa tyyppiä.

Tutustu [Grid-luokan](./src/main/java/grid/Grid.java) javadoc-kommentteihin ja toteuta luokkaan logiikka tiedon tallentamiseksi sekä sen hakemiseksi. Tietoa on tarkoitus tallentaa ja hakea melko samalla tavalla kuin taulukkojen, listojen ja map-tietorakenteen kanssa. Tällä kertaa "avain" vain muodostuu kahdesta arvosta: rivin sekä sarakkeen numeroista. Lisähaasteena ruudukon koon on kasvettava dynaamisesti ja siihen pitää voida lisätä uusia arvoja missä tahansa järjestyksessä.

Luokan JUnit-testit löytyvät [GridTest-luokasta](./src/test/java/grid/GridTest.java), jonka voit suorittaa esimerkiksi seuraavasti:

```
./gradlew test --tests GridTest        # unix
.\gradlew.bat test --tests GridTest    # windows
```

### 💡 Vinkit

Joudut valitsemaan Grid-luokan sisällä tiedon tallentamisessa käytettävän tietorakenteen itse. Voit hyödyntää ongelman ratkaisemisessa esimerkiksi yksiulotteista tietorakennetta ja tallentaa listalle olioita, jotka koostuvat rivi- ja sarakenumeroista sekä varsinaisesta tallennettavasta arvosta.

Toinen, tehokkaampi vaihtoehto voisi olla soveltaa Map-tietorakennetta siten, että yhdistät itse rivin ja sarakkeen merkkijonomuotoiseksi avaimeksi (`map.put("5:8", 7)`, `map.get("5:8")`).

Kolmas, edistyneempi lähestymistapa olisi luoda rivin ja sarakkeen tallentamiseksi uusi `Position`-luokka (`map.put(new Position(5, 8), 7)`). Jos `Position`-olioita käytetään hajautustaulun avaimina, on luokkaan toteutettava myös [hashCode-metodi](https://www.baeldung.com/java-hashcode), jota Java käyttää tiedon hajauttamisessa. `Position` kannattanee toisaalta toteuttaa [`record`-luokkana, koska Java muodostaa niille `hashCode`-metodin automaattisesti](https://docs.oracle.com/en/java/javase/17/language/records.html).

```java
/**
 * "The appropriate accessors, constructor, equals, hashCode, and toString
 * methods are created automatically."
 *
 * See https://docs.oracle.com/en/java/javase/17/language/records.html
 */
record Position(int row, int col) {
}
```


## Tehtävä 4: [Sudoku.java](./src/main/java/sudoku/Sudoku.java) *(soveltaminen, 25 %)*

> *"Sudoku on logiikkapeli, jossa tehtävänä on täyttää neliönmuotoinen ruudukko merkeillä niin että jokaisella vaakarivillä ja pystyrivillä sekä jokaisessa osaneliössä käytetään samaa merkkiä tasan yhden kerran. Ruudukossa on aluksi valmiina jo muutama merkki. Yleisin sudoku on 9 × 9 -ruudukko, joka on jaettu yhdeksään 3 × 3 ruudun osaneliöön, ja merkkeinä käytetään numeroita 1–9"*
>
> Wikipedia. https://fi.wikipedia.org/wiki/Sudoku

Tämä Sudoku-harjoitus toimii esimerkkinä siitä, miten voit erottaa pelilogiikan, tiedon tallennuksen ja käyttöliittymän erillisiksi luokiksi.

Itse pelilogiikka toteutetaan [Sudoku-luokassa](./src/main/java/sudoku/Sudoku.java), jossa tarkastetaan että siirrot noudattavat pelin sääntöjä. [Grid-luokkaa](./src/main/java/grid/Grid.java) puolestaan käytetään numeroiden tallentamisessa kaksiulotteiselle pelilaudalle. Varsinainen pelin käyttöliittymä tulosteineen ja syötteineen on toteutettu erilliseen [SudokuGame-luokkaan](./src/main/java/sudoku/SudokuGame.java).

Jakamalla sovelluksen logiikkaa eri luokkiin ja tekemällä niistä tarvittaessa geneerisiä koodi tulee modulaarisemmaksi ja helpommaksi ylläpitää ja testata. Myös koodin uudelleenkäyttö helpottuu, ja voisimme käyttää Grid-luokkaa sellaisenaan myös muihin peleihin, jotka hyödyntävät kaksiulotteista ruudukkoa. Sudoku-luokkaa voitaisiin puolestaan hyödyntää sellaisenaan erilaisten käyttöliittymien kanssa, esimerkiksi osana työpöytä- tai web-sovellusta.

Peli on alkutilanteessa keskeneräinen, mutta voit silti käynnistää sen suorittamalla [SudokuGame-luokan main-metodin](./src/main/java/sudoku/SudokuGame.java). Kun etenet tehtävässä ja saat Sudoku-luokan metodeja toteutettua, lopputulos näyttää esimerkiksi seuraavalta:

```
███████╗██╗   ██╗██████╗  ██████╗ ██╗  ██╗██╗   ██╗
██╔════╝██║   ██║██╔══██╗██╔═══██╗██║ ██╔╝██║   ██║
███████╗██║   ██║██║  ██║██║   ██║█████╔╝ ██║   ██║
╚════██║██║   ██║██║  ██║██║   ██║██╔═██╗ ██║   ██║
███████║╚██████╔╝██████╔╝╚██████╔╝██║  ██╗╚██████╔╝
╚══════╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝

Welcome to the Sudoku game! Press Ctrl + C to exit.

2 6 7 | 8 3 9 | 5 . 4
9 . 3 | 5 1 . | 6 . .
. 5 1 | 6 . . | 8 3 9
------ ------- ------
5 1 9 | . 4 6 | 3 2 8
8 . 2 | 1 . 5 | 7 . 6
6 7 4 | 3 2 . | . . 5
------ ------- ------
. . . | 4 5 7 | 2 6 3
3 2 . | . 8 . | . 5 7
7 4 5 | . . 3 | 9 . 1

Enter the row (0-8): 1
Enter the column (0-8): 1
Enter the number (1-9): 8
```

Tässä tehtävässä sinun tarvitsee tehdä muutoksia ainoastaan [Sudoku-luokassa](./src/main/java/sudoku/Sudoku.java) oleviin `setNumber`-, `getNumber`-, `isSolved`- sekä `toString`-metodeihin. Huomaa, että esimerkiksi `setNumber`-metodin edellyttämät tarkastukset rivien, sarakkeiden ja osaneliöiden suhteen voivat olla varsin monimutkaisia, ja ne kannattaa ehkä toteuttaa erillisiin itse suunnittelemiisi apumetodeihin.

Sudoku-luokan JUnit-testit löytyvät [SudokuTest-luokasta](./src/test/java/sudoku/SudokuTest.java) ja voit suorittaa ne esimerkiksi seuraavasti:

```
./gradlew test --tests SudokuTest        # unix
.\gradlew.bat test --tests SudokuTest    # windows
```

[SudokuGame-luokalle](./src/main/java/sudoku/SudokuGame.java) ei ole erillisiä yksikkötestejä, vaan voit testata sen toimivuuden suorittamalla koodia ja kokeilemalla eri arvojen sijoittamista eri ruutuihin.


### Sudoku ❤ Ohjelmoinnin MOOC

Sudoku-tehtävässä on otettu vahvasti vaikutteita Helsingin yliopiston [Ohjelmoinnin perusteet -MOOC-kurssin](https://ohjelmointi-24.mooc.fi/) Python-kielisistä tehtävistä osoitteessa https://ohjelmointi-24.mooc.fi/osa-5. Sudoku-tehtävässä osittain täytetty Sudoku-ruudukko on myös lainattu saman MOOC-kurssin tehtävistä. [Ohjelmoinnin MOOC on lisensoitu CC BY-NC-SA 4.0 -lisenssillä](https://ohjelmointi-24.mooc.fi/credits):

> *Kurssimateriaalin ja tehtävien tekijät ovat Erkki Kaila, Antti Laaksonen ja Matti Luukkainen. Muutama kurssin tehtävistä on Arto Hellaksen (né Vihavainen) käsialaa.*
>
> *Kurssin materiaali on lisensoitu [Creative Commons BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.fi) -lisenssillä, joten voit käyttää ja levittää sitä vapaasti, kunhan alkuperäisten tekijöiden nimiä ei poisteta. Jos teet muutoksia materiaaliin ja haluat levittää muunneltua versiota, se täytyy lisensoida samalla lisenssillä. Materiaalien käyttö kaupalliseen tarkoitukseen on ilman erillistä lupaa kielletty.*


## Tehtävä 5: ohjelman paketoiminen suoritettavaksi [JAR-tiedostoksi](https://en.wikipedia.org/wiki/JAR_(file_format)) *(extra, 0 %)*

Mikäli haluat luoda sudoku-sovelluksesta paketin, joka ei edellytä lähdekoodien ja IDE-työkalun käyttöä, voit tehdä sen projektissa mukana olevalla Gradle-työkalulla. `build`-komento paketoi sovelluksen .jar-tiedostoksi:

```
./gradlew build         # unix
.\gradlew.bat build     # windows
```

Paketoitu tiedosto ilmestyy [build/libs/](./build/libs/) alihakemistoon, josta se voidaan suorittaa `java -jar`-komennolla:

```
java -jar build/libs/generics-and-sudoku.jar    # unix
java -jar build\libs\generics-and-sudoku.jar    # windows
```

Tarkempia ohjeita Gradlen käyttöön löydät esimerkiksi sivulta [Building Java Projects with Gradle (spring.io)](https://spring.io/guides/gs/gradle).

💡 *Tälle paketointitehtävälle ei ole erillisiä testejä, eikä se vaikuta arviointiin.*


## Tämän tehtävän lisenssi

Tämän tehtävän on kehittänyt Teemu Havulinna ja se on lisensoitu [Creative Commons BY-NC-SA](https://creativecommons.org/licenses/by-nc-sa/4.0/) -lisenssillä. Tehtävänannon, tehtäväpohjien ja automaattisten testien luonnissa on hyödynnetty ChatGPT 3.5 -kielimallia sekä GitHub Copilot -tekoälytyökalua.
