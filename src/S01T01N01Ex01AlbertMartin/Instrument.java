package S01T01N01Ex01AlbertMartin;

public abstract class Instrument {

    protected String name;
    protected int price;

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}

    static {
        System.out.println("Ara sonarà el primer instrument.");
    }

    public abstract String playInstrument();

}
