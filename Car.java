import java.util.Arrays;

public  class Car {
    private String make;
    private double price;
    private String year;
    private String color;
    // private String[] parts = new String[4];

    public Car(String make, double price, String year, String color ) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        // this.parts = Arrays.copyOf(parts, parts.length);
    }


    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public String getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    // public String[] getParts() {
    //     return Arrays.copyOf(this.parts, this.parts.length);
    // }

}
