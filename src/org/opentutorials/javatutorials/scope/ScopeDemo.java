package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	static void a() {
		int i = 0;		// scope(��ȿ����): �޼ҵ� �ȿ����� ��ȿ�ϴ�
	}

	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			a();					// ���⼭�� i�� ������ ����
			System.out.println(i);
		}

	}

}
