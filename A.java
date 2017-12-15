import java.util.Scanner;
class A
{
public static void main(String arg[])
{
int count,t=5;
Scanner scn = new Scanner(System.in);
System.out.println("enter the n value");
int n = scn.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
	{
if(i+j==n-1)
{
	System.out.print("*");
System.out.print(t);
t--;
}
else
{
System.out.print(" ");
}
}

	System.out.println();
}
}
}