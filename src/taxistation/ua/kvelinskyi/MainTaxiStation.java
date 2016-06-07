package taxistation.ua.kvelinskyi;

public class MainTaxiStation {
    
    public static void main(String[] args) {
        ConsolMenu consolMenu = new ConsolMenu();
        consolMenu.createParkCars();
        consolMenu.createTaxiStation();
        consolMenu.workTaxiStation();
    }
    
}
