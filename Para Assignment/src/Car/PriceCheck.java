package Car;

import java.util.ArrayList;

public class PriceCheck {
    public static void getPriceCheck(ArrayList<Car> cars, int year, double price) {
        int cnt = 0; // counter for amount of results
        // check if matches
        for (Car car : cars)
            if (car.getYear() == year// check if year matches
                    && car.getPrice() > price) { // check if price is bigger than requested
                System.out.println(car.getInfo()); // output if found
                cnt++;
            }
        if (cnt == 0){
            System.out.println("No matching objects found. Please try another parameters");
        }
        System.out.println("Results found: " +  cnt);
    }
}