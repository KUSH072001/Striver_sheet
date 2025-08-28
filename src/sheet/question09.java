package sheet;

public class question09 {
    public static String checkNumber(int num){
       return  num%2==0?"number is even":"number is odd";
    }
    public static void getEven(int start,int end) {
        int count=0;
        if (start % 2 == 0){
            for(int i=start;i<=end;i+=2){
            System.out.println(i);
                count++;
            }
            System.out.println("Total number should be "+count);

        }else {
            System.out.println("start num should be positive");
        }
    }
    public static void checkNumberPrime(int num) {

        if (num <= 1) {
            System.out.println("not prime");
            return;
        }
        int count = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count > 0) {
            System.out.println("not prime");
        } else {
            System.out.println("num is prime");
        }


    }
    public static void main(String[] args) {

//        System.out.println(checkNumber(11));
//        checkNumber(11);
//        checkNumber(10);
//        checkNumber(9);

//    getEven(2,100);

    checkNumberPrime(7);


    }

}
