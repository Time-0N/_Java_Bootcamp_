package _java.Woche_03.Maps_and_Sets_06;


import java.util.HashMap;
import java.util.Map;

public class School {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getStudentNumber(), student);
    }

    public void removeStudent(int selectedSlot) {
        students.remove(selectedSlot);
    }

    public void displayStudents() {
        for (Student student : students.values()) {
            String ausgabe = student.toString();
            System.out.println(ausgabe);
        }

    }

    public Student findByID(int id) {
        return students.get(id);
    }

}
