  /* write a program to print reverse nummber range */


import java.util.*;
class loop7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the start and end of the range");
int n1=sc.nextInt();
int n2=sc.nextInt();
/*----------------------------------------------for---------------------------------------------------------------

for(int i=n2;i>=n1;i--){
System.out.print(i+" ");
}
  
-------------------------------------------------------while loop------------------------------------------------------
int i=n2;
while(i>=n1){
System.out.println(i);
i--;
}
-----------------------------------------------------------dowhile----------------------------------------------------------
*/

int i=n2;
do{
System.out.println(i);
i--;
}
while(i>=n1);
}
}

