
class ObjectTest {
	
	static {
		System.out.println("ObjectTest : ���๮1");
	}
	
	static ObjectTest test = new ObjectTest();
	
	static {
		System.out.println("ObjectTest : ���๮2");
	}
	
	ObjectTest() {
		System.out.println("ObjectTest : ���๮3");
		System.out.println("�ּҰ� ��ȯ : " + test);
	}
	
	public static void main(String[] args) {
		
		System.out.println("\na ��ü ����");
		ObjectTest a = new ObjectTest();
		
		System.out.println("\nb ��ü ����");
		ObjectTest b = new ObjectTest();
		
		System.out.println("\nc ��ü ����");
		Test c = new Test();
		
		System.out.println("\n�ּҰ� ��ȯ");
		System.out.println("a = " + a + ", a.test = " + a.test);
		System.out.println("b = " + b + ", b.test = " + b.test);
		System.out.println("c = " + b + ", c.test = " + c.test);
	}
}

class Test{
	
	static{
		System.out.println("test : ���๮4");
	}
	
	static ObjectTest test = new ObjectTest();
	
	static{
		System.out.println("test : ���๮5");
	}
	
	Test(){
		
	}
}
