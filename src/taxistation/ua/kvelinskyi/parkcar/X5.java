package taxistation.ua.kvelinskyi.parkcar;

public class X5 extends BMW{
    
    public X5(double fuelCconsumption, int speed) {
        super(fuelCconsumption, speed);
        price = 40000;
    }
    
    @Override
    public String toString() {
        return "\nModel BMW X-5 \nCharacteristics: "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
