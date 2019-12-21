public class Number4{
public static void main(String[] args){
short a = 1;
byte b = 2;
int c = 5;
System.out.println(a>b);//1>2,false
System.out.println(b>c);//2>5,false
System.out.println(a!=b);//1!=2,true
long d = 10L;
System.out.println(a-b > c-d );//1-2 > 5-10,true
System.out.println(a>b && c<d);//false
System.out.println(a>b || c<d);//true
double  e = a>b? 2.5 : 3.5;
System.out.println(  e );//3.5
}
}