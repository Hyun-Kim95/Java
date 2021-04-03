package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);	// int형의 계산이므로 정수 부분만 결과로 나옴
		System.out.println(c/d);	// 소수점 뒤를 잃어버리지 않음
		System.out.println(a/d);	// 형변환이 일어나서 소수점 뒤를 잃어버리지 않음
	}

}
