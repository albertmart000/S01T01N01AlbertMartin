package S01T01N01Ex01AlbertMartin;

public class App {

    public static void main(String[] args) {

    //Instanciem i carreguem la classe WindInstrument. També es carrega la classe Instrument.
        Instrument inst1= new WindInstrument("trombò", 3000);
        Instrument inst2= new WindInstrument("flauta", 2000);
        System.out.println("Quan sona l'instrument " + inst1.getName() + inst1.playInstrument());
        System.out.println("Quan sona l'instrument " + inst2.getName() + inst2.playInstrument());

    //Instanciem i carreguem la classe WindInstrument amb un Bloc Estatic.
        Instrument inst3= new StringInstrument("violi", 2500);
        Instrument inst4= new StringInstrument("contrabaix", 3500);
        System.out.println("Quan sona l'instrument " + inst3.getName() + inst3.playInstrument());
        System.out.println("Quan sona l'instrument " + inst4.getName() + inst4.playInstrument());

   //Instaciem i carreguem la classe WindInstrument amb in Bloc d'inicialització d'instancies.
        Instrument inst5= new PercussionInstrument("timbal", 1000);
        System.out.println("Quan sona l'instrument " + inst5.getName() + inst5.playInstrument());
        Instrument inst6= new PercussionInstrument("caixa", 750);
        System.out.println("Quan sona l'instrument " + inst6.getName() + inst6.playInstrument());




   }

}

