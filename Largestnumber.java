package javaprgm;
import java.util.Scanner;
public class Largestnumber {
	public static void main(String[] args) {
		int largest,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();	
		}
	largest=a[0];
	for(int i=1;i<n;i++) {
		if(largest<a[i]) {
			largest=a[i];
		}
		}
	System.out.println("largest number is"+largest);	
	sc.close();
	
	}
}
