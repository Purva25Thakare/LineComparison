package bridzelabzday3.LineComparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String args[]) {
		System.out.println("Welcome to the Line Comparison Problem");
		int x1,x2,y1,y2;
		double distance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x1");
		x1=sc.nextInt();
		System.out.println("Enter value of y1");
		y1=sc.nextInt();
		System.out.println("Enter value of x2");
		x2=sc.nextInt();
		System.out.println("Enter value of y2");
		y2=sc.nextInt();
		distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The distance between two lines is" +distance);
	}

}
