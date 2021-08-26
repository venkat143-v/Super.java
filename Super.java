package Oops;

class Add2 // parent class
{
	int x =14, y= 5;
	void add()
	{
		System.out.println("Add is "+(x+y));
	}
}

class Sub2 extends Add2 // child class
{
	void sub()
	{
		super.add();
		System.out.println("sub is "+(super.x-super.y));
	}
}

public class Super// main class
{
	public static void main(String[] args) {
		Sub2 obj = new Sub2();
		obj.sub();
	}

}