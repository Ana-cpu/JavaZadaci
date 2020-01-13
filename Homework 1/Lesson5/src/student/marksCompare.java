package student;
import java.util.Comparator;


public class marksCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2)
    {
        return s2.marks - s1.marks;
    }

}
