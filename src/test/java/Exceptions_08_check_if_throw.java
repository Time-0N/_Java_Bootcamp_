import _java.Woche_03.Exceptions_08.StudentRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class Exceptions_08_check_if_throw {

    @Test
    void StudentIdException_whenThrown_thenMessageEqualsActualmessage() {
        //GIVEN
        StudentRepo studentRepo = new StudentRepo();


        //WHEN
        try {
            studentRepo.findStudentById("A01");

            //Fall 1: keine Exception aufgetreten
            fail("Es ist keine Exception aufgetreten!");

        } catch (Exception e) {

            //Fall 2: Exception ist aufgetreten

        }

        //THEN
        System.out.println("Excepton ist aufgetreten");
    }
}