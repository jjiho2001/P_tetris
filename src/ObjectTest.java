
class ObjectTest {
	
	static {
		System.out.println("ObjectTest : 角青巩1");
	}
	
	static ObjectTest test = new ObjectTest();
	
	static {
		System.out.println("ObjectTest : 角青巩2");
	}
	
	ObjectTest() {
		System.out.println("ObjectTest : 角青巩3");
		System.out.println("林家蔼 馆券 : " + test);
	}
	
	public static void main(String[] args) {
		
		System.out.println("\na 按眉 积己");
		ObjectTest a = new ObjectTest();
		
		System.out.println("\nb 按眉 积己");
		ObjectTest b = new ObjectTest();
		
		System.out.println("\nc 按眉 积己");
		Test c = new Test();
		
		System.out.println("\n林家蔼 馆券");
		System.out.println("a = " + a + ", a.test = " + a.test);
		System.out.println("b = " + b + ", b.test = " + b.test);
		System.out.println("c = " + b + ", c.test = " + c.test);
	}
}

class Test{
	
	static{
		System.out.println("test : 角青巩4");
	}
	
	static ObjectTest test = new ObjectTest();
	
	static{
		System.out.println("test : 角青巩5");
	}
	
	Test(){
		
	}
}
