import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void shouldReturnNameOfStudent() {
        String expected = "Name1";
        Student student1 = new Student();
        student1.setName("Name1");
        String actual = student1.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetNameOfStudent() {
        String expected = "Name2";
        Student student2 = new Student();
        student2.setName("Name2");
        String actual = student2.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIDOfStudent() {
        int expected = 1234;
        Student student1 = new Student();
        student1.setId(1234);
        int actual = student1.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetIDOfStudent() {
        int expected = 12345;
        Student student2 = new Student();
        student2.setId(12345);
        int actual = student2.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnEmailOfStudent() {
        String expected = "student1@mail.de";
        Student student1 = new Student();
        student1.setEmail("student1@mail.de");
        String actual = student1.getEmail();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetEmailOfStudent() {
        String expected = "student2@mail.de";
        Student student2 = new Student();
        student2.setEmail("student2@mail.de");
        String actual = student2.getEmail();
        Assertions.assertEquals(expected, actual);
    }

}