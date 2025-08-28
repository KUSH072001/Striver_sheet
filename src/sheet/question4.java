package sheet;

public class question4 {

  public int checkPrime(int num){
      if(num<=0){
          return 0;
      }
      else {
          for(int i=2;i<=Math.sqrt(num);i++){
              if(num%2==0){
                  return 0;
              }else {
                  return 1;
              }
          }
          return 1;
      }
  }

    public static void main(String[] args) {
      question4 q1=new question4();

      int result =q1.checkPrime(12);
      if(result==1){
          System.out.println("number is prime");
      }else {
          System.out.println("number is not prime");
      }

    }
}
