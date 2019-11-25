package javaprgm;
import java.util.Scanner;
public class Sumofnumbers {
	public static void main(String[]args) {
	int sum=0,i=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter"+n+"numbers");
	for(i=0;i<n;i++) {
		a[i] =sc.nextInt();
	}
	for(i=0;i<n;i++) {
		sum=sum+a[i];	
	}
	System.out.println("sum of numbers"+sum);
	sc.close();
}
}