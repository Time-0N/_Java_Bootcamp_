package _java.Woche_03.Lists_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        int x = 0;


        while (true) {
            if (x == 1) {
                break;
            }
            System.out.println("");
            System.out.println("1: Add student");
            System.out.println("2: Remove student");
            System.out.println("3: Show students");
            System.out.println("4: Exit Programm");
            System.out.println("5: Search for a Student");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("");
                    System.out.println("Enter surname");
                    String surname = sc.next();
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter student number");
                    System.out.println("");
                    int studentNumber = sc.nextInt();

                    school.addStudent(new Student(surname, name, studentNumber));
                    break;
                case 2:
                    System.out.println("Select Slot");
                    int selectedSlot = sc.nextInt();
                    school.removeStudent(selectedSlot);
                    break;
                case 3:
                    school.displayStudents();
                    break;
                case 4:
                    x++;
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Enter the ID of the Student");
                    int id = sc.nextInt();
                    Student found = school.findByID(id);
                    if (found == null) {
                        System.out.println("Student not found");
                    } else {
                        System.out.println(found);
                    }
                    break;
            }
        }


    }

}
