package student;
import java.util.*;
import java.io.*;

public class SortTextFile {

    public static void main(String[] args)throws IOException
    {
        //Creating BufferedReader object to read the input text file
         
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ana.acanski\\input.txt"));
         
        //Creating ArrayList to hold Student objects
         
        ArrayList<Student> studentRecords = new ArrayList<Student>();
         
        //Reading Student records one by one
         
        String currentLine = reader.readLine();
         
        while (currentLine != null)
        {
            String[] studentDetail = currentLine.split(" ");
             
            String name = studentDetail[0];
             
            int marks = Integer.valueOf(studentDetail[1]);
         
            //Creating Student object for every student record and adding it to ArrayList
             
            studentRecords.add(new Student(name, marks));
             
            currentLine = reader.readLine();
        }
         
        //Sorting ArrayList studentRecords based on marks
         
        Collections.sort(studentRecords, new marksCompare());
         
        //Creating BufferedWriter object to write into output text file
         
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ana.acanski\\output.txt"));
         
        //Writing every studentRecords into output text file
         
        for (Student student : studentRecords) 
        {
            writer.write(student.name);
             
            writer.write(" "+student.marks);
             
            writer.newLine();
        }
         
        //Closing the resources
         
        reader.close();
         
        writer.close();
    }
}
