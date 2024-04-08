# Geneeriset tyypit ja Sudoku-peli

Tämän harjoitustehtäväpaketin myötä opit määrittelemään geneerisiä metodeita sekä luokkia. Aihetta käsitellään aluksi luomalla yleiskäyttöisiä metodeita, joiden avulla voidaan käsitellä eri tyyppistä dataa ilman, että ohjelmalogiikkaa joudutaan toistamaan eri tyyppejä varten. Tehtävät etenevät oman kaksiulotteisen kokoelman ([Grid](./src/main/java/grid/Grid.java)) toteuttamiseen. Omaa kaksiulotteista kokoelmaa hyödynnetään lopulta Sudoku-pelin tietorakenteena.

Aiheeseen perehtymiseksi suosittelemme esimerkiksi [dev.java-tutoriaalin](https://dev.java/learn/generics/) lukua [Generics](https://dev.java/learn/generics/). Lisäksi video [Generics In Java - Full Simple Tutorial (Coding with John, YouTube)](https://youtu.be/K1iu1kXkVoA) on hyvä lähde liikkeelle pääsemiseksi.

Tehtävä koostuu useammasta osasta, jotka arvioidaan erikseen hyödyntäen valmiiksi kirjoitettuja testejä.


## Tehtävän aloittaminen

Aloita kloonaamalla Git-repositorio omalle koneellesi. Harjoitus täytyy tehdä omassa kopiossasi, eli varmista, että repositorion osoitteessa on mukana oma GitHub-käyttäjätunnuksesi! Oman kopiosi saat luotua kurssitoteutuksesi tehtävänannon GitHub classroom -linkin kautta.

```sh
git clone https://github.com/varmista-etta-github-tunnuksesi-on-repositorion-osoitteessa.git
```

Kloonattuasi projektin omalle koneellesi, avaa se koodieditorissasi.


## Vastausten lähettäminen

Kun olet saanut osan tai kaikki tehtävistä ratkaistua ja commitoinut vastauksesi, lähetä ratkaisut arvioitavaksi `git push`-komennolla. Git push käynnistää automaattisesti GitHub actions -workflow:n, joka kääntää sekä testaa ratkaisusi ja antaa jokaisesta testistä joko hyväksytyn tai hylätyn tuloksen.

Kun GitHub Actions on saanut koodisi suoritettua, näet tuloksen GitHub-repositoriosi [Actions-välilehdellä](../../actions/workflows/classroom.yml). Arvioinnin valmistumiseen menee tyypillisesti pari minuuttia.

Klikkaamalla yllä olevan linkin takaa viimeisintä *"GitHub Classroom Workflow"* -suoritusta, saat tarkemmat tiedot tehtävän arvioinnista. Sivun alaosassa näkyy saamasi pisteet. Klikkaamalla "Autograding"-otsikkoa pääset katsomaan tarkemmin arvioinnissa suoritetut vaiheet ja niiden tulokset. Kuvitetun ohjeen aiheesta löydät GitHubin dokumentista [View autograding results (github.com)](https://docs.github.com/en/education/manage-coursework-with-github-classroom/learn-with-github-classroom/view-autograding-results).


## Tehtävä 1: [Randomizer.java](./src/main/java/randomizer/Randomizer.java) *(perusteet, 25 %)*

Tehtävän ensimmäisessä vaiheessa tarkoituksena on toteuttaa omia metodeita, joiden avulla voit hakea listalta satunnaisen arvon, sekoittaa listan satunnaiseen järjestykseen tai ottaa listasta tietyn määrän satunnaisia arvoja. Vastaavaa satunnaisuutta voitaisiin hyödyntää esimerkiksi web-sovelluksessa, jossa etusivulle poimitaan muutamia satunnaisia myynti-ilmoituksia. Myös erilaisiin peleihin, kuten korttiepeleihin, liittyy usein vastaavaa satunnaisuutta.

Tehtävässä koodattava [Randomizer-luokka](./src/main/java/randomizer/Randomizer.java) koostuu valmiista metodeista, joiden javadoc-kommentit kertovat, miten metodin tulisi toimia. Sinun tehtäväsi on lukea kommentit ja toteuttaa metodin sisältö vastaamaan metodin nimeä sekä kuvausta.

Voit testata koodiasi esimerkiksi oman `main`-metodin avulla, tai voit hyödyntää tehtävän valmiita JUnit-yksikkötestejä, jotka löytyvät [RandomizerTest-luokasta](./src/test/java/randomizer/RandomizerTest.java). Voit suorittaa testit koodieditorisi testaustyökalulla ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) tai [Gradle-automaatiotyökalulla](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests RandomizerTest        # unix
.\gradlew.bat test --tests RandomizerTest    # windows
```

💡 *Vinkki: kiinnitä huomiota metodien samankaltaisuuteen: voisitko kenties kutsua metodeista muita saman luokan metodeita?*


## Tehtävä 2: ["Generic randomizer"](./src/main/java/randomizer/Randomizer.java) *(soveltaminen, 25 %)*

Tehtävän toisessa osassa jatkat [Randomizer-luokan](./src/main/java/randomizer/Randomizer.java) kehittämistä siten, että kaikista luokan metodeista tehdään **geneerisiä**. Geneeristen metodien avulla voit hyödyntää esimerkiksi satunnaisen arvon hakevaa metodia niin merkkijonojen, numeroiden kuin omien luokkiesi yhteydessä.

Tehtävän tässä osassa sinun ei välttämättä tarvitse juurikaan muuttaa toteuttamiesi metodien sisältöä, vaan muutokset kohdistuvat pääasiassa metodien otsikoihin, joissa konkreettisen `String`-tyypin sijasta käytetään `Type`-tyyppimuuttujaa. Jos et vielä perehtynyt geneerisiin tyyppeihin [dev.java-tutoriaalin](https://dev.java/learn/generics/) tai [Coding with John-videon](https://youtu.be/K1iu1kXkVoA) avulla, sinun kannattaa aloittaa niistä.


### Muutosten testaaminen

Tässä tehtävässä [Randomizer-luokkaan](./src/main/java/randomizer/Randomizer.java) tehtävät muutokset eivät saa rikkoa olemassa olevaa toiminnallisuutta. Edellisessä osassa suoritettujen [RandomizerTest-luokan](./src/test/java/randomizer/RandomizerTest.java) testien tulisi siis edelleen mennä läpi.

Metodien otsikoihin tehtävien muutosten testaaminen aiheuttaa tehtävää aloitettaessa käännösvirheitä, koska tarvittavia muutoksia ei ole vielä tehty testiluokassa kutsuttaviin metodeihin. Testiluokka on siksi sijoitettu projektissa lähdekooditiedostojen ulkopuolelle. Sinun tuleekin siirtää tehtävän tarkastuksessa käytettävä `GenericRandomizerTest`-testiluokka oikeaan hakemistoon tehtävää aloittaessasi. Tämä voidaan tehdä `git mv`-komennolla, joka päivittää tiedon tiedoston siirrosta samalla myös versionhallintaan:

```
# suorita seuraava komento projektin juurihakemistossa:
git mv GenericRandomizerTest.txt src/test/java/randomizer/GenericRandomizerTest.java
```

Kun olet kopioinut testiluokan paikoilleen [src/test/java/randomizer/](./src/test/java/randomizer/)-hakemistoon yllä olevalla komennolla, voit suorittaa testit seuraavasti:

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
