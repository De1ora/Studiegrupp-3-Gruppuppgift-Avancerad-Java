package Uppgift3;

public class Calculator {

    private int number;

    private Calculator(int number) { // Constructorn, kan inte anropas utanför klassen direkt.
        this.number = number;
    }

    private int add(int other) {
        return this.number + other;
    }
}