import java.util.Scanner;
public class ArmstrongNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the range");
int a=s.nextInt();
int b=s.nextInt();
int g;
int sum=0;
for(int i=a;i<=b;i++)
{
	g=i;
	int n=String.valueOf(i).length();
	sum=0;
	while(g!=0)
	{
		sum=sum+(int)Math.pow(g%10, n);
		g=g/10;
	}
	if(i==sum)
	{
		System.out.println(i);
	}
	
}
	}

}
