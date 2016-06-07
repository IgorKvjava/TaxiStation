package taxistation.ua.kvelinskyi.office;

import java.util.List;
import taxistation.ua.kvelinskyi.parkcar.Car;

public class ParkCars extends Manager{
    
    public ParkCars(String nameParkCars, List<Car> cars) {
        super(nameParkCars, cars);
        
    }

    @Override
    public String toString() {
        return "Taxi Station - "+super.getNameParkCars(); 
    }
    
}
