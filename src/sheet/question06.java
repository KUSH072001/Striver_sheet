package sheet;

public class question06 {
    public double areaOfCircle(int radius){
        return 2*3.14*radius*radius;
    }
    public  int gratestOfTwoNumber(int a,int b){
        if(a>b){
            return  a;
        }else {
            return b;
        }

    }
    public void EvenNumber(int number){
        for(int i=9;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
//        System.out.println(new question06().areaOfCircle(2));
//        System.out.println("grater number is "+new question06().gratestOfTwoNumber(12,2));
//        question06 q1=new question06();
//        q1.EvenNumber(100);
//        new question06().EvenNumber(18);

        long a=10;
        int b=(int) a;
        System.out.println(a);
        System.out.println(b);
    }
}
