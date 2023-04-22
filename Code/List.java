import java.util.ArrayList;
public class List {
    static int id=1;
    ArrayList<LessonsClass> lessons;
    List(){
        lessons=new ArrayList<>();
    }
    void addLesson(String day, String time, String activity, double price, String date){
        LessonsClass l=new LessonsClass(id,day,time,activity,price,date);
        id++;
        lessons.add(l);
    }




    ArrayList<LessonsClass> getLessonByDay(String day){
        ArrayList<LessonsClass> lList=new ArrayList<>();
        for(LessonsClass l:lessons){
            if(l.day.equals(day))
                lList.add(l);
        }
        return lList;
    }
    ArrayList<LessonsClass> getLessonByActivity(String activity){
        ArrayList<LessonsClass> lList=new ArrayList<>();
        for(LessonsClass l:lessons){
            if(l.activity.equals(activity))
                lList.add(l);
        }
        return lList;
    }
    ArrayList<LessonsClass> getLesson(){
        return lessons;
    }
    LessonsClass getLessonByID(int id){
        for(LessonsClass l:lessons){
            if(l.id==id)
                return l;
        }
        return null;
    }

}
