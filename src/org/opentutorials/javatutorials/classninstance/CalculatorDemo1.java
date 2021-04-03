package org.opentutorials.javatutorials.classninstance;

class Calculator{
	static double PI = 3.14;	// 클래스 변수(인스턴스에 따라서 변하지 않는 값)
	static int base = 0;		// final을 이용해서 상수로 선언하는 것이 바람직하지만 아직 안배움
	int left, right;			// 인스턴스 변수
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base)/2);
	}
}

public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		c2.setOprands(20,40);
		c2.sum();	// 60
		
		Calculator.base = 10;
		c2.sum();	// 70
	}
}