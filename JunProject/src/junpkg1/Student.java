package junpkg1;

public class Student 
{
int age;
int rollno;
public void display1()
{
	System.out.println("Welcome to all");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
public static void main(String[] args) 
{
	Student s=new Student();
	s.age=14;
	System.out.println( "Age : " + s.age);
	s.rollno=23;
	System.out.println( "Roll No : " + s.rollno);
	s.display1();
	s.display2();
}

}
