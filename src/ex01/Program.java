package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] argc) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 2;
        if(x <= 0 || x == 1) {
            System.err.print("Illegal Argument");
            System.exit(-1);
        }
        else {
            for (; i*i <= x; ++i) {
                if (x%i != 0) {
                    continue;
                }
                System.out.println("false " + --i);
                System.exit(0);
            }
            System.out.println("true " + --i);

        }
    }
}
