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
        MakeList.getMakeList(cars, "Pontiac");
        MakeList.getMakeList(cars, "Honda");
        
    }

    
}
