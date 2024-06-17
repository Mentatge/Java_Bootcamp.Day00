package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum_of_elements = 0;
        int count_of_coffe = 0;
        int flag = 0;
        while (true) {
            number = sc.nextInt();
            if (number == 42) {
                break;
            }
            while (number > 0) {
                sum_of_elements += number % 10;
                number /= 10;
            }
            for(int i = 2; i*i <= sum_of_elements; ++i) {

                if (sum_of_elements%i == 0) {
                    flag++;
                }
            }
            if (flag == 0) {
                count_of_coffe++;
            }
            flag=0;

        }
        System.out.println("Count of coffee-request - "+count_of_coffe);
    }
}
