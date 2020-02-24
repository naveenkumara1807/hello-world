import java.util.Scanner;
class Control
{
public static void main(String args[])
{
int a=1,c=21,d,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter 0 or 1");
i=s.nextInt();
if(i==1)
{
System.out.println("Enter the value to the looping structure:");
d=s.nextInt();
switch(d){
case 1:
System.out.println("While loop");
while(a<4)
{
System.out.println("Value of a is:"+a);
a++;
}break;
case 2:
System.out.println("For loop");
for(int b=2;b<=4;b++)
{
System.out.println("Value of b is:"+b);
}break;
case 3:
System.out.println("Do...While loop");
do{
System.out.println("Value of c is:"+c);
c++;
}
while(c<20);
break;
default:System.out.println("Exit");
break;
}
}
else{
System.out.println("You are out of looping statements");
}
}
}

