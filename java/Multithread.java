import java.util.Scanner;
class Arms extends Thread implements runnable
{
	
	
		int n,a,b,c;
		public void run()
		{
		for(a=1;a<=1000;a++)
		{
			c=a;
			a=1;
			while(c>0)
			{
				b=c%10;
				a=a+(b*b*b);
				c=c/10;
			}
			if(a==c)
			{
				System.out.println(a+" is a armstrong number");
			}
		}
}}
class Prime extends Thread
{
	int d,e,f=5,count;
	public void run()
	{ 
		for(d=1;d<f;d++)
		{
			count=0;
			for(e=1;e<f;e++)
			{
				if(d%e==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(d+" is a prime number");
			}
		}
	}
}
class Fibanoc extends Thread
{ 
	int a=1,b=1,s=0;
	public void run()
	{
		while(s<5)
		{
			s=a+b;
			a=b;
			b=s;
			System.out.println(s);
		}
	}
}
class Multithread
{
	public static void main(String args[])
	{
		Arms t1=new Arms();
		Prime t2=new Prime();
		Fibanoc t3=new Fibanoc();
		t1.start();
		t2.start();
		t3.start();
	}
}

			
  

		