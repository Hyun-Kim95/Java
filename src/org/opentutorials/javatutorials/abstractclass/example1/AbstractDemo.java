package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A{	// 추상메소드가 하나라도 있으면 클래스는 항상 추상 클래스가 된다
	public abstract int b();	// 내용이 없는 추상 메소드 -> 상속시 오버라이딩 해줘야 오류가 안생김
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){System.out.println("Hello")}	// 내용이 있는데 abstract를 사용해서 오류발생
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() {	// 추상메소드를 오버라이딩 -> 오류해결
		return 1;
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
//		A obj = new A();
		B obj = new B();

	}

}
