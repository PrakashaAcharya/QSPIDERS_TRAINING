class one{
static int a=10;
public static void method1(){

System.out.println("in method 1");
}}


class two{
static int b=20;
public static void method2()
{
System.out.println("in method 2");
}}

class three{
static int c=30;
public static void method3(){
System.out.println("in method 3");
}
}

class Main{
public static void main(String[] args){

System.out.println("in main");
one.method1();
System.out.println(one.a);
two.method2();
two.b=30;
System.out.println(two.b);
}}