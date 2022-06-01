package S01T01N01Ex02AlbertMartin;

public class App {

    public static void main(String[] args) {

    //Mètode estàtic.
        Car.accelerateCar();

    //Mètode no estàtic.
        Car car1= new Car();
        car1.brakeCar();

    }
}
