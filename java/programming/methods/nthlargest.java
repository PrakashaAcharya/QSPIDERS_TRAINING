import java.util.*;
class nthlargest{
public static void main(String[] args){
Scanner sc =new Scanner (System.in);
System.out.println("enter the num");
int num=sc.nextInt();
System.out.println("enter the nT value");
int nth=sc.nextInt();
int slno=0;
int nthlarge=9;

while(true)
{
   int large=0;
   int temp=num;

   while(temp>0)
   {
     int ld=temp%10;
     if(ld>large&&ld<nthlarge)
       large=ld;
     temp=temp/10;
    }
  nthlarge=large;
   slno++;

    if(slno==nth)
      break;
}
System.out.println(nthlarge);
}
}
