package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A{	// �߻�޼ҵ尡 �ϳ��� ������ Ŭ������ �׻� �߻� Ŭ������ �ȴ�
	public abstract int b();	// ������ ���� �߻� �޼ҵ� -> ��ӽ� �������̵� ����� ������ �Ȼ���
	//��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	//public abstract int c(){System.out.println("Hello")}	// ������ �ִµ� abstract�� ����ؼ� �����߻�
	//�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() {	// �߻�޼ҵ带 �������̵� -> �����ذ�
		return 1;
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
//		A obj = new A();
		B obj = new B();

	}

}
