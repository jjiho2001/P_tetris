
public class InterfacePractice3 {

	public InterfacePractice3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA();

	}

}

class A2 {
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i);
	}
}

interface I2{
	void methodB();
}

class B2 implements I2 {
	public void methodB(){
		System.out.println("methodB in B class");
	}
	
	public String toString() {
		return "class B";
	}
}

class InstanceManager{
	public static I2 getInstance() {
		return new B2();
	}
}