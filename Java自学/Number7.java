public class Number7{
    public static void main(String[] args){
        int x= 20;
        int y ;
        if (x<1){
            y = 2*x+10;
        }// x<1时，y= 2x+10
        else if (x>=1 && x<10){
            y = 2*x;
        }//1<=x<10时，y=2x
        else if (x>=10 && x<20){
            y = 2*x-10;
        }// 10<=x<20时，y=2x-10
        else { y = 2*x +20;
         }
        System.out.println(y);//60
    }
}