package taxistation.ua.kvelinskyi.parkcar;

public class Astra extends Opel{
    
    public Astra(double fuelConsumption, int speed) {
        super(fuelConsumption, speed);
        price = 15000;       
    }
    
    @Override
    public String toString() {
        return "\nModel Opel Astra \nCharacteristics: "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
