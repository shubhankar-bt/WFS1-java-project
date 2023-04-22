import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ManagerClass manager=new ManagerClass();
        Scanner sc=new Scanner(System.in);
        manager.chooseCustomer();

        while (true) {
            System.out.println("**************************************************************");
            System.out.println("-------------- Welcome To WFC --------------");
            System.out.println("**************************************************************");
            System.out.println("You are currently logged in as:"+manager.selectedCustomer.customerName);
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Book a group fitness lesson");
            System.out.println("2. Change/Cancel a booking");
            System.out.println("3. Attend a lesson");
            System.out.println("4. Monthly lesson report");
            System.out.println("5. Monthly champion fitness type report");
            System.out.println("6. Change Login Account.");
            System.out.println("0. Exit");
            System.out.println("**************************************************************");
            System.out.print("Please Enter Your Choice: ");


            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.bookGroupFitnessLesson(null);
                    break;
                case 2:
                    manager.cancelOrChangeLesson();
                    break;
                case 3:
                    manager.attendLesson();
                    break;
                case 4:
                    manager.monthlyLessonReport();
                    break;
                case 5:
                    manager.championFitnessReport();
                    break;
                case 6:
                    manager.chooseCustomer();
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
