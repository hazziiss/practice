/**
 * ���ϸ� : CommentsTest.java
 * �ۼ��� : 2022/02/03
 * �ۼ��� : ������
 */

/*
 * ���� Ŭ������ ������ ���� �� ���� ������ ����ϴ� �ڹ� ���α׷��̴�.
 * "��µ� ������ ������ �����ϴ�."
 * "ó�� �ۼ��� �ڹ� ���α׷��Դϴ�."
 */
package testProject;

public class CommentsTest {
	static String s = "��µ� ������ ������ �����ϴ�.\n";
	
	//�� ��° �ٿ� ������ ����ϴ� �޼��� ����
	static String getMessage( ) {
		return "ó�� �ۼ��� �ڹ� ���α׷��Դϴ�.";
	}
	public static void main(String args[]) {
		System.out.println(s + getMessage()); //���� â ���
		
	}
}
