
public class InterfacePractice4 {

	public InterfacePractice4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		MyInterface.staticmethod1();
		MyInterface2.staticmethod1();
	}

}
class Child extends Parent implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child");
	}
}
class Parent {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}
interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticmethod1() {
		System.out.println("staticmethod1() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticmethod1() {
		System.out.println("staticmethod1() in MyInterface2");
	}
}