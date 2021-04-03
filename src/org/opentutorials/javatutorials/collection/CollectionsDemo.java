package org.opentutorials.javatutorials.collection;

import java.util.*;

class Computer implements Comparable{	// 밑에서 sort 사용하려면 이걸 해야함
	int serial;
	String owner;
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {	// Comparable은 이것을 구현하라고 강제함
		return this.serial - ((Computer)o).serial;	// 받아온 인자의 크기에 따라 + 0 - 로 구별됨
	}
	public String toString() {
		return serial+" "+owner;
	}
}
public class CollectionsDemo {

	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(3233, "graphittie"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
