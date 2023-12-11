import java.util.Scanner;


public class activityDiagramCode {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Name?");
        String name = sc.nextLine();

        System.out.println("Password");
        String password = sc.nextLine();

        if (name.equalsIgnoreCase( "root") && password.equalsIgnoreCase("pass")) {
            System.out.println("Your card balance is 0");
        } else {
            System.out.println("Incorrect name or password");
        }


        // Second Exercise


        System.out.println("First Num? ");
        int firstNumber = sc.nextInt();

        if(firstNumber > 10) {
            System.out.println("The number is larger than 10");
        } else {
            System.out.println("The number is equal to or less than 10");
        }

        // PseudoCode d

        /*
           Print out choices : Menu program: 1. Print out temperature, 2. Wind
           Declare an integer (value) = the value is chosen by the user through the scanner.
           if value is 1
           print : "It is 9 C"

           if else value is 2
           print "Det är 9 second-meter wind"

           else print "Wrong"
         */




    }

}
