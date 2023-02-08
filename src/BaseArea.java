import java.util.Scanner;
public class BaseArea {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double radius, length, baseArea, volume, PI;
        PI = 3.1416;
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = sc.nextDouble();
        length = sc.nextDouble();


        baseArea = PI * radius * radius;
        volume = baseArea * length;
        System.out.println("The base area is: " +baseArea);
        System.out.println("The volume is: " +volume);



    }
}
