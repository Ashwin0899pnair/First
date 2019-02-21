package VVCE;

 class Lamp {
	boolean isOn;
	void turnOn() {
		isOn=true;
	}
	void turnOff() {
		isOn=false;
	}
	void display() {
		System.out.println("lightStatus "+isOn);
	}
}
public class LampExample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        l1.turnOn();
        l2.turnOff();
        l1.display();
        l2.display();
	}

}
