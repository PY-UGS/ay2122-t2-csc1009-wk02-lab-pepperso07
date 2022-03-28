

import java.util.Scanner;

public class Lab2qn4 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a year: ");
	int year = input.nextInt();
	
	int zYear= year % 12;
	if(zYear==0)
		System.out.println("Monkey");
	
	else if(zYear==1)
		System.out.println("Rooster");
	
	else if(zYear==2)
		System.out.println("Dog");
	
	else if(zYear==3)
		System.out.println("Pig");
	
	else if(zYear==4)
		System.out.println("Rat");
	
	else if(zYear==5)
		System.out.println("Ox");
	
	else if(zYear==6)
		System.out.println("Tiger");
	
	else if(zYear==7)
		System.out.println("Rabbit");
	
    else if(zYear==8)
    	System.out.println("Dragon");
	
	else if(zYear==9)
		System.out.println("Snake");
	
	else if(zYear==10)
		System.out.println("Horse");
	
	else if(zYear==11)
		System.out.println("Sheep");
								
}
}
