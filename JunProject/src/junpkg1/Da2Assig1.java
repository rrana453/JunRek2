package junpkg1;

public class Da2Assig1 
{
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("Sum of the number : " +c);
	return c;
}
public int sub(int a1,int b1)
{
	int c1;
	c1=a1-b1;
	System.out.println("Sub of the number : " +c1);
	return c1;
}
public int mul(int a2,int b2)
{
	int c2;
	c2=a2*b2;
	System.out.println("Mul of the number : " +c2);
	return c2;
}
public void div(int a4,int b4)
{
	int c4;
	c4=a4/b4;
	System.out.println("Final Result is : " +c4);
}
public static void main(String[] args)
{
	Da2Assig1 obj=new Da2Assig1();
	int sumResult1=obj.sum(10,2);
	int sumResult2=obj.sum(sumResult1, 2);
	int subResult1=obj.sub(sumResult2,2);
	int mulResult=obj.mul(subResult1,2);
	obj.div(mulResult,2);	
}
}