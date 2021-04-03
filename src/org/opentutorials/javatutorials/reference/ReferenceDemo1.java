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
		int b = a;	// (기본 데이터타입일 때)복제
		b = 2;
		System.out.println("runBalue, "+a);	//1
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;	// (new를 이용해서 데이터타입을 만들 때)참조
		b.id = 2;
		System.out.println("runReference, "+a.id);	//2
	}
	public static void main(String[] args) {
		runValue();
		runReference();

	}

}
