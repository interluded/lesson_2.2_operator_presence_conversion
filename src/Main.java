// (a + b + c)/2.

/*
A={\sqrt  {s(s-a)(s-b)(s-c)}}.
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Triangle Area Calc");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the side 1 double ");
        double A= scan.nextDouble();
        System.out.print("Enter the side 2 double ");
        double B = scan.nextDouble();
        System.out.print("Enter the side 3 double ");
        double C = scan.nextDouble();
        double S = ((A + B + C) / 2);
        double answer_before_sqrt = (S * (S-A) * (S-B) * (S-C));
        double answer = Math.sqrt(answer_before_sqrt);
        System.out.println(answer);


    }
}