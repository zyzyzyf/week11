package week11;
import java.util.Scanner;
public class DuplicateRemoval {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten integers: ");
		int[] a=new int[13];
		for(int i=0;i<10;i++){
			a[i]=input.nextInt();
		}
		System.out.print("The distinct integers are "+a[0]+" ");
		removeDuplicate(a);
	}
	public static void removeDuplicate(int[] list){
		int[] b=new int[13];
		b[0]=list[0];
		int c=0,d=1;
		for(int i=1;i<10;i++){
			for(int j=0;j<d;j++){
				if(list[i]!=b[j]) c++;
				else break;
			}
			if(c==d){
				b[d]=list[i];
				d++;
				System.out.print(list[i]+" ");
			}
			c=0;
		}
	}
}
