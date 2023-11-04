package com.groot.demo;
import java.util.Scanner;
public class Demo {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter value of a: ");
			int a=sc.nextInt();
			System.out.println("Please enter value of b: ");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Addition of and B ::"+c);
		}
}
