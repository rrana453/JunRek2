package junpkg1;

public class Day3Assign1 
{
public Day3Assign1()
{
	this(12,13,34);
	System.out.println("Default Constructor ");
}
public Day3Assign1(int a)
{
	this();
	System.out.println("One parameterized Constructor ");
}
public Day3Assign1(int b, int c)
{
	this(2);
	System.out.println("Two parameterized Constructor ");
}
public Day3Assign1(int d,int e,int f)
{
	System.out.println("Three parameterized Constructor ");
}
public Day3Assign1(int g,int h,int i,int j)
{
	this(2,3);
	System.out.println("four parameterized Constructor ");
}

public static void main(String[] args) 
{
	Day3Assign1 abc =new Day3Assign1(2,3,4,5);
}
}