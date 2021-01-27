package lgs;

public class Main {
	public static void main(String[] args) {
		
		Su27 p = new Su27(452, 555,1111,4221,"blue");
		
		p.startEngines();
		p.takeoffPlane();
		p.moveUp();
		p.moveLeft();
		p.moveDown();
		p.moveRight();
		p.becomeStealth();
		p.nuclearStrike();
		p.turboAccelerate();
		p.landingPlane();
	}

}
