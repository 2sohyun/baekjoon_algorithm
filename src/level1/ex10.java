package level1;

/* 두 자연수 A,B가 주어진다. 이 때 사칙연산을 출력 */

import java.util.*;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close(); // sc에 경고가 뜰 뿐 영향x
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}

}
