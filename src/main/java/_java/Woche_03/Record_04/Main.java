package _java.Woche_03.Record_04;


public class Main {
    private static void proofThatRecordsAreNotEditable() {
        Teacher teacher01 = new Teacher("Walter", 52, "Meth");

        String name = teacher01.name();

        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student01 = Student.builder()
                .age(24)
                .name("Jesse")
                .classroom(01)
                .build();
        Student student02 = student01.withClassroom(02);

        Teacher teacher01 = new Teacher("Walter", 52, "Meth");
        Teacher teacher02 = teacher01.withSubject("Chemistry");

        Course meth = new Course(190, "Meth");

    }
}
