package cars;

public class Tesla implements Car {

	String model;

	int horsePower;

	int xPosition;

	int yPosition;

	public Tesla(String model, int horsePower, int xPosition, int yPosition) {
		this.model = model;
		this.horsePower = horsePower;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	@Override
	public void drive() {
		setxPosition(getxPosition() + 5);
		setyPosition(getyPosition() + 5);
	}

	@Override
	public void printPosition() {
		System.out.print(this.getxPosition() + " ");
		System.out.print(this.getyPosition() + " ");
		System.out.println();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

}
