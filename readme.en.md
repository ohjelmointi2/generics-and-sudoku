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

## Exercise 2: "Generic randomizer" *(applying, 25%)*

In the second part of the task, you will continue developing the [Randomizer](./src/main/java/randomizer/Randomizer.java) class so that all the class methods become **generic**. With generic methods, you can use, for example, the method that fetches a random value with strings, numbers, and your own classes.

In this part of the task, you may not need to change much of the content of the methods you have implemented. Instead, the changes mainly focus on the method headers, where a `Type` type variable is used instead of a concrete `String` type. If you haven't yet familiarized yourself with generic types through the [dev.java tutorial](https://dev.java/learn/generics/) or the [Coding with John-videon](https://youtu.be/K1iu1kXkVoA), you should start with those.

### Testing the changes

In this task, the changes made to the [Randomizer](./src/main/java/randomizer/Randomizer.java) class must not break existing functionality. The tests performed in the previous part with the [Ran(./src/test/java/randomizer/RandomizerTest.java)domizerTest] class should still pass.

Testing the changes made to the method headers will cause compilation errors at the start of the task because the necessary changes have not yet been made to the methods called in the test class. Therefore, the test class is placed outside the source code files in the project. You need to move the `GenericRandomizerTest` test class used for task inspection to the correct directory when starting the task. This can be done with the `git mv` command, which also updates the information about the file move in version control:

```
# execute the following command in the root folder of the project:
git mv GenericRandomizerTest.txt src/test/java/randomizer/GenericRandomizerTest.java
```

Once you have copied the test class to the [src/test/java/randomizer/](./src/test/java/randomizer/) directory using the above command, you can run the tests as follows:

```
./gradlew test --tests GenericRandomizerTest        # unix
.\gradlew.bat test --tests GenericRandomizerTest    # windows
```

## Exercise 3: Grid.java *(applying, 25%)*

The [Grid](./src/main/java/grid/Grid.java) class to be implemented in this task represents a **two-dimensional** grid. The grid can be used to model a game board such as a chessboard, tic-tac-toe, or sudoku grid. The Grid is intended to be implemented as a **generic** (`Grid<Type>`), so the contents of the grid can be, for example, numbers (`Grid<Integer>`), strings (`Grid<String>`), or other objects (`Grid<ChessPiece>`) depending on its use. However, all values in a single Grid object are always of the same type.

Familiarize yourself with the [Grid](./src/main/java/grid/Grid.java) class javadoc comments and implement the logic for storing and retrieving data in the class. The data is intended to be stored and retrieved in much the same way as with arrays, lists, and map data structures. This time, the "key" consists of two values: the row and column numbers. Additionally, the size of the grid must grow dynamically, and new values must be able to be added in any order.

The JUnit tests for the class can be found in the [GridTest](./src/test/java/grid/GridTest.java) class, which you can run as follows:

```
./gradlew test --tests GridTest        # unix
.\gradlew.bat test --tests GridTest    # windows
```

### 💡 Tips

You will need to choose the data structure used for storing information within the Grid class yourself. You can solve the problem by using a one-dimensional data structure and storing objects in a list that consist of row and column numbers as well as the actual value to be stored.

Another, more efficient option could be to use a Map data structure, combining the row and column into a string key (`map.put("5:8", 7)`, `map.get("5:8")`).

A third, more advanced approach would be to create a new `Position` class to store the row and column (`map.put(new Position(5, 8), 7)`). If `Position` objects are used as keys in a hash table, the class must also implement the [hashCode](https://www.baeldung.com/java-hashcode) method, which Java uses for hashing data. On the other hand, it might be beneficial to implement `Position` as a [`record` class, since Java automatically generates the `hashCode` method for them](https://docs.oracle.com/en/java/javase/17/language/records.html).

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

## Exercise 4: Sudoku.java *(applying, 25 %)*

> *"Sudoku is a logic-based, combinatorial number-placement puzzle. In classic Sudoku, the objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 subgrids that compose the grid (also called "boxes", "blocks", or "regions") contains all of the digits from 1 to 9"*
>
> Wikipedia. https://en.wikipedia.org/wiki/Sudoku

This Sudoku exercise serves as an example of how you can separate game logic, data storage, and the user interface into distinct classes.

The game logic itself is implemented in the [Sudoku](./src/main/java/sudoku/Sudoku.java) class, where it checks that the moves follow the game rules. The [Grid](./src/main/java/grid/Grid.java) class is used to store numbers on the two-dimensional game board. The actual game interface with outputs and inputs is implemented in a separate [SudokuGame](./src/main/java/sudoku/SudokuGame.java) class.

By dividing the application logic into different classes and making them generic if necessary, the code becomes more modular and easier to maintain and test. Code reuse is also facilitated, and we could use the Grid class as-is for other games that utilize a two-dimensional grid. The Sudoku class could, in turn, be used as-is with different interfaces, for example, as part of a desktop or web application.

The game is initially incomplete, but you can still run it by executing the main method of the [SudokuGame](./src/main/java/sudoku/SudokuGame.java) class. As you progress in the task and implement the methods of the Sudoku class, the end result will look something like this:

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
