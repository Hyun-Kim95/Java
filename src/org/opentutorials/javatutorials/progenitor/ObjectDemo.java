package org.opentutorials.javatutorials.progenitor;

class Student implements Cloneable{	// 들어가보면 비어있는 메소드임
	String name;					// Student가 복제 가능하다는 것을 알려주는 구분자역할
	Student(String name){			// clone의 접근제어자가 protected 라서
		this.name = name;			// 이것만으로는 오류가 발생(checked Exception)
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		try {
			Student s2 = (Student)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
