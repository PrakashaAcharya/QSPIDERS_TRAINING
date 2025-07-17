/* write a program to print the number range */


import java.util.*;
class loop1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the start and end of the range");
int n1=sc.nextInt();
int n2=sc.nextInt();
/*----------------------------------------------for---------------------------------------------------------------
n1=n1+1;
for(int i=n1;i<n2;i++){
System.out.print(i+" ");
}
  
-------------------------------------------------------while loop------------------------------------------------------
int i=n1;
while(i<=n2){
System.out.println(i);
i++;
}
-----------------------------------------------------------dowhile----------------------------------------------------------
*/

int i=n1;
do{
System.out.println(i);
i++;
}
while(i<=n2);
}
}

