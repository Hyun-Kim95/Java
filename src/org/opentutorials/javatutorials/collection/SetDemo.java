package org.opentutorials.javatutorials.collection;

import java.util.HashSet;	// set: �ߺ�X
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
		
		System.out.println(A.containsAll(B));	// �κ����� false
		System.out.println(A.containsAll(C));	// �κ����� true
		
		//A.addAll(B);	// ������
		//A.retainAll(B);	// �����ո� ����
		//A.removeAll(B);	// ������
		
		Iterator hi = (Iterator) A.iterator();	// collection �������̽��� ��� Ŭ�������� ������ �ִ� �������� api
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}

}
