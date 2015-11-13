
package project;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {


        System.out.println("В ведите два числа");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        Scanner s1 = new Scanner(System.in);
        int y = s1.nextInt();


        System.out.println("Ведите число 1=+, 2=/, 3=*, 4=-");

        Scanner s2 = new Scanner(System.in);
        int z = s2.nextInt();




        switch (z){
        case 1 :

            System.out.println("x+y="+(x + y));
            break;
        }
        switch (z){
            case 2:

                System.out.println("x/y="+(x / y));
                System.out.println("и остаток=" + (x%y ) );
                break;
        }switch (z){
            case 3:

                System.out.println("x*y="+(x * y));
                break;
        }switch (z){
            case 4:

                System.out.println("x-y="+(x - y));
                break;
        }
    }

}

