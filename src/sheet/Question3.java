package sheet;

public class Question3 {
    public void maxOfThree(int a,int b, int c){
        if(a>0 && b>0 && c>0){
            if(a>b && a>c){
                System.out.println("a is grater "+ a);
            } else if (b > a && b>c) {
                System.out.println("b is grater "+ b);
            } else if(c > a && c>b)  {
                System.out.println("c is grater "+ c);
            }else {
                System.out.println("two number are same ");
            }
        }else {
            System.out.println("check number should be greater than 0");
        }

    }

    public static void main(String[] args) {
        Question3 q2=new Question3();
        q2.maxOfThree(21,21,3);
    }
}
