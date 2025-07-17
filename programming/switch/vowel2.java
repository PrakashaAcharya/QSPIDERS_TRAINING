import java.util.*;
class vowel2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char ch=sc.next().charAt(0);

switch(ch){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u': System.out.println("lowercase vowel");
          break;
case 'A':
case 'E':
case 'I':
case 'O':
case 'U': System.out.println("UPPERCASE vowel");
          break;


default:System.out.println(" WORD IS CONSONANT");
}
}
}