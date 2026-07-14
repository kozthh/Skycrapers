import parentsedan.sedan;
package childsedan;
public class vios extends sedan {
    private int horsepower;
    private int wheelSize;
    private String transmissionType;

    public vios(String color, String yearmodel, int price, String model, int horsepower, int wheelSize, String transmissionType) throws InvalidPriceException {
        super(color, 2026, 900000, "vios");
        this.horsepower = horsepower;
        this.wheelSize = wheelSize;
        this.transmissionType = transmissionType;
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

    @Override
    public void displayInfo() {
        System.out.println("Vios:");
        super.displayInfo();
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Wheel Size: " + wheelSize);
        System.out.println("Transmission Type: " + transmissionType);
    }

}