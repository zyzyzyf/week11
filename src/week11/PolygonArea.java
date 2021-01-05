package week11;
import java.util.Scanner;
public class PolygonArea {
	public static void main(String[] args){
		double s=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of the points: ");
		int n=input.nextInt();
		double[] a=new double[n];
		double[] b=new double[n];
		System.out.println("Enter the coordinates of the points: ");
		for(int i=0;i<n;i++){
			a[i]=input.nextDouble();
			b[i]=input.nextDouble();
		}
		for(int i=0;i<n;i++){
			s+=(a[i]*(b[(i+1)%n])-a[(i+1)%n]*b[i])/2.0;
		}
		s=Math.abs(s);
		System.out.println("The total area is "+String.format("%.3f",s));
	}
}
