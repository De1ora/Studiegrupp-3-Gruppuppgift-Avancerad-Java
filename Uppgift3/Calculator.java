package Uppgift3;

/** ### 3.
Ni får följande klass:

```java

public class Calculator {

   private int number;



   private Calculator(int number) { 

       this.number = numbers;

   }



   private int add(int other) {

       return this.number + other;

   }

}

```

Skapa ett nytt objekt utifrån klassen, skicka in valfritt nummer som argument till constructorn, och anropa sedan 
`add` funktionen, allt genom att använda reflection. Koden måste skrivas i en separat klass. */

public class Calculator {

    private int number;

    private Calculator(int number) { // Constructorn, kan inte anropas utanför klassen direkt.
        this.number = number;
    }

    private int add(int other) {
        return this.number + other;
    }
}

