package org.opentutorials.javatutorials.constructor;

class Calculator{
	int left, right;
	// 생성자(초기화역할)↓: 클래스와 이름이 같은 매소드를 가장 먼저 실행하기 때문
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
						// ↓ 새로운 생성자
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();

	}

}
