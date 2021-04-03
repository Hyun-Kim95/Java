package org.opentutorials.javatutorials.generic;
interface Info{	// 아래꺼로 대신해도 됨
	int getLevel();
}
/*
 * abstract class Info{ public abstract int getLevel(); }
 */
class EmployeeInfo implements Info{	// 위에서 abstract를 쓰면 implements -> extends
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
	public int getLevel() {
		return this.rank;
	}
}
class Person<T extends Info>{	// 제네릭 데이터타입으로 Info의 (구현한 타입)자식이 들어와야 한다는 뜻
	public T info;
	Person(T info){
		this.info = info;
		info.getLevel();
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		//Person<String> p2 = new Person<String>("부장");	// String은 Info의 자식이 아니라서 오류발생
	}
}
