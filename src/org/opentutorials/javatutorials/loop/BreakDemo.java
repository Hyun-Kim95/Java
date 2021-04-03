package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5)
				break;	// 한줄일 때 중괄호 생략 가능
			System.out.println("Coding Everybody"+i);
		}

	}

}
