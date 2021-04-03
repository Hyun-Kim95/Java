package org.opentutorials.javatutorials.loop;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false가 된다.
		while(i<10) {
			System.out.println("Coding Everybody" + i);
			// i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문의 처음으로 가서
			// 조건을 검사하게 된다
			i++;
		}

	}

}
