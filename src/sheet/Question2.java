package sheet;

public class Question2 {
    public float simpleInterst(int p,int r,int t){
        return (float) (p*r*t)/100;
    }

    public static void main(String[] args) {
        Question2 q1=new Question2();
        float si=q1.simpleInterst(1,662,3);
        System.out.println(si);

    }
}
