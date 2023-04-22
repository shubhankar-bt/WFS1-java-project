import java.util.ArrayList;
public class LessonsClass {
    int id;
    String day,time,activity,date;
    int attended,booked;
    double price;
    double rating,rate;
    ArrayList<String> al=new ArrayList<>();
    void addRating(int r,String review){
        rate+=r;
        rating=rate/attended;
        rating=round(rating,1);
        al.add(review);
    }
    private double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
    public LessonsClass(int id, String day, String time, String activity, double price, String date) {
        this.id=id;
        this.day = day;
        this.time = time;
        this.activity = activity;
        this.price = price;
        this.date=date;
        booked=0;
        attended=0;
        rating=0.0;
        rate=0.0;
    }


    void display(int c){
        String leftAlignFormat = "| %-11s| %-11s| %-12s| %-12s| %-13s| %-13s| %-12s|%n";
        System.out.format(leftAlignFormat,c,day,date,time,activity,price,rating);
    }
    void report(){
        String leftAlignFormat = "| %-11s| %-12s| %-12s| %-13s| %-13s| %-12s| %-12s|%n";
        System.out.format(leftAlignFormat,day,date,time,activity,price,rating,attended);
    }


}
