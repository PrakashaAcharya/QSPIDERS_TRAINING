class case7{
public static void main(String[] args){
char ch='a';
System.out.println(ch++);
System.out.println(ch);
System.out.println("==================");
// case number 6
int p=10;
int q=++p;
int r=q++ - ++p;
int s=p++ + ++q - ++r;
System.out.println(p);
System.out.println(q);
System.out.println(r);
System.out.println(++s);

}
}

