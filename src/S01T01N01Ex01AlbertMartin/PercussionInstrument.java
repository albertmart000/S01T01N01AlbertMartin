package S01T01N01Ex01AlbertMartin;

public class PercussionInstrument extends Instrument{

    //Bloc d'inicialització d'instancies.
    {
        System.out.println("Ara sonarà un instrument de percussió.");
    }

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }

    public String playInstrument(){
        return " està sonant un instrument de percussió.\n";
    }

}
