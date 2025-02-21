import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        temp = input.nextInt();
        switch (temp / 5) {
            case 0:
                System.out.println("Ski");
                break;
            case 1:
            case 2:
                System.out.println("Cinema");
                break;
            case 3:
            case 4:
                System.out.println("Picnic");
                break;
            default:
                System.out.println("Swim");
                break;

        }



    }
}
