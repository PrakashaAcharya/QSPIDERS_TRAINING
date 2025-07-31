import java.util.*;
class season{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE MONTH");
String month=sc.next();
switch(month){
case "march":
case "april":
case "may":
case "june": System.out.println("season is summer");
           break;

case "july":
case "august":
case "september":
case "october": System.out.println("season is rainy");
           break;

case "november":
case "december":
case "january":
case "february": System.out.println("season is winter");
           break;

default: System.out.println("invalid month");
}
}
}