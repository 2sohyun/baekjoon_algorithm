package level1;

/* �� �� A,B,C�� �Է��ϰ�, ������ ���� ����� ��� */

import java.util.*;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		sc.close(); // sc�� ��� �� �� ����x

		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);
	}

}
