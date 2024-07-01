package Calaculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int Num=sc.nextInt();
		System.out.println("Please enter the secomd number");
		int Num1=sc.nextInt();
		System.out.println("Please enter the operation you want to do");
		String Opr=sc.next();
		sc.close();
		
		if (Opr.equals("+")) {
			int sum=Num+Num1;
			System.out.println(sum);
			
		}
		else if (Opr.equals("-")) {
			int sub=Num-Num1;
			System.out.println(sub);
		}
		
		else if (Opr.equals("*")) {
			int mul=Num*Num1;
			System.out.println(mul);
		}
		else if (Opr.equals("/")) {
			int div=Num/Num1;
			System.out.println(div);
		}
		else {
			System.err.println("InvalidOperator");
		}

	}

}
