//package exam1124;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Exam1 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		try {
//			int num1 = scanner.nextInt();
//			int num2 = scanner.nextInt();
//			System.out.println((num1+num2));
//			
//		}
//		catch(InputMismatchException e) {
//			System.out.println("정수가 아닙니다.");
//			//e.printStackTrace();
//			System.out.println("0");
//		}
//		
//		scanner.close();
//		
//		
//		
//		
//	}
//}

package exam1124;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[] values = {1, 3, 5, 7, 9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("인덱스를 선택하세요.");
		try {
		int index = scanner.nextInt();
		System.out.println(values[index]);
		}
		catch(InputMismatchException e) {
			System.out.println(values[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(values[0]);
		}
		scanner.close();
	}
}