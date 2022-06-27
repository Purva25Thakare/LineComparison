package bridzelabzday3.LineComparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String args[]) {
		System.out.println("Welcome to the Line Comparison Problem");
		int x1,x2,y1,y2;
		int x3,y3,x4,y4;
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x1");
		x1=sc.nextInt();
		System.out.println("Enter value of y1");
		y1=sc.nextInt();
		System.out.println("Enter value of x2");
		x2=sc.nextInt();
		System.out.println("Enter value of y2");
		y2=sc.nextInt();
		Double length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The length of line1 is" +length1);
		System.out.println("Enter value of x3");
		x3=sc.nextInt();
		System.out.println("Enter value of y3");
		y3=sc.nextInt();
		System.out.println("Enter value of x4");
		x4=sc.nextInt();
		System.out.println("Enter value of y4");
		y4=sc.nextInt();
		Double length2=Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("The length of line2 is" +length2);
			/*if(length1.equals(length2)) {
		System.out.println("Lines are equal");
		}
		else {
			System.out.println("Lines are not equal");
		}*/
		
			System.out.println(length1 + ".compareTo " +length2+ ":" +length1.compareTo(length2));
			}
			
		
	}


