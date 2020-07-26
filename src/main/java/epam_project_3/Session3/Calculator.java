package epam_project_3.Session3;
import java.lang.*;
import java.util.*;
 class Operation{
	public void addition(int n,int m)
	{
		System.out.println(n+m);
	}
	public void subtraction(int n,int m)
	{
		System.out.println(n-m);
	}
	public void multiplication(int n,int m)
	{
		System.out.println(n*m);
	}
	public void division(int n,int m)
	{
		System.out.println(n/m);
	}
	
}

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Operation o=new Operation();
		System.out.print("Enter First Number:");
		int no1=sc.nextInt();
		System.out.print("Enter Second Number:");
		int no2=sc.nextInt();
		System.out.println("Enter the operation:");
		char op=sc.next().charAt(0);
		switch(op)
		{
		case '+':o.addition(no1,no2);
		         break;
		case '-':o.subtraction(no1,no2);
                  break;
		case '*':o.multiplication(no1,no2);
                 break;
		case '/':o.division(no2,no2);
                 break;
        default:System.out.println("Enter correct Option...!!!");
		}
	}

}
