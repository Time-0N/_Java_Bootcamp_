package _java.Woche_03.Lists_05;


public class Student {
    private String surname;
    private String name;
    private int studentNumber;

    @Override
    public String toString() {
        return " { " +
                "Student: " +
                surname +
                " Name: " + name +
                " Student number: " + studentNumber +
                " } ";
    }

    public Student(String surname, String name, int studentNumber) {
        this.surname = surname;
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
