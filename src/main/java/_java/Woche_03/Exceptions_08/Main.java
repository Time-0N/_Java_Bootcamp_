package _java.Woche_03.Exceptions_08;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .id("A01")
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        String id = "A01";

        try {
            studentService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Student saved: " + savedStudent);
    }
}