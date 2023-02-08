import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Length of the room:");
        int l = in.nextInt();
        System.out.println("Width of the room: ");
        int w = in.nextInt();
        System.out.println("Height of the room:m");
        int h = in.nextInt();


        System.out.println("Number of windows:");
        int numWindows = in.nextInt();
        System.out.println("Number of doors: ");
        int numDoors = in.nextInt();


        double totalArea = (l * h + w * h) * 2 + l * w - numWindows * 15 - numDoors * 21;
        System.out.println("Area: " + totalArea);
        double quarts = 4.0 * totalArea / 350.0;

        System.out.println(quarts + " quarts needed ");


        int gallons = 0;
        while (quarts >= 4) {
            gallons++;
            quarts -= 4;
        }

        System.out.println(gallons + "gallons and" + "quarts of paint is needed");

        in.close();

    }


}


