package junpkg1;

public class Day2Assign2 
{
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Div of the number : " +c);
		return c;
	}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("Sub of the number : " +c1);
		return c1;
	}
	public int sum(int a2,int b2)
	{
		int c2;
		c2=a2+b2;
		System.out.println("Sum of the number : " +c2);
		return c2;
	}
	public void mul(int a4,int b4)
	{
		int c4;
		c4=a4*b4;
		System.out.println("Final Result is : " +c4);
	}
public static void main(String[] args) 
{
	Day2Assign2 obj1=new Day2Assign2();
	int divResult=obj1.div(10, 2);
	int subResult1=obj1.sub(divResult,2);
	int subResult2=obj1.sub(subResult1,2);
	int sumResult=obj1.sum(subResult2,2);
	obj1.mul(sumResult,2);
}
}
