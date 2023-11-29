package _java.Woche_03.Lists_05;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int selectedSlot) {
        students.remove(selectedSlot);
    }

    public void displayStudents() {
        for (Student student : students) {
            String ausgabe = student.toString();
            System.out.println(ausgabe);
        }

    }

    public Student findByID(int id) {
        for (Student s : students) {
            if (s.getStudentNumber() == id) {
                return s;
            }
        }
        return null;
    }

}
