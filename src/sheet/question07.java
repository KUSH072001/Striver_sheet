package sheet;

import java.util.Scanner;

public class question07 {
//    Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
//    these 3 numbers.
//            (Hint : Average of N numbers is sum of those numbers divided by N)
//    int $ = 24;

    public float  test01(int a,int b, int c){
         return (float)(a+b+c)/3;
    }

//    Question 2: In a program, input the side of a square. You have to output the area of
//    the square.
//            (Hint : area of a square is (side x side))

    public  int AreaOfSquare(int side){
        return side*side;
    }

//
//    Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//    an eraser. You have to output the total cost of the items back to the user as their bill.
//            (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

    public double Bill(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount of pencil");
        float pencil=sc.nextFloat();
        System.out.println("enter amount of pen");
        float pen=sc.nextFloat();
        System.out.println("enter amount of eraser");
        float eraser=sc.nextFloat();
        float bill=eraser+pen+pencil;

        return bill+bill*0.18;
    }

    public static void main(String[] args) {
//        System.out.println(new question07().test01(41,50,60));
//        System.out.println(new question07().AreaOfSquare(12));
//

        byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;
         double result= (f*b)+(i%c)-(d*s);
        System.out.println(result);
//        System.out.println("your bill including 18% gst "+new question07().Bill());

    }
}
