package junpkg1;
public class Day3Assign2 
{
	   public void M()
	    {
		System.out.println("default method");
	    }
	   public void M1(int a)
	   {
		System.out.println("one para method");
	   }
	   public void M2(int a,int b)
	   {
		System.out.println("two para method");
	   }
	   public void M3(int a,int b, int c)
	   {
		System.out.println("three para method");
	   }
	   public void M4(int a,int b, int c,int d)
	   {
		   this.M3(1, 2, 3);
		   this.M();
		   this.M2(2,4);
		System.out.println("Four para method");
	   }
	public static void main(String[] args) 
	  {
		Day3Assign2 rekha = new Day3Assign2();
		rekha.M4(12,13,5,6);
	  }

	}
