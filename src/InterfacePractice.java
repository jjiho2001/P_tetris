
public class InterfacePractice {

	public InterfacePractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);

	}

}

interface Repairable{
	
}

class TerranUnit{
	int hitPoint;
	final int MAX_HP;
	
	TerranUnit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends TerranUnit{
	
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends TerranUnit{
	
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable{
	
	DropShip(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "DropShip";
	}
}

class Marine extends GroundUnit{
	
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable repairable) {
		if (repairable instanceof TerranUnit) {
			TerranUnit unit = (TerranUnit) repairable;
			while(unit.hitPoint != unit.MAX_HP) {
				unit.hitPoint++;
			}
			System.out.println(unit.toString() + "의 수리가 완료되었습니다");
		}
		
	}
}