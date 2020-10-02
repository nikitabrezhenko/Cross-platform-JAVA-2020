import java.util.ArrayList;

public class MakeList {
    public static void getMakeList(ArrayList<Car> cars, String Make) {
        int cnt = 0; // counter for amount of results
        // check if matches
        for (Car car : cars)
            if (car.getMake().equals(Make)) {
                System.out.println(car.getInfo()); // output if found
                cnt++;
            }
            if (cnt == 0){
                throw new IllegalArgumentException("There are no matching makes for '" + Make + "'. Please input another make.");
            }
            System.out.println("Results found: " +  cnt);
    }
    
}
