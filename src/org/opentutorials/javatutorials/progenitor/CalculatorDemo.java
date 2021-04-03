package org.opentutorials.javatutorials.progenitor;

class Calculator{	// extends Object �� �����ȰͰ� ����.
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
	}	// ���� toString�� ���� overriding�� ���� ���� ������ ������
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1.toString());	// c1.toString �� ����, overriding����
	}	// ctrl ���� ���·� toString�� ���콺�� �������� open implementation�� ����
		// �޼ҵ��� ��ü���� ����ü�� �̵��� �� ���� 
}
// ���: org.opentutorials.javatutorials.progenitor.Calculator@5ca881b5
//									�ν��Ͻ��� �Ҽ�				   �ĺ���