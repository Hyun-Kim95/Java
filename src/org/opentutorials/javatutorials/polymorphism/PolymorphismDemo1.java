package org.opentutorials.javatutorials.polymorphism;
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}	// A�� �����ε�
	public String y() {return "y";}
}
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();				// B�� ���������� A�� ������Ÿ���� ������ ����
		System.out.println(obj.x());	// ���: B.x
		//System.out.println(obj.y());	// A���� y�� �����Ƿ� �����߻�
	}

}