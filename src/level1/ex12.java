package level1;

/* (�� �ڸ� ��) �� (�� �ڸ� ��)�� 
������ ���� ������ ���Ͽ� �̷������.

		4 7 2   ---- (1)
	  x 3 8 5   ---- (2)
-------------------------
	  2 3 6 0   ---- (3)
	3 7 7 6     ---- (4)
  1 4 1 6       ---- (5)
-------------------------
  1 8 1 7 2 0   ---- (6)
  
(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
(3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

import java.util.*;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1*(num2%10));
		System.out.println(num1*((num2%100)/10));
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);

	}
}
