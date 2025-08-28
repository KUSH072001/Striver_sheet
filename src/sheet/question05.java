package sheet;

public class question05 {
    public int sumOfFirstNaturalNum(int num){
        int sum=0;
        for (int i=0;i<=num;i++){
             sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new question05().sumOfFirstNaturalNum(10));
    }
}
