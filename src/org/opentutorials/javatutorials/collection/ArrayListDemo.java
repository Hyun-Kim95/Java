package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;	// Collections framework �߿� ArrayList

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three"; // ���� �߻�
		for(int i = 0; i< arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();// ���� �����Ͱ� StringŸ������ ������(���׸�)
		al.add("one");	// ��� ������Ÿ���� ������ �� ����(Object ������Ÿ��)
		al.add("two");
		al.add("three");
		for(int i = 0; i < al.size(); i++) {
			String value = al.get(i);	//(String)al.get(i); �̷��� ����ȯ �����൵ ��	��
			System.out.println(value);
		}
	}

}
