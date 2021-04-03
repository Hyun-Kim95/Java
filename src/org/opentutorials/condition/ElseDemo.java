package org.opentutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		if(false) {
			System.out.println(1);	// X
		}else if(true) {
			System.out.println(2);	// Ãâ·Â
		}else if(true) {
			System.out.println(3);	// X
		}else {
			System.out.println(4);	// X
		}

	}

}
