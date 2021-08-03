package Tutorial4.Q6;

public class Airplane {
    private String id;
    private double price;
    private int yearOFPurchase, numOfPassenger;
    private static int numOfAirplane = 0;

    Airplane() {
        numOfAirplane++;
    }

    Airplane(String id, double price, int yearOFPurchase, int numOfPassenger) {
        this.id = id;
        this.price = price;
        this.yearOFPurchase = yearOFPurchase;
        this.numOfPassenger = numOfPassenger;
        numOfAirplane++;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumOfPassanger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public String getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYearOfPurchase() {
        return this.yearOFPurchase;
    }

    public int getnumOfPassenger() {
        return this.numOfPassenger;
    }

    public int getNumOfAirplane() {
        return numOfAirplane;
    }

    public double calCurrentValue() {
        double currentValue;
        currentValue = price - (price * 0.1 * (2011 - yearOFPurchase));
        if (currentValue < 0)
            currentValue = 0;

        return currentValue;

        // return currentValue < 0 ? 0 : currentValue;
    }

    public String toString() {
        return "Id: " + id + "\nPrice:" + price + "\nYear Of Purchase " + yearOFPurchase + "\nNum of Passenger "
                + numOfPassenger + "\nNum of Airplane " + numOfAirplane;
    }

}
