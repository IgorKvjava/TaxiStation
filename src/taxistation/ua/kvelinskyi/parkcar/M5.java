package taxistation.ua.kvelinskyi.parkcar;

public class M5 extends BMW{
    
    public M5(double fuelCconsumption, int speed) {
        super(fuelCconsumption, speed);
        price = 20000;
    }     

    @Override
    public String toString() {
        return "\nModel BMW M-5 \nCharacteristics: "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
