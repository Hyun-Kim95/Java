package org.opentutorials.javatutorials.classninstance;

class Calculator{
	static double PI = 3.14;	// Ŭ���� ����(�ν��Ͻ��� ���� ������ �ʴ� ��)
	static int base = 0;		// final�� �̿��ؼ� ����� �����ϴ� ���� �ٶ��������� ���� �ȹ��
	int left, right;			// �ν��Ͻ� ����
	
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