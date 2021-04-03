package org.opentutorials.javatutorials.polymorphism;
interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		D obj = new D();	// A, B 둘 다 필요할때
		I2 objI2 = new D();	// A만 필요할때
		I3 objI3 = new D();	// B만 필요할때

		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		
		//objI3.A();
		objI3.B();
	}

}
