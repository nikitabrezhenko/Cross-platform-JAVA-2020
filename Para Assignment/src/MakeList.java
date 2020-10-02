import java.util.ArrayList;

public class MakeList {
    public static void getMakeList(ArrayList<Car> cars, String Mark) {
        // check if matches
        for (Car car : cars)
            if (car.getMake().equals(Mark))
                System.out.println(car.getInfo()); // output if found
    }
    
}
