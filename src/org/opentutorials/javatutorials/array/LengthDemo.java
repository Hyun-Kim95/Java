package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		//String[] classGroup = { "������", "������", "���̶�", "�̰���"};
		String[] classGroup = new String[4];
		classGroup[0] = "������";
		System.out.println(classGroup.length);
		classGroup[0] = "������";
		System.out.println(classGroup.length);
		classGroup[0] = "���̶�";
		System.out.println(classGroup.length);
		classGroup[0] = "�̰���";
		System.out.println(classGroup.length);
	}

}
