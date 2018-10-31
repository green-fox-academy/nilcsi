import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=1;
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=count;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=count*2-1;k++)
            {
                System.out.print("* ");
            }
            if(i<n)
                count++;
            else
                count--;
            System.out.println("");
        }
    }
}