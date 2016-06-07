package taxistation.ua.kvelinskyi.office;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import taxistation.ua.kvelinskyi.parkcar.Car;

public class Manager {
    private String nameParkCars;
    private List <Car> cars;

    public Manager(String nameParkCars, List<Car> cars) {
        this.cars = cars;
        this.nameParkCars = nameParkCars;
    }

    public String getNameParkCars() {
        return nameParkCars;
    }
        
    public int totalPrice(){
        int totalPrice = 0;
        for (Car car : cars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }
    
    public List<Car> findCars(int minSpeed, int maxSpeed){
        List<Car> foundCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getSpeed() > minSpeed && car.getSpeed() < maxSpeed) {
                foundCars.add(car);
            }
        }
        return foundCars;
    }

    public void sortByFuelConsumption(){
        Collections.sort(cars);
    }
    
    public void printFuelCconsumption(){
        for (Car car : cars) {
            System.out.println(car);
        }
    }
        
}

