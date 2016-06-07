package taxistation.ua.kvelinskyi.parkcar;

public class Vivaro extends Opel{
    
    public Vivaro(double fuelCconsumption, int speed) {
        super(fuelCconsumption, speed);
        price = 30000;
    }
    
    @Override
    public String toString() {
        return "\nModel Opel Vivaro \nCharacteristics: "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
