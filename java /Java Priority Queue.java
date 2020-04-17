import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPA(){
        return cgpa;
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue <Student> pq= new PriorityQueue (
            Comparator.comparing(Student :: getCGPA).reversed().thenComparing(Student :: getName).thenComparing(Student :: getId)
        );

        List<Student> list = new ArrayList<Student>();
        for(String e : events){
            Scanner sc = new Scanner(e);
            String input = sc.next();
            if(input.equals("ENTER")){
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();

                Student s = new Student(id,name,cgpa);
                pq.add(s);
            }
            else if(input.equals("SERVED")){
                Student first = pq.poll();
            }
        }
        Student first = pq.poll();
        if(first == null){
            return list;
        }else{
            while(first != null){
                list.add(first);
                first = pq.poll();
            }
            return list;
        }
    }

}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}