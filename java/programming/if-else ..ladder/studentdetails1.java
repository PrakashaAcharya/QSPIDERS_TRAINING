/* write a program to print the students marks card as instructed below
1.accept the student individual student marks from the users .
2.print the grade along with the subject marks
3.print the total marks scored by the student
4.print the aggregate scored by the students
*/
import java.util.*;

class studentdetails1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the marks in kannada");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int n4=sc.nextInt();
int n5=sc.nextInt();
int n6=sc.nextInt();



int total_marks=(n1+n2+n3+n4+n5+n6);
System.out.println( "total marks is "+total_marks);
double percentage=total_marks/6;

if(percentage>100){
System.out.println("invalid marks");
}
else if(percentage>=80 && percentage<=100){
System.out.println("grade is A+");
}


else if(percentage>=70 && percentage<=80){
System.out.println("grade is A");
}

 else if(percentage>=65 && percentage<=75){
System.out.println("grade is A");
}
 else if(percentage>=35 && percentage<=65){
System.out.println("grade is A");
}
else{System.out.println("result is outheld");
}
}
}
 

