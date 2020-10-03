package Car;

import java.util.ArrayList;
import java.util.Calendar;

public class YearCheck {
    public static void getYearCheck(ArrayList<Car> cars, String Model, int age) {
        int cnt = 0; // counter for amount of results
        for (Car car : cars)
            if (car.getModel().equals(Model) // check if model matches
                    && Calendar.getInstance().get(Calendar.YEAR) - car.getYear() > age) { // check if current year - cars year > required age
                System.out.println(car.getInfo()); // output if found
                cnt++;
            }
        if (cnt == 0){
            System.out.println("No matching objects found. Please try another parameters");
        }
        System.out.println("Results found: " +  cnt);
    }
}