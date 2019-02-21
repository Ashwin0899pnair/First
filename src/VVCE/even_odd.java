package VVCE;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int ar[] = new int[50];
	
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<50;i++) 
		{
		    if(ar[i]%2==0)
		
			System.out.println("Even");
		
		else
		
			System.out.println("Odd");
		
	
	
		}

	}

}
