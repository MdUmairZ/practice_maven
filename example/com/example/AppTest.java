
package example.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGradeA() {
        assertEquals("A", App.calculateGrade(95, 92, 98));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.calculateGrade(85, 82, 88));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", App.calculateGrade(75, 72, 78));
    }

    @Test
    public void testFail() {
        assertEquals("FAIL", App.calculateGrade(50, 55, 60));
    }

    @Test
    public void testInvalidMarks() {
        assertThrows(
            IllegalArgumentException.class,
            () -> App.calculateGrade(110, 80, 90)
        );
    }
}
