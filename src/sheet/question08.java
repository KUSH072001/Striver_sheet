package sheet;

import java.util.Scanner;

public class question08 {
//    1 : Write a Java program to get a number from the user and print whether it is
//    positive or negative.

    public static int  getNumber(int num){

        return num;
    }
    public static  String checkTemp(float temp){
        if(temp>100){
            return "you have fever";
        }else {
            return "you don't have fever";
        }
    }

    public static void checkDayOfWeek(int num){
        switch (num){
            case 1: System.out.println("monday");
            break;
            case 2: System.out.println("tuesday");
            break;
            case 3: System.out.println("wednesday");
            break;
            case 4: System.out.println("thirsday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default:
                System.out.println("invalid data");
                break;

        }
    }
    public  static void checkLeapYear(int year){
        if(year%4==0 && year %400!=0 || year%100==0){
            System.out.println("the year is leap year");
        }else {
            System.out.println("year is not leap");
        }
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);// this is a object of scanner class and i will  pass the ref to the function call
//        System.out.println("enter a number");
//      int number=  getNumber( sc.nextInt());
//        if(number>0){
//            System.out.println("number is positive");
//        }else {
//            System.out.println("the number is -ve number");
//        }

//      String status=  checkTemp(103.5f);
//        System.out.println(status);
//
//        checkDayOfWeek(7);
//        int a = 63, b = 36;
//        boolean x = (a < b ) ? true : false;
//        int y= (a > b ) ? a : b;
//        System.out.println(x);
//        System.out.println(y);

        checkLeapYear(1940);
    }
}
