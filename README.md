# Geneeriset tyypit ja Sudoku-peli

Tämän harjoitustehtäväpaketin myötä opit määrittelemään geneerisiä metodeita sekä luokkia. Aihetta käsitellään aluksi luomalla yleiskäyttöisiä metodeita, joiden avulla voidaan käsitellä eri tyyppistä dataa ilman, että ohjelmalogiikkaa joudutaan toistamaan eri tyyppejä varten. Tehtävät etenevät oman kaksiulotteisen kokoelman ([Grid](./src/main/java/grid/Grid.java))toteuttamiseen. Omaa kaksiulotteista kokoelmaa hyödynnetään lopulta Sudoku-pelin tietorakenteena.

Aiheeseen perehtymiseksi suosittelemme esimerkiksi [dev.java-tutoriaalin](https://dev.java/learn/generics/) lukua [Generics](https://dev.java/learn/generics/).

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


## Tehtävä 1: [Randomizer.java](./src/main/java/randomizer/Randomizer.java) *(perusteet)*

Tehtävän ensimmäisessä vaiheessa tarkoituksena on toteuttaa omia metodeita, joiden avulla voit hakea listalta satunnaisen arvon, sekoittaa listan satunnaiseen järjestykseen tai ottaa listasta tietyn määrän satunnaisia arvoja.

Tehtävässä koodattava [Randomizer-luokka](./src/main/java/randomizer/Randomizer.java) koostuu valmiista metodeista, joiden javadoc-kommentit kertovat, miten metodin tulisi toimia. **Sinun tehtäväsi on lukea kommentit ja toteuttaa metodin sisältö vastaamaan metodin nimeä sekä kuvausta.**

Voit testata koodiasi esimerkiksi oman `main`-metodin avulla, tai voit hyödyntää tehtävän valmiita JUnit-yksikkötestejä, jotka löytyvät [RandomizerTest-luokasta](./src/test/java/randomizer/RandomizerTest.java). Voit suorittaa testit koodieditorisi testaustyökalulla ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) tai [Gradle-automaatiotyökalulla](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests RandomizerTest        # unix
.\gradlew.bat test --tests RandomizerTest    # windows
```


## Tehtävä 2: ["Generic randomizer"](./src/main/java/randomizer/Randomizer.java) *(soveltaminen)*

Tehtävän toisessa osassa jatkat [Randomizer-luokan](./src/main/java/randomizer/Randomizer.java) kehittämistä siten, että luokan metodeista tehdään **geneerisiä**. Geneeristen metodien avulla voit hyödyntää esimerkiksi satunnaisen arvon hakevaa metodia niin merkkijonojen, numeroiden kuin omien luokkiesi yhteydessä.

Tehtävän tässä osassa sinun ei välttämättä tarvitse muuttaa toteuttamiesi metodien sisältöä, vaan muutokset kohdistuvat pääasiassa metodien otsikoihin.

**Tässä tehtävässä yksikkötestit edellyttävät, että olet toteuttanut metodien otsikot oikealla tavalla. Lähtötilanteessa yksikkötestit sisältävät käännösvirheitä, koska tarvittavia muutoksia ei ole vielä tehty. Sinun tulee siksi kopioida itse tehtävän tarkastuksessa käytettävä `GenericRandomizerTest`-luokka oikeaan hakemistoon tehtävää aloittaessasi.**

```
cp GenericRandomizerTest.java src/test/java/randomizer/GenericRandomizerTest.java      # unix
copy GenericRandomizerTest.java src\test\java\randomizer\GenericRandomizerTest.java    # windows
```

Kun olet kopioinut testiluokan paikoilleen, voit suorittaa testit seuraavasti:

```
./gradlew test --tests GenericRandomizerTest        # unix
.\gradlew.bat test --tests GenericRandomizerTest    # windows
```


## Tehtävä 3: [Grid.java](./src/main/java/grid/Grid.java) *(soveltaminen)*

Tässä tehtävässä toteutettava [Grid-luokka](./src/main/java/grid/Grid.java) edustaa kaksiulotteista ruudukkoa. Ruudukkoa voi käyttää esimerkiksi pelilaudan kuten shakkilaudan, ristinollan tai sudokun mallintamiseen. Ruudukon sisältönä voi siis olla esimerkiksi numeroita, merkkijonoja tai olioita riippuen pelistä. Yhden ruudukon kaikki arvot ovat kuitenkin aina keskenään saman tyyppisiä.

Tutustu luokan javadoc-kommentteihin ja toteuta luokkaan logiikka tiedon tallentamiseksi sekä sen hakemiseksi rivi- ja sarakenumeroiden avulla.

Luokan JUnit-testit löytyvät [GridTest-luokasta](./src/test/java/grid/GridTest.java), jonka voit suorittaa esimerkiksi seuraavasti:

```
./gradlew test --tests GridTest        # unix
.\gradlew.bat test --tests GridTest    # windows
```


## Tehtävä 4: [Sudoku.java](./src/main/java/sudoku/Sudoku.java) *(soveltaminen)*

Tämä Sudoku-harjoitus toimii esimerkkinä siitä, miten voit erottaa esimerkiksi pelilogiikan, tiedon tallennuksen ja käyttöliittymän erillisiksi luokiksi. Itse pelilogiikka toteutetaan [Sudoku-luokassa](./src/main/java/sudoku/Sudoku.java), ja [Grid-luokkaa](./src/main/java/grid/Grid.java) käytetään numeroiden tallentamisessa pelilaudalle. Varsinainen pelin käyttöliittymä tulosteineen ja syötteiden kysymisineen on toteutettu erilliseen [SudokuGame-luokkaan](./src/main/java/sudoku/SudokuGame.java). Voit avata pelin käynnistämällä [SudokuGame-luokan main-metodin](./src/main/java/sudoku/SudokuGame.java).

Jakamalla sovelluksen logiikkaa eri luokkiin ja tekemällä niistä tarvittaessa geneerisiä koodi tulee modulaarisemmaksi ja helpommaksi ylläpitää ja testata. Myös koodin uudelleenkäyttö helpottuu, ja voisimme käyttää Grid-luokkaa sellaisenaan myös muihin peleihin, jotka hyödyntävät kaksiulotteista ruudukkoa. Sudoku-luokkaa voitaisiin puolestaan hyödyntää sellaisenaan erilaisten käyttöliittymien kanssa, esimerkiksi osana työpöytä- tai web-sovellusta.

Sudoku-luokan JUnit-testit löytyvät [SudokuTest-luokasta](./src/test/java/sudoku/SudokuTest.java). [SudokuGame-luokalle](./src/main/java/sudoku/SudokuGame.java) ei ole erillisiä yksikkötestejä, vaan voit testata sen toimivuuden suorittamalla koodia ja kokeilemalla eri arvojen sijoittamista eri ruutuihin.

```
./gradlew test --tests SudokuTest        # unix
.\gradlew.bat test --tests SudokuTest    # windows
```


### Sudoku ❤ Ohjelmoinnin MOOC

Sudoku-tehtävässä on otettu vahvasti vaikutteita Helsingin yliopiston [Ohjelmoinnin perusteet -MOOC-kurssin](https://ohjelmointi-24.mooc.fi/) Python-kielisistä tehtävistä osoitteessa https://ohjelmointi-24.mooc.fi/osa-5. Sudoku-tehtävässä osittain täytetty Sudoku-ruudukko on myös lainattu saman MOOC-kurssin tehtävistä. [Ohjelmoinnin MOOC on lisensoitu CC BY-NC-SA 4.0 -lisenssillä](https://ohjelmointi-24.mooc.fi/credits):

> *Kurssimateriaalin ja tehtävien tekijät ovat Erkki Kaila, Antti Laaksonen ja Matti Luukkainen. Muutama kurssin tehtävistä on Arto Hellaksen (né Vihavainen) käsialaa.*
>
> *Kurssin materiaali on lisensoitu [Creative Commons BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.fi) -lisenssillä, joten voit käyttää ja levittää sitä vapaasti, kunhan alkuperäisten tekijöiden nimiä ei poisteta. Jos teet muutoksia materiaaliin ja haluat levittää muunneltua versiota, se täytyy lisensoida samalla lisenssillä. Materiaalien käyttö kaupalliseen tarkoitukseen on ilman erillistä lupaa kielletty.*


## Tämän tehtävän tekijänoikeudet

Tämän tehtävän on kehittänyt Teemu Havulinna ja se on lisensoitu [Creative Commons BY-NC-SA](https://creativecommons.org/licenses/by-nc-sa/4.0/) -lisenssillä. Tehtävänannon, tehtäväpohjien ja automaattisten testien luonnissa on hyödynnetty ChatGPT 3.5 -kielimallia sekä GitHub Copilot -tekoälytyökalua.
