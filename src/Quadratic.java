import java.util.*;
//import java.util.Scanner;
 class Quadratic {
        public static void main (String[] args)
        {
            int a, b, c;
            double r1, r2, D;
            Scanner s = new Scanner(System.in);
            System.out.println("Given quadratic equation:ax^2 + bx + c");
            System.out.print("Enter a:");
            a = s.nextInt();
            System.out.print("Enter b:");
            b = s.nextInt();
            System.out.print("Enter c:");
            c = s.nextInt();
            D = b * b - 4 * a * c;
            if (D > 0) {
                System.out.println("Roots are real and unequal");
                r1 = (-b + Math.sqrt(D)) / (2 * a);
                r2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("First root is:" + r1);
                System.out.println("Second root is:" + r2);
            } else if (D == 0)
//                OOPS Using Java Lab (21SCSL37) Page 2
            {
                System.out.println("Roots are real and equal");
                r1 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("Root:" + r1);
            } else {
                System.out.println("Roots are imaginary");
            }
        }
    }

