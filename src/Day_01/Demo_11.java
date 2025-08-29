package Day_01;

public class Demo_11 {
    public static void main(String[] args) {


        for(int i=1;i<=5;i++){
            int start =1;
            for(int j=1;j<=i;j++){
                if(start%2==0){
                    System.out.print(0);
                }else {
                    System.out.print(1);
                }
                start=1-start;

        }
            System.out.println(" ");
            }

    }
}
