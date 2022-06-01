package S01T01N01Ex01AlbertMartin;

public class StringInstrument extends Instrument{

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    // Bloc d'inicialització estàtic.
    static {
        System.out.println("Ara sonarà el primer instrument de corda.");
    }

    public String playInstrument(){
        return " està sonant un instrument de corda.\n";
    }

}

