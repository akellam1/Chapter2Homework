import java.util.Scanner;
 public class Time {
     public static void main(String [] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter an integer for total seconds :");
         int s = sc.nextInt();

         int h = s / 3600;

         int m = s % 3600 /60;

         int s2 = s % 3600 % 60;

         System.out.println(h + " hours " + m + " minutes " + s2 + " seconds ");

    }

}
