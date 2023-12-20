package level1;

import java.util.Scanner;

class Triangle {
    public void triangle(int a, int b){
        for (int i = 0; i<b; i++) {
            for (int j = 0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        int a = sc.nextInt();
        int b = sc.nextInt();

        triangle.triangle(a,b);
    }
}