package _java.Woche_03.Exceptions_08;

import java.util.List;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        return repo.save(newStudent);
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student getById(String id) throws Exception {
        return repo.findStudentById(id);
    }
}
