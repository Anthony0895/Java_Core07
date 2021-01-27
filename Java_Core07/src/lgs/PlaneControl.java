package lgs;

public class PlaneControl {

	public void moveUp() {
		System.out.println("The plane flew up " + Move.move() + "km!");
	}

	public void moveDown() {
		System.out.println("The plane flew down " + Move.move() + "km!");
	}

	public void moveRight() {
		System.out.println("The plane flew right " + Move.move() + "km!");
	}

	public void moveLeft() {
		System.out.println("The plane flew left " + Move.move() + "km!");
	}

}
