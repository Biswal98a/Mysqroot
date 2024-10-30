package mysqroot1;

import java.util.Scanner;

public class Mysqroot1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number Mysqroot of: ");
        
        String input = scanner.nextLine();
        System.out.println(sqrt(input));
        scanner.close();
    }
	private static String sqrt(String input) {
        try {
            double x = Double.parseDouble(input), z = 1;
            if (x < 0) {
                return input + " is an incorrect number (negative)";
            }
            for (int i = 0; i < 25 && Math.abs(z - (z -= (z * z - x) / (2 * z))) >= 0.001; i++);
            return String.format("Square root of %.4f is %.4f", x, z);
        } catch (Exception e) {
            return "Incorrect number format";
        }
    }


}
