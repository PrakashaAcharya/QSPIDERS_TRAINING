/*write a program to check the person is eligible to donate blood 
criteria:age should ge above 18 or equal and weight should be atleast 50.

import java.util.Scanner;
class sample3{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the age and weight");

int age=sc.nextInt();

int weight=sc.nextInt();
boolean result=(age>=18 && weight>=50 );
System.out.println(result);




}

}
*/
class sample3{
public static void main(String [] args){
int age=18;
double weight=50.0;
boolean result=(age>=18 && weight>=50);
System.out.println("eligible :"+result);
}
}