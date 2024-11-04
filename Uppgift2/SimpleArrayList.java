package Uppgift2;

import java.util.Arrays;

public class SimpleArrayList {
    private String[] elements; // Array för att lagra elementen i listan som en String-array
    private int size = 0;      // Håller reda på antalet element i listan
    private static final int DEFAULT_CAPACITY = 10; // Standardkapacitet för listan

    // Konstruktor som initialiserar ArrayList med standardkapacitet
    public SimpleArrayList() {
        elements = new String[DEFAULT_CAPACITY]; // Skapar en ny String-array med standardkapacitet
    }

    // Lägger till ett element i listan
    public void add(String element) {
        ensureCapacity();           // Kontrollerar om det finns tillräckligt med plats för ett nytt element
        elements[size++] = element; // Lägger till elementet och ökar storleken på listan
    }

    // Tar bort ett element från listan baserat på dess index
    public void remove(int index) {
        // Kontrollerar att index är giltigt
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        // Räknar hur många element som finns efter det borttagna elementet
        int numElementsAfterIndex = size - index - 1;
        // Flyttar elementen till vänster för att fylla tomrummet efter borttagningen
        if (numElementsAfterIndex > 0) {
            System.arraycopy(elements, index + 1, elements, index, numElementsAfterIndex);
        }
        elements[--size] = null; // Sätter det sista elementet till null för att frigöra minne
    }

    // Hämtar ett element baserat på dess index
    public String get(int index) {
        // Kontrollerar att index är giltigt
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index]; // Returnerar elementet utan typomvandling
    }

    // Tömmer hela listan genom att sätta alla element till null
    public void clear() {
        Arrays.fill(elements, 0, size, null); // Sätter alla aktuella element till null
        size = 0;                             // Återställer storleken på listan till 0
    }

    // Kontrollerar att det finns tillräckligt med kapacitet, annars fördubblar kapaciteten
    private void ensureCapacity() {
        // Om storleken är lika med längden på arrayen, öka kapaciteten
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2); // Dubblerar arrayens kapacitet
        }
    }

    // Huvudmetod för att testa funktionerna i ArrayList
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        
        // Lägger till några frukter i listan
        list.add("Mango");
        list.add("Jordgubbe");
        list.add("Ananas");

        // Hämtar och skriver ut ett element från listan
        System.out.println("Frukt på index 1: " + list.get(1)); 

        // Raderar ett element från listan
        list.remove(1);
        System.out.println("Frukt efter borttagning på index 1: " + list.get(1)); 

        // Raderar hela listan
        list.clear();
        System.out.println("Antal element efter tömning: " + list.size); 
    }
}
