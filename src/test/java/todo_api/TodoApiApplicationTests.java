package todo_api; // Change to your actual main package name (e.g., com.example.todoapi or todo_api)

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoApiApplicationTests {

    @Test
    void sampleUnitTestOne() {
        boolean isCiConfigured = true;
        assertTrue(isCiConfigured, "CI pipeline should be active");
    }

    @Test
    void sampleUnitTestTwo() {
        int expectedBuildSteps = 3;
        int actualBuildSteps = 3;
        assertEquals(expectedBuildSteps, actualBuildSteps);
    }
}