package Day_01;

public class Demo_12 {
    public static void main(String[] args) {
        int n=5;
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            // numbers
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            //numbers
            for (int l=i;l>=1;l--){
                System.out.print(l);
            }
            space-=2;
            System.out.println("");

        }





    }
}
