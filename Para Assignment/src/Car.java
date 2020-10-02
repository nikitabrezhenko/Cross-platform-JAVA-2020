
public class Car {

    //initializing private vars
    private final long id;
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final double price;
    private final String regNum;

    public Car(long id, String make, String model, int year, String color, double price, String regNum) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNum = regNum;
    }

    //геттеры
    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getInfo() {
        return "Car{" +
                "ID = " + id +
                ", MAKE = " + make +
                ", MODEL = " + model +
                ", YEAR = " + year +
                ", COLOR = " + color +
                ", PRICE = " + price +
                ", REGISTRATION NUMBER = " + regNum +
                '}';
    }
}
