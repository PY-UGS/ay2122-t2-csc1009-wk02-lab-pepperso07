package Wk2;
import java.util.Scanner; 

public class Lab2ex2 {
public static void main(String[] args) {
	
	double PI= 3.14159;
	 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter radius of circle : ");
	double radius = input.nextFloat();
	
	double area;
	area= radius * radius * PI;
	
	System.out.println("Area for circle of radius "+radius +" is "+area);
}
}
