import java.util.*;
class tax{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the tax in lakhs");
int n=sc.nextInt();
if(n>1200000){
System.out.println("the person with income "+n+ "has to pay tax.");
}
else{

System.out.println("the person with income "+n+ " not have to pay tax.");
}
}
}
