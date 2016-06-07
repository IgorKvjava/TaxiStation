package taxistation.ua.kvelinskyi.parkcar;

public class Car implements Comparable<Car>{

    protected int price;
    private double fuelConsumption;
    private int speed;

    protected Car(double fuelCconsumption, int speed) {       
        this.fuelConsumption = fuelCconsumption;
        this.speed = speed;
    }
    
    @Override
    public int compareTo(Car car) {
        return (int) (this.fuelConsumption - car.fuelConsumption);
    }

    public int getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
  
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Speed -"+getSpeed()+", Fuel consumption -"+getFuelConsumption()+", Price -"+getPrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
