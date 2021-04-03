package org.opentutorials.javatutorials.exception;
class DivideException extends RuntimeException{		// unchecked Exception
	DivideException(){// 기본생성자가 아닌 생성자를 만들면	// 그냥 Exception을 상속하면
		super();	  // 기본생성자를 자동으로 만들지 못해서	// checked Exception이 되어서
	}				  // 이렇게 따로 만들어 줘야함			// 밑에서 try catch문을 사용하던지
	DivideException(String message){				// throws를 사용하던지 해야함
		super(message);
	}
}
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.");
		}
		System.out.print(this.left/this.right);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}

}
