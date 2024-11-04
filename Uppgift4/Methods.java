package Uppgift4;

public class Methods {

    String name;
    int number;

    @AutoCall
    public void Lisa() {
        System.out.println("Denna AutoCall startas, inga parametrar krävs.");
    }

    @AutoCall
    public void Bo(String name) {
        System.out.println("Denna AutoCall kommer inte att köras.");
    }

    @AutoCall
    public void Sandra(int number) {
        System.out.println("Denna AutoCall kommer inte att köras.");
    }

    public Methods(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
