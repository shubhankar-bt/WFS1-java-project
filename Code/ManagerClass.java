import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class ManagerClass {
    void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    CustomerClass selectedCustomer;
    ArrayList<CustomerClass> customers;
    List lessons;
    ArrayList<LessonsClass> filteredList;
    BufferedReader br;
    Scanner sc;
    ManagerClass(){
        br=new BufferedReader(new InputStreamReader(System.in));
        sc=new Scanner(System.in);
        lessons=new List();
        customers=new ArrayList<>();
        customers.add(new CustomerClass("Mendi"));
        customers.add(new CustomerClass("Aandi"));
        customers.add(new CustomerClass("Busku"));
        customers.add(new CustomerClass("Sankhai"));
        customers.add(new CustomerClass("Upmoon"));
        customers.add(new CustomerClass("Dudeme"));
        customers.add(new CustomerClass("Furkey"));

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"03/04/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"03/04/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"03/05/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"03/05/2023");

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"03/11/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"03/11/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"03/12/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"03/12/2023");

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"03/18/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"03/18/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"03/19/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"03/19/2023");

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"03/25/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"03/25/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"03/26/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"03/26/2023");


        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"04/01/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"04/01/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"04/02/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"04/02/2023");

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"04/08/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"04/08/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"04/09/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"04/09/2023");

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"04/15/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"04/15/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"04/16/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"04/16/2023");

        lessons.addLesson("Saturday","7.00 AM","Swimming",55.00,"04/22/2023");
        lessons.addLesson("Saturday","6.00 PM","Box Fit",65.00,"04/22/2023");
        lessons.addLesson("Sunday","7.00 AM","Boxing",85.00,"04/23/2023");
        lessons.addLesson("Sunday","6.00 PM","Yoga",50.00,"04/23/2023");
    }
    void chooseCustomer(){
        clear();
        System.out.println("**************************************************************");
        System.out.println("******************** Choose CustomerClass ********************");
        System.out.println("**************************************************************");
        System.out.format("+------+------------+%n");
        System.out.format("|  No. |    Name    |%n");
        System.out.format("+------+------------+%n");
        for(CustomerClass l:customers){
            l.show();
        }
        System.out.format("+------+------------+%n");
        System.out.print("Enter Your Choice:");
        int choice=Integer.parseInt(sc.nextLine());
        clear();
        selectedCustomer=customers.get(choice-1);
    }

    void bookGroupFitnessLesson(BookClass book){
        clear();
        System.out.println("*************************************************************");
        System.out.println("******************** Time Table Filter BY ********************");
        System.out.println("*************************************************************");
        System.out.println("Day Filters");
        System.out.println("=============================================================");
        System.out.println("1. Saturday");
        System.out.println("2. Sunday");
        System.out.println("*************************************************************");
        System.out.println("Activity Filters");
        System.out.println("*************************************************************");
        System.out.println("3. Swimming");
        System.out.println("4. Box Fit");
        System.out.println("5. Boxing");
        System.out.println("6. Yoga");
        System.out.println("*************************************************************");
        System.out.println("-1. Main Menu");
        System.out.print("Enter Your Choice:");
        int choice=Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                filteredList=lessons.getLessonByDay("Saturday");
                break;
            case 2:
                filteredList=lessons.getLessonByDay("Sunday");
                break;
            case 3:
                filteredList=lessons.getLessonByActivity("Swimming");
                break;
            case 4:
                filteredList=lessons.getLessonByActivity("Box Fit");
                break;
            case 5:
                filteredList=lessons.getLessonByActivity("Boxing");
                break;
            case 6:
                filteredList=lessons.getLessonByActivity("Yoga");
                break;
            default:
                clear();
                return;
        }
        clear();

        System.out.println("****************************************************************************************************");
        System.out.println("***************************************** Time Table ***********************************************");
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        System.out.format("|  LessonsClass ID |     Day    |     Date    |     Time    |    Activity  |     Price    |    Rating   |%n");
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        for(LessonsClass l:filteredList){
            l.display(l.id);
        }
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        System.out.print("Enter LessonsClass ID (Type 0 for go to Main Menu):");
        choice=Integer.parseInt(sc.nextLine());
        if(choice==-0) {
            clear();
            return;
        }
        LessonsClass l=lessons.getLessonByID(choice);
        if(book==null){
            book=new BookClass();
        }
        System.out.println("*************************************************************");
        if(l.booked>=5){
            System.out.println("Already 5 CustomerClass have booked this lesson.");
        }else if(selectedCustomer.getBookingByID(l.id)!=null){
            System.out.println("Selected CustomerClass have Already booked this lesson.");
        }else {
            if(book.lessonIdno==-1){
                selectedCustomer.book.add(book);
                l.booked++;
                System.out.println("BookClass Successful for "+selectedCustomer.customerName);
            }else {
                System.out.println("BookClass Update Successfully for "+selectedCustomer.customerName);
            }
            book.lessonIdno=l.id;
        }
        System.out.println("*************************************************************");
        promptEnterKey();
        clear();
    }

        public void promptEnterKey(){
            System.out.println("Press \"ENTER\" to continue...");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    void cancelOrChangeLesson(){
        clear();
        if(selectedCustomer.book.size()==0){
            System.out.println("No Bookings Available.");
            promptEnterKey();
            clear();
            return;
        }
        System.out.println("****************************************************************************************************");
        System.out.println("************************************** List of Booked Lessons **************************************");
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        System.out.format("| BookClass ID |     Day    |     Date    |     Time    |    Activity  |     Price    |    Rating   |%n");
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        for(BookClass book:selectedCustomer.book){
            lessons.getLessonByID(book.lessonIdno).display(book.id);
        }
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        System.out.print("Enter BookClass ID (For Cancel Or Change) ( Type 0 for Go to Main Menu ) :");
        int bookingId=Integer.parseInt(sc.nextLine());
        if(bookingId==0){
            clear();
            return;
        }
        System.out.println("1. Cancel");
        System.out.println("2. Change");
        System.out.println("*****************************************************");
        System.out.print("Enter Your Choice (Type 0 for go to Main Menu):");
        int choice=Integer.parseInt(sc.nextLine());
        if(choice==-0){
            clear();
            return;
        }
        BookClass selectedBook=selectedCustomer.getBookId(bookingId);
        LessonsClass l=lessons.getLessonByID(selectedBook.lessonIdno);
        switch (choice){
            case 1:
                selectedCustomer.book.remove(selectedBook);
                l.booked--;
                clear();
                System.out.println("BookClass Cancel Successfully");
                promptEnterKey();
                clear();
                break;
            case 2:
                bookGroupFitnessLesson(selectedBook);
                break;
            default:
                System.out.println("Invalid Input");
                promptEnterKey();
        }
    }
    void attendLesson(){
        clear();
        if(selectedCustomer.book.size()==0){
            System.out.println("No Bookings Available.");
            promptEnterKey();
            clear();
            return;
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------- List of Booked Lessons -------------------------------------");
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        System.out.format("| BookClass ID |     Day    |     Date    |     Time    |    Activity  |     Price    |    Rating   |%n");
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        for(BookClass book:selectedCustomer.book){
            lessons.getLessonByID(book.lessonIdno).display(book.id);
        }
        System.out.format("+------------+------------+-------------+-------------+--------------+--------------+-------------+%n");
        System.out.print("Enter BookClass ID (For Cancel Or Change) (Type 0 for Go to Main Menu):");
        int bookingId=Integer.parseInt(sc.nextLine());
        if(bookingId==0){
            clear();
            return;
        }
        BookClass selectedBook=selectedCustomer.getBookId(bookingId);
        LessonsClass l=lessons.getLessonByID(selectedBook.lessonIdno);
        try {
            clear();
            System.out.println("Attending LessonsClass Please Wait...........");
            TimeUnit.SECONDS.sleep(5);
            clear();
        }catch (Exception e){

        }
        System.out.println("Thanks for Attend This lesson");
        System.out.println("********************************************");
        System.out.println("Give us Rating (1-5):");
        int rating=Integer.parseInt(sc.nextLine());
        System.out.println("Write some Review about our LessonsClass:");
        sc.nextLine();
        String review=sc.nextLine();
        System.out.println("********************************************");
        System.out.println("Have A Nice Day");
        System.out.println("********************************************");
        l.booked--;
        l.attended++;
        l.addRating(rating,review);
        selectedCustomer.book.remove(selectedBook);
        promptEnterKey();
        clear();
    }
    void championFitnessReport(){
        clear();
        String[] activities={"Swimming","Box Fit","Boxing","Yoga"};
        System.out.println("Enter month (3,4)(Type 0 for Go To Main Menu):");
        String month=sc.nextLine();
        if(Integer.parseInt(month)==0){
            clear();
            return;
        }
        clear();
        System.out.println("-------------------------------------------------------------");
        System.out.println("------- Champion Fitness Type Report for Month "+month+" ------------");
        System.out.println("-------------------------------------------------------------");
        month="0"+month;
        System.out.format("+-----------+----------------+%n");
        System.out.format("|  Activity | Total CustomerClass |%n");
        System.out.format("+-----------+----------------+%n");
        for(int i=0;i<activities.length;i++){
            double total=0;
            ArrayList<LessonsClass> ll=lessons.getLessonByActivity(activities[i]);
            for(LessonsClass l:ll){
                if(l.date.substring(0,2).equals(month)){
                    total+=l.price*l.attended;
                }
            }
            String leftAlignFormat = "|%-11s|%-16s|%n";
            System.out.format(leftAlignFormat,activities[i],total);
        }
        System.out.format("+-----------+----------------+%n");
        System.out.println("**********************************************************");
        promptEnterKey();
        clear();
    }
    void monthlyLessonReport()  {
        clear();
        System.out.println("Enter month (3,4) (Type 0 for go to Main Menu):");
        String month= sc.nextLine();
        if(Integer.parseInt(month)== 0){
            clear();
            return;
        }
        clear();
        System.out.println("************************************************************************************************************");
        System.out.println("********************************** Monthly Report for Month Number "+month+"***********************************");
        System.out.println("*************************************************************************************************************");
        month="0"+month;
        System.out.format("+------------+-------------+-------------+--------------+--------------+-------------+------------+%n");
        System.out.format("|     Day    |     Date    |     Time    |    Activity  |     Price    |    Rating   |  Attended  |%n");
        System.out.format("+------------+-------------+-------------+--------------+--------------+-------------+------------+%n");
        for(LessonsClass l: lessons.getLesson()){
            if(l.date.substring(0,2).equals(month)){
                l.report();
            }
        }
        System.out.format("+------------+-------------+-------------+--------------+--------------+-------------+------------+%n");
        promptEnterKey();
        clear();
    }
}
