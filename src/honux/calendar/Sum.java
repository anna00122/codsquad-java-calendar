package honux.calendar;

import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		//입력 : 키보드로 두수의 입력을 받는다.
	 int a,b; 
	 //출력 : 화면에 두수의 합을 출력한다 
	 Scanner scanner = new Scanner(System.in);
	 String s1, s2;
	 System.out.println("두 수를 입력해주세요");
	 s1 = scanner.next();
	 s2 = scanner.next();
	 System.out.println(s1+","+s2);
	 a = Integer.parseInt(s1);
	 b= Integer.parseInt(s2);
	//System.out.println("두 수의 합은" + (a+b) + "입니다");

	 System.out.printf("%d와 %d의 합은 %d 입니다",a,b,a+b);
	 scanner.close();
	 
		
	}
}
