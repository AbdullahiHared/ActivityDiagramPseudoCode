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




    }

}
