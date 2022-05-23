package model;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void shouldReturnNameOfStudent() {
        String expected = "Name1";
        Student student1 = new Student("Name1", 1234, "student1@mail.de");
        String actual = student1.getName();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldReturnIDOfStudent() {
        int expected = 1234;
        Student student1 = new Student("Name2", 1234, "student2@mail.de");
        int actual = student1.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnEmailOfStudent() {
        String expected = "student3@mail.de";
        Student student1 = new Student("Name3", 12345, "student3@mail.de");
        String actual = student1.getEmail();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnStringWithAllStudentData() {
        String expected = "Name1 1234 student1@mail.de";
        Student student4 = new Student("Name1", 1234, "student1@mail.de");
        String actual = student4.toString();
        Assertions.assertEquals(expected, actual);
    }

}