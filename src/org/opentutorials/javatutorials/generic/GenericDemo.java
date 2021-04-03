package org.opentutorials.javatutorials.generic;
interface Info{	// �Ʒ����� ����ص� ��
	int getLevel();
}
/*
 * abstract class Info{ public abstract int getLevel(); }
 */
class EmployeeInfo implements Info{	// ������ abstract�� ���� implements -> extends
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
	public int getLevel() {
		return this.rank;
	}
}
class Person<T extends Info>{	// ���׸� ������Ÿ������ Info�� (������ Ÿ��)�ڽ��� ���;� �Ѵٴ� ��
	public T info;
	Person(T info){
		this.info = info;
		info.getLevel();
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		//Person<String> p2 = new Person<String>("����");	// String�� Info�� �ڽ��� �ƴ϶� �����߻�
	}
}
