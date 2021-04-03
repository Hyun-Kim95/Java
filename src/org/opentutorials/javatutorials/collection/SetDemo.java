package org.opentutorials.javatutorials.collection;

import java.util.HashSet;	// set: 중복X
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));	// 부분집합 false
		System.out.println(A.containsAll(C));	// 부분집합 true
		
		//A.addAll(B);	// 합집합
		//A.retainAll(B);	// 교집합만 남김
		//A.removeAll(B);	// 차집합
		
		Iterator hi = (Iterator) A.iterator();	// collection 인터페이스의 모든 클래스들이 가지고 있는 공통적인 api
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}

}
