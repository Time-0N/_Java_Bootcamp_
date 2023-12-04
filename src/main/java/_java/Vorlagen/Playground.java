package _java.Vorlagen;

import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = x - x % 3;
            System.out.println(y);
        }
    }
}
