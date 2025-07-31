import java.util.*;
class stream{
public static void main(String[] args){
Scanner sc=new Scanner(System.in); 
System.out.println("enter the stream");
String name=sc.next();
switch(name){
case "cse" : System.out.println("computer science and engineering");
           break;
case "ece" : System.out.println("electronics and communication engineering");
           break;
case "eee" : System.out.println("electrical and electronics engineering");
           break;
case "mech" : System.out.println("mechanical and engineering");
           break;
case "civ" : System.out.println("civil and engineering");
           break;
default : System.out.println("invalid stream");
}
}
}