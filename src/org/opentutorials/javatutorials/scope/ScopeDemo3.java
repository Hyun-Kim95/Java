package org.opentutorials.javatutorials.scope;

class C{
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);		// 지역변수가 우선순위이므로 20출력
		System.out.println(this.v);	// 이름이 같을 때 this를 붙혀서 전역변수를 사용할 수 있음
	}
}
public class ScopeDemo3 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
