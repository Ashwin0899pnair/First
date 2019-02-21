package VVCE;
class X
{
	public void methodX()
	{
		System.out.println("Class X Method");
	}
}
class A extends X
{
	 public void methodA()
	 {
		 System.out.println("Derived Class A from Base Class X method");
	 }
}

class B extends  A
{
	public void methodB()
	{
		System.out.println("Derived Class B from Derived A method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.methodX();
		obj.methodA();
		obj.methodB();

	}

}
