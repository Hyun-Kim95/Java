package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;	// Collections framework 중에 ArrayList

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three"; // 오류 발생
		for(int i = 0; i< arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();// 들어가는 데이터가 String타입임을 정해줌(제네릭)
		al.add("one");	// 모든 데이터타입을 저장할 수 있음(Object 데이터타입)
		al.add("two");
		al.add("three");
		for(int i = 0; i < al.size(); i++) {
			String value = al.get(i);	//(String)al.get(i); 이렇게 형변환 안해줘도 됨	↑
			System.out.println(value);
		}
	}

}
