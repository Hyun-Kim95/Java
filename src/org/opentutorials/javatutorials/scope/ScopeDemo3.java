package org.opentutorials.javatutorials.scope;

class C{
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);		// ���������� �켱�����̹Ƿ� 20���
		System.out.println(this.v);	// �̸��� ���� �� this�� ������ ���������� ����� �� ����
	}
}
public class ScopeDemo3 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
