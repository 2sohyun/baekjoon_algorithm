package level1;

/* 두 수 A,B,C를 입력하고, 나머지 연산 결과를 출력 */

import java.util.*;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		sc.close(); // sc에 경고가 뜰 뿐 영향x

		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);
	}

}
