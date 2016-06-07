package taxistation.ua.kvelinskyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import taxistation.ua.kvelinskyi.office.Manager;
import taxistation.ua.kvelinskyi.office.ParkCars;
import taxistation.ua.kvelinskyi.parkcar.Astra;
import taxistation.ua.kvelinskyi.parkcar.Car;
import taxistation.ua.kvelinskyi.parkcar.M5;
import taxistation.ua.kvelinskyi.parkcar.Vivaro;
import taxistation.ua.kvelinskyi.parkcar.X5;

public class ConsolMenu {
    private Scanner sc = new Scanner(System.in);    
    private List<Car> cars;
    private List<Car> findCars;
    private Manager parkCars;
            
    public void createParkCars(){
        cars = new ArrayList<>();
        double fuelConsumption;
        int speed;
        int modelCar;
        int numberCars;
        System.out.println("Enter number cars for taxistation");
        numberCars = sc.nextInt();        
        for (int i = 0; i < numberCars; i++) {        
            System.out.println("Car model choice:\n1 - BMW M5"
                    + "\n2 - BMW X5\n3 - Opel Astra\n4 - Opel Vivaro\n5 - generate 4 cars");
            modelCar = sc.nextInt();
            switch (modelCar) {
                case 1:
                    System.out.println("Enter BMW M5 fuel consumption");
                    fuelConsumption = sc.nextDouble();
                    System.out.println("Enter BMW M5 speed");
                    speed = sc.nextInt();
                    cars.add(new M5(fuelConsumption, speed));
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    System.out.println("Enter BMW X5 fuel consumption");
                    fuelConsumption = sc.nextDouble();
                    System.out.println("Enter BMW X5 speed");
                    speed = sc.nextInt();
                    cars.add(new X5(fuelConsumption, speed));
                    System.out.println("\n\n\n");
                    break;
                case 3:
                    System.out.println("Enter Opel Astra fuel consumption");
                    fuelConsumption = sc.nextDouble();
                    System.out.println("Enter Opel Astra speed");
                    speed = sc.nextInt();
                    cars.add(new Astra(fuelConsumption, speed));
                    System.out.println("\n\n\n");
                    break;
                case 4:
                    System.out.println("Enter Opel Vivaro fuel consumption");
                    fuelConsumption = sc.nextDouble();
                    System.out.println("Enter Opel Vivaro speed");
                    speed = sc.nextInt();
                    cars.add(new Vivaro(fuelConsumption, speed));
                    System.out.println("\n\n\n");                    
                    break;
                  case 5:
                    cars.add(new M5(20.5, 300));
                    cars.add(new X5(30.6, 250));
                    cars.add(new Astra(8.7, 180));
                    cars.add(new Vivaro(11.3, 120)); 
                    i +=3;
                    break;
                default:                    
                    System.out.println("Car model choice incorrect");
                    System.out.println("\n\n\n");
                    break;

            }
            
            
        }
    }
    
    public void createTaxiStation(){        
        System.out.println("Enter name park cars ");
        String nameParkCars = sc.next();
        parkCars = new ParkCars(nameParkCars, cars);
    }
    
    public void workTaxiStation(){
        int choiceMenu;
        int minSpeed;
        int maxSpeed;
        while (true) {
            System.out.println("Menu Taxi Station:\n1 - Price taxi station\n2 - Cars sort by fuel consumption"
                    + "\n3 - Car speed range\n4 - Stop Taxi Station");
            choiceMenu = sc.nextInt();
            if (choiceMenu == 4) {
                return;
            }
            switch (choiceMenu) {
                case 1:
                    System.out.println("Taxi Station total price = " + parkCars.totalPrice() + " dollars\n\n\n");
                    break;
                case 2:
                    System.out.println(parkCars);
                    parkCars.sortByFuelConsumption();
                    parkCars.printFuelCconsumption();                    
                    break;
                case 3:
                    System.out.println("Speed range");
                    System.out.println("Enter min speed");
                    minSpeed = sc.nextInt();
                    System.out.println("Enter max speed");
                    maxSpeed = sc.nextInt();
                    findCars = parkCars.findCars(minSpeed, maxSpeed);
                    if (findCars.size() > 0) {
                        System.out.println(findCars+"\n\n\n");
                    }else{
                        System.out.println("Cars not found");
                    }                    
                    break;
                default:
                    System.out.println("Choice incorrect\n\n\n");
                    break;
            }

        }
    }
}
