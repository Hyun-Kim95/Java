package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i;			// ��������
	
	static void a() {
		i = 0;				// ���������� ���� ����ϰ� ����(i �տ� int�� �پ� ������ ���������� �ν�)
	}

	public static void main(String[] args) {
		for(i = 0; i < 5; i++) {// ���������� ���� ����ϰ� ����(i �տ� int�� �پ� ������ ���������� �ν�)
			a();
			System.out.println(i);	// 0�� �������
		}

	}

}
