package S01T01N01Ex02AlbertMartin;

public class Car {

    private static final String BRAND = "TESLA";
    private static String model;
    private final int ULTIMATE_POWER;

    public Car() {
        this.model= "Roadster";
        ULTIMATE_POWER = 10000;
    }

    public static void accelerateCar (){
        System.out.println("El vehicle està accelerant");
    }

    public void brakeCar() {
        System.out.println("El vehicle està frenant");
    }

}
