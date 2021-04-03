package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	static void a() {
		int i = 0;		// scope(유효범위): 메소드 안에서만 유효하다
	}

	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			a();					// 여기서는 i에 영향이 없다
			System.out.println(i);
		}

	}

}
