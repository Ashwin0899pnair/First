package VVCE;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
	   
        String name = sc.nextLine();
        
        char gender = sc.next().charAt(0);
        
	    int age = sc.nextInt();
	    long mobileNo = sc.nextLong();
	    double cgpa = sc.nextDouble();
	    
	    System.out.println("Name: "+name);
	    System.out.println("Gender "+gender);
	    System.out.println("Age "+age);
	    System.out.println("Mobile "+mobileNo);
	    System.out.println("CGPA "+cgpa);
	    sc.close();
	
	}

}
