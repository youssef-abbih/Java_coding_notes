import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = input.nextInt(); // read an int

        System.out.print("Enter a float: ");
        float f = input.nextFloat(); // read a float

        System.out.print("Enter a double: ");
        double d = input.nextDouble(); // read a double

        System.out.print("Enter a string: ");
        String s = input.next(); // read a string (single word)

        input.nextLine(); // consume the remaining newline character

        System.out.print("Enter a line of text: ");
        String line = input.nextLine(); // read a line

        System.out.print("Enter a byte: ");
        byte b = input.nextByte(); // read a byte

        System.out.print("Enter a short: ");
        short shrt = input.nextShort(); // read a short

        System.out.print("Enter a long: ");
        long l = input.nextLong(); // read a long

        System.out.print("Enter a boolean: ");
        boolean bl = input.nextBoolean(); // read a boolean

        System.out.print("Do you want to enter another integer (true/false)? ");
        boolean hasNextInt = input.hasNextInt(); // check if there is another int

        System.out.print("Do you want to enter another float (true/false)? ");
        boolean hasNextFloat = input.hasNextFloat(); // check if there is another float

        // Printing out the values
        System.out.println("You entered the following values:");
        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
        System.out.println("Line: " + line);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + shrt);
        System.out.println("Long: " + l);
        System.out.println("Boolean: " + bl);
        System.out.println("Is there another integer to read? " + hasNextInt);
        System.out.println("Is there another float to read? " + hasNextFloat);

        input.close();
    }
}

