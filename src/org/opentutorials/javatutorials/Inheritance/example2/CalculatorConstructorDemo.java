package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator{
	int left, right;
	
//	public Calculator() {}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right); 
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}
class SubstractionableCalculator extends Calculator{
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
//		this.left = left;
//		this.right = right;
	}
}

public class CalculatorConstructorDemo {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		
	}

}
