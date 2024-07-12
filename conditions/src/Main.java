import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String num = "011010001011101010";
//        if (num.isEmpty()) System.out.println("Invalid number");
//        else if (num.matches("^[01]+$")) System.out.println(2);
//        else if(num.matches("^[0-7]+$")) System.out.println(8);
//        else if(num.matches("^[0-9A-Fa-f]+$")) System.out.println(16);
//        else if (num.matches("^[0-9]+$")) System.out.println(10);
//        else System.out.println("Invalid number");
//
//        int year = 2004;
//
//        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) System.out.println("Leap year");
//        else System.out.println("Not leap year");
//
//
//        int day = 4;
//
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednsday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not a day");
//        }

        Scanner scan = new Scanner(System.in);
//        String url = scan.nextLine();
//        String protocol = url.substring(0, url.indexOf(':'));
//        String extention = url.substring(url.lastIndexOf('.')+1, url.length());
//        System.out.println(protocol);
//        System.out.println(extention);


        while (true){

        String  op = scan.nextLine();

        switch (op){
            case "add":
                System.out.println(5+5);
                break;
            case "sub":
                System.out.println(5-5);
                break;
            case "mul":
                System.out.println(5*5);
                break;
            case "div":
                System.out.println(5/5);
                break;
            case "exit": // New case to exit the loop
                System.out.println("Exiting the program.");
                return;
            default:
                System.out.println("Invalid op");
        }
        }
    }
}