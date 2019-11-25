
package javaprgm;

public class Quadratic {
	public static void main(String[]args) {
		double a=1,b=5,c=2;
		double determinant,r1,r2;
		determinant=(b*b)-(4*a*c);
		//condition for real and different roots
		if(determinant>0) {
			r1=(-b+Math.sqrt(determinant))/	(2*a);
			r2=(-b-Math.sqrt(determinant))/	(2*a);
			System.out.format("roots are %.2f and %.2f",r1,r2);
		}
		//condition for real and equal roots
		else if(determinant==0) {
			r1=r2=-b/(2*a);
			System.out.format("roots are equal%.2f"+r1);	
		}
		//if roots are equal
		else {
			double real=-b/(2*a);
			double imaginry=Math.sqrt(-determinant)/(2*a);	
			System.out.format("roots are %.2f+%.2fi",real,imaginry);
			}
		
		
	}

}
