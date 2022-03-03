package untitled;

public class Car {
	private int noofcars;
	private String carId;
    private String modelNumber;
	private String colour;
	private String transmissionType;
	private String fuelType;
	private String engineType;
	private String bodyType;
	private int engineDisplacement;
	private int bootSpace;
	private int seatCapacity;
	
	public  Car(int noofcars,String carId,String modelNumber, String colour, String transmissionType,String fuelType , String engineType,String  bodyType,int engineDisplacement,int  bootSpace, int seatCapacity)
	{
		this.noofcars = noofcars;
		this.carId = carId;
		this.modelNumber = modelNumber;
		this.colour = colour;
		this.transmissionType = transmissionType;
		this.fuelType = fuelType;
		this.engineType = engineType;
		this.bodyType = bodyType;
		this.engineDisplacement = engineDisplacement;
		this.bootSpace =bootSpace;
		this.seatCapacity = seatCapacity;
	}

	public int getNoofcars() {
		return noofcars;
	}

	public void setNoofcars(int noofcars) {
		this.noofcars = noofcars;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	public int  getSeatCapacity(){
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
