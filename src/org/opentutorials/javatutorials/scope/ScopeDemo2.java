package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i;			// 전역변수
	
	static void a() {
		i = 0;				// 전역변수의 값을 사용하고 있음(i 앞에 int가 붙어 있으면 지역변수로 인식)
	}

	public static void main(String[] args) {
		for(i = 0; i < 5; i++) {// 전역변수의 값을 사용하고 있음(i 앞에 int가 붙어 있으면 지역변수로 인식)
			a();
			System.out.println(i);	// 0만 무한출력
		}

	}

}
