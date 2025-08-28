package sheet;

public class question10 {

    public static void reverseString(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
        System.out.println(num);
    }

    public static void checkPrime(int num){
        int temp=0;
        if (num == 1 ) {
            System.out.println("number f is not prime");
        }else {
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    temp=0;
                }else {
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.println("number is not prime");
            }else {

                System.out.println("num is  prime");
            }
        }
    }
    public static void invertedStar(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = num - i + 1; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void starPyramid(int num){
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//reverseString(1234);
//checkPrime(12);
//    invertedStar(5);
    starPyramid(5);


    }
}
