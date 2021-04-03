package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator{
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		c1.setOprands(10, 20);
		c1.sum();			// 같은 패키지에 이미 클래스를 만들어서 여기서 또 만들 필요가 없다
		c1.avg();
		c1.multiplication();

	}

}
