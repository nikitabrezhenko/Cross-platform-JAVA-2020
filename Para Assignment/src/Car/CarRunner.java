package Car;

import java.util.ArrayList;

public class CarRunner {

    public static void main(String[] args){
        // Creating a new list of cars
        ArrayList<Car> cars = new ArrayList<>();
        //Scanner in = new Scanner(System.in); // Using Scanner to Get Input from User

        //Adding elements to the list
        cars.add(new Car(1, "Pontiac" , "Firebird" , 1994 , "Violet" , 5146 , "WL0284BD"));
        cars.add(new Car(2, "Pontiac" , "Vibe" , 2009 , "Orange" , 5021 , "TR5556YO"));
        cars.add(new Car(3, "Kia" , "Optima" , 2001 , "Mauv" , 9036 , "QK7561EO"));
        cars.add(new Car(4, "MINI" , "Cooper" , 2002 , "Fuscia" , 6627 , "NW3492VE"));
        cars.add(new Car(5, "GMC" , "Savana 3500" , 2010 , "Khaki" , 9123 , "HR2221HQ"));

        // A) список автомобилей заданной марки;
        System.out.println("A) List of cars of set make");
        MakeList.getMakeList(cars, "Pontiac"); // test input found
        MakeList.getMakeList(cars, "Honda"); // test input not found
        System.out.println("\n");

        // Б) список автомобилей заданной модели, которые эксплуатируются больше n лет;
        System.out.println("B) List of cars of set model, that are older than requested");
        YearCheck.getYearCheck(cars, "Cooper", 7); // 2020 - 2009 = 11 > 7
        YearCheck.getYearCheck(cars, "Optima", 20); // 2020 - 2001 = 19 !> 20
        System.out.println("\n");

        // В) список автомобилей заданного года выпуска, цена которых больше указанной.
        System.out.println("C) List of cars of set year, with price bigger than requested");
        PriceCheck.getPriceCheck(cars, 2002, 5000.99);
        PriceCheck.getPriceCheck(cars, 1994, 6500.69);
        
    }

    
}
