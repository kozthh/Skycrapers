import parentSUV.suv;
package childSUV;
public class Fortuner extends suv {
    private int horsepower;
    private int wheelSize;
    private String transmissionType;
    private String GasType;


    public Fortuner(String color, String yearmodel, int price, String model, int horsepower, int wheelSize, String transmissionType, String GasType) throws InvalidPriceException {
        super(color, 2026, 8000000, "Fortuner");
        this.horsepower = horsepower;
        this.wheelSize = wheelSize;
        this.transmissionType = transmissionType;
        this.GasType = GasType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getGasType() {
        return GasType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fortuner:");
        super.displayInfo();
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Wheel Size: " + wheelSize);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Gas Type: " + GasType);
    }

    
}