package org.opentutorials.javatutorials.polymorphism;
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}	// A를 오버로딩
	public String y() {return "y";}
}
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();				// B를 참조하지만 A의 데이터타입을 가지고 있음
		System.out.println(obj.x());	// 결과: B.x
		//System.out.println(obj.y());	// A에는 y가 없으므로 오류발생
	}

}
