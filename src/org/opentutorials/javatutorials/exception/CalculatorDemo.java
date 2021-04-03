package org.opentutorials.javatutorials.exception;
class DivideException extends RuntimeException{		// unchecked Exception
	DivideException(){// �⺻�����ڰ� �ƴ� �����ڸ� �����	// �׳� Exception�� ����ϸ�
		super();	  // �⺻�����ڸ� �ڵ����� ������ ���ؼ�	// checked Exception�� �Ǿ
	}				  // �̷��� ���� ����� �����			// �ؿ��� try catch���� ����ϴ���
	DivideException(String message){				// throws�� ����ϴ��� �ؾ���
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
			throw new DivideException("0���� ���� �� �����ϴ�.");
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
