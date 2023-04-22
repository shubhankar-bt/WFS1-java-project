import java.util.Objects;
public class BookClass {
    int id;
    static int number=1;
    int lessonIdno;
    BookClass(){
        lessonIdno=-1;
        id=number;
        number++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookClass book = (BookClass) o;
        return id == book.id && lessonIdno == book.lessonIdno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lessonIdno);
    }
}
