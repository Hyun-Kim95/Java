package org.opentutorials.javatutorials.reference;
class A{
	public int id;
	A(int id){
		this.id = id;
	}
}
public class ReferenceDemo1 {
	public static void runValue() {
		int a = 1;
		int b = a;	// (�⺻ ������Ÿ���� ��)����
		b = 2;
		System.out.println("runBalue, "+a);	//1
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;	// (new�� �̿��ؼ� ������Ÿ���� ���� ��)����
		b.id = 2;
		System.out.println("runReference, "+a.id);	//2
	}
	public static void main(String[] args) {
		runValue();
		runReference();

	}

}
