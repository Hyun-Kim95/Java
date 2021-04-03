package org.opentutorials.javatutorials.progenitor;

class Student implements Cloneable{	// ������ ����ִ� �޼ҵ���
	String name;					// Student�� ���� �����ϴٴ� ���� �˷��ִ� �����ڿ���
	Student(String name){			// clone�� ���������ڰ� protected ��
		this.name = name;			// �̰͸����δ� ������ �߻�(checked Exception)
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
