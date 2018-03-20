package net.accnture.prebootcamp.oop;

public class Child extends Parent{
	String name ="Lucy";
	
	public void sleep() {
		System.out.println(name+"sleeps early");
	}
	public static void main(String...strings) {
		Child dauther = new Child();
		System.out.println(dauther.address);
		System.out.println(dauther.name);
		Parent father = new Parent();
		father.sleep();
		dauther.sleep();
		
				
	}

}
