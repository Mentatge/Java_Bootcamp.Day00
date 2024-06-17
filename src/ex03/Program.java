package ex03;

import java.util.Scanner;

public class Program {
    static public void main(String[] argc) {
        int real_week = 0;
        long contains = 0;
        Scanner input_string = new Scanner(System.in);
        for(int i = 1; i < 19; ++i) {
            String str = input_string.nextLine();
            if (str.equals("42")) {
                break;
            }
            if (!str.equals("Week " + i)) {
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
            contains = update_container(contains, min(input_string), i);
        }
        print_graf(contains);
    }
    public static long update_container(long contains, long min, long pos) {
        return (long) (contains + min * Math.pow(10, pos-1));
    }
    static public long min(Scanner scanner) {
        long min = 10;
        for (int i = 0; i < 5; ++i) {
            long min_scan = scanner.nextLong();
            if (min_scan < min) {
                min = min_scan;
            }
        }
        scanner.nextLine();
        return min;
    }
    public static void print_graf(long contains) {
        int week = 0;
        while (contains > 0) {
            System.out.println("Week " + ++week);
            for (int i = 0; i < contains % 10; ++i) {
                System.out.print("=");
            }
            System.out.println(">");
            contains /= 10;
        }
    }
}
