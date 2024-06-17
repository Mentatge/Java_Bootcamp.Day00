package ex00;
public class Program {
    public static void main (String[] argc) {
        int a = 479598;
        int result=0;
        int i = 1;
        while(a > 0){
            result = result + a%10;
            a /= 10;
        }
        System.out.println(result);
    }
}