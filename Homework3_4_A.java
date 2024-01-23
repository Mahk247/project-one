package com.osa.homeworks;
import java.util.Random;
import java.util.Scanner;

public class Homework3_4_A {
	public static void main(String[] args) {
		int min=10,  max=20, count=1;
		int correctAnwer = 0, wrongAnswer = 0;
		Random ran=new Random();
		System.out.print("What's your name?");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Number of question: ");
		int noq=sc.nextInt();
	while(count<=noq){
		int sign=ran.nextInt(4);
		int num1=ran.nextInt (max-min)+max;
		int num2=ran.nextInt(max-min)+min;
			if(sign==0) {
				int actulRes =Math.addExact(num1, num2);
				System.out.println(count+") "+num1+"+"+num2+"=?\nYour Answer : ");
				int userRes=sc.nextInt();
					if(actulRes==userRes) {
						System.out.println("Correct!!");
						correctAnwer++;
						}
					else {
						System.out.println("Wrong!!!");
						wrongAnswer++;
						}
			count++;
				}
				else if (sign==1) {
					int actulRes =Math.subtractExact(num1, num2);
					System.out.println(count+") "+num1+"-"+num2+"=?\nYour Answer : ");
					int userRes=sc.nextInt();
						if(actulRes==userRes) {
							System.out.println("Correct!!");
							correctAnwer++;
							}
						else {
							System.out.println("Wrong!!!");
							wrongAnswer++;
							}
				count++;	
				}
				else if (sign==2) {
					int actulRes =Math.multiplyExact(num1,num2);
					System.out.println(count+") "+num1+"x"+num2+"=?\nYour Answer : ");
					int userRes=sc.nextInt();
						if(actulRes==userRes) {
							System.out.println("Correct!!");
							correctAnwer++;
							}
						else {
							System.out.println("Wrong!!!");
							wrongAnswer++;
							}
				count++;	
				}
				else if (sign==3) {
					int actulRes =Math.floorDiv(num1,num2);
					System.out.println(count+") "+num1+"÷"+num2+"=?\nYour Answer : ");
					int userRes=sc.nextInt();
						if(actulRes==userRes) {
							System.out.println("Correct!!");
							correctAnwer++;
							}
						else {
							System.out.println("Wrong!!!");
							wrongAnswer++;
							}
				count++;	
				}
				else {
					System.out.println(" ");
				}
			}
			System.out.println("*Thank's "+name+" for taking the Quzie !!");
			System.out.println("Your Correct Answer: "+correctAnwer);
			System.out.println("Your Wrong Answer: "+wrongAnswer);
		sc.close();
		}
}
