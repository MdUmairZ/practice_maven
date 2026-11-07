
package example.com.example;

public class App {

    public static String calculateGrade(int m1, int m2, int m3) {

        // Validate marks
        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100) {

            throw new IllegalArgumentException("Invalid marks");
        }

        // Calculate average
        double average = (m1 + m2 + m3) / 3.0;

        // Calculate grade
        if (average >= 90) {
            return "A";
        } 
        else if (average >= 80) {
            return "B";
        } 
        else if (average >= 70) {
            return "C";
        } 
        else {
            return "FAIL";
        }
    }
}
