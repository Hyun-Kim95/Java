package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		//String[] classGroup = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷", "ÀÌ°íÀ×"};
		String[] classGroup = new String[4];
		classGroup[0] = "ÃÖÁøÇõ";
		System.out.println(classGroup.length);
		classGroup[0] = "ÃÖÀ¯ºó";
		System.out.println(classGroup.length);
		classGroup[0] = "ÇÑÀÌ¶÷";
		System.out.println(classGroup.length);
		classGroup[0] = "ÀÌ°íÀ×";
		System.out.println(classGroup.length);
	}

}
