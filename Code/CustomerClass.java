import java.util.LinkedList;
public class CustomerClass {
    String id;
    String customerName;
    LinkedList<BookClass> book;
    static int no=1;
    CustomerClass(String name){
        book=new LinkedList<>();
        this.customerName=name;
        id=no+"";
        no++;
    }
    BookClass getBookingByID(int id){
        for(BookClass book:book){
            if(book.lessonIdno==id)
                return book;
        }
        return null;
    }
    BookClass getBookId(int id){
        for(BookClass book:book){
            if(book.id==id)
                return book;
        }
        return null;
    }
    void show(){
        String leftAlignFormat = "|%-6s|%-12s|%n";

        System.out.format(leftAlignFormat,id,customerName);
    }
}
