class brv extends cross {
	private int horsepower;
	private int wheelSize;
	private String transmissionType;

	public brv(String color, int price, int horsepower, int wheelSize, String transmissionType) throws InvalidPriceException {
		super(color, "BRV", price);
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
}
