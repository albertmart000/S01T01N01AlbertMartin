package S01T01N01Ex01AlbertMartin;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, int price) {
        super(name, price);
    }

    //Bloc d'inicialització estàtic.
    static {
        System.out.println("Ara sonarà el primer instrument de vent.");
    }

    public String playInstrument(){
        return " està sonant un instrument de vent.\n";
    }
}