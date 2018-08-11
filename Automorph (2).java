import java .io.*;
class Automorph
{
public static void main (String args[] )throws IOException
{
int n,s,chk;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a number");
n=Integer.parseInt(br.readLine());
s=n*n;
while(n>0)
{
if(n%10==s%10)
{
n=n/10;
s=s/10;
chk=1;
continue;
}
else
{
chk=0;
break;
}
}
if(chk==1)
System.out.println("Automorph number");
else
System.out.println("not a automorph");
}
}
