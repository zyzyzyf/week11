package week11;
import java.util.Scanner;
public class LargesTrowsAndColumns {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int n=input.nextInt();
		int[][] a=new int[n][n];
		int[] row=new int[n];
		int[] column=new int[n];
		
		System.out.println("The random array is ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=(int)(Math.random()*2);
				System.out.print(a[i][j]);
				if(a[i][j]==1){
					row[i]++;
					column[j]++;
				}
			}
			System.out.println();
		}
		System.out.print("The largest row index: ");
		int max=row[0];
		for(int i=0;i<n;i++){
			if(row[i]>max) max=row[i];
		}
		for(int i=0;i<n;i++){
			if(row[i]==max) System.out.print(i);
		}
		System.out.println();
		System.out.print("The largest column index: ");
		max=column[0];
		for(int i=0;i<n;i++){
			if(column[i]>max) max=column[i];
		}
		for(int i=0;i<n;i++){
			if(column[i]==max) System.out.println(i);
		}
	}
}
