package Calaculator;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int Num=sc.nextInt();
		System.out.println("Enter the second number");
		int Num1=sc.nextInt();
		System.out.println("Enter the operation you want to do");
		String opr=sc.next();
		
		switch (opr) {
		case "+": {
			
		int sum=Num+Num1;
		System.out.println(sum);
		}
		
		break;
		case"-":{
			int sub=Num-Num1;
			System.out.println(sub);
		}
		break;
		case "*":{
			int mul=Num*Num1;
			System.out.println(mul);
		}
		break;
		case "/":{
			int div=Num/Num1;
					System.out.println(div);
		}
		break;
		
		default:
			System.err.println("Invalid Operator");
		}

	}

}
