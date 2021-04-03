package org.opentutorials.javatutorials.progenitor;

class Calculator{	// extends Object 가 생략된것과 같다.
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	public String toString() {
		return super.toString()+", left:"+this.left+", right:"+this.right;
	}	// 원래 toString의 값과 overriding한 값이 같이 나오게 정의함
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1.toString());	// c1.toString 과 같다, overriding가능
	}	// ctrl 누른 상태로 toString에 마우스를 가져가면 open implementation을 통해
		// 메소드의 구체적인 구현체로 이동할 수 있음 
}
// 결과: org.opentutorials.javatutorials.progenitor.Calculator@5ca881b5
//									인스턴스의 소속				   식별값