package _java.Woche_03.Exceptions_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Student findStudentById(String id) throws Exception {
        Student byId = students.get(id);

        if (byId == null) {
            throw new Exception("Student ID not found");
        } else {
            return byId;
        }
    }
}
