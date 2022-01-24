package chapter05;
import java.util.Scanner; 
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		//Random numbers
		//Ask user to guess numbers
		//declare 2 variables that randomly generates 2 random numbers
		int num1=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		//casting: upgrade or downgrade of data 
		
		Scanner input= new Scanner(System.in); 
		
		System.out.print("What is "+num1+" + " + num2 + "? ");
		int answer=input.nextInt();
		
		while(num1 + num2 != answer) {
			System.out.print("Wrong answer. Try again! What is " 
					+num1 +" + "+ num2 + "? ");
			answer=input.nextInt();
		}
		
		System.out.println("You got it!");
			
			
		}


	}


