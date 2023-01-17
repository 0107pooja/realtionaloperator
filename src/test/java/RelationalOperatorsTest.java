import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelationalOperatorsTest {

    @Test
    void shouldTellMinimumNumber() {
        RelationalOperators relationalOperators = new RelationalOperators();
        int expectedOutput=45;
        int actualOutput = relationalOperators.minimumOfTwoNumber(45,95);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldTellMaximumNumber() {
        RelationalOperators relationalOperators = new RelationalOperators();
        int expectedOutput=105;
        int actualOutput = relationalOperators.minimumOfTwoNumber(105,95);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldTellMaximumAndEqualToTwoNumber() {
        RelationalOperators relationalOperators = new RelationalOperators();
        int expectedOutput=105;
        int actualOutput = relationalOperators.minimumOfTwoNumber(105,95);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldTellMinimumAndEqualToTwoNumber() {
        RelationalOperators relationalOperators = new RelationalOperators();
        int expectedOutput=45;
        int actualOutput = relationalOperators.minimumOfTwoNumber(45,95);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldTellNotEqualToTwoNumber() {
        RelationalOperators relationalOperators = new RelationalOperators();
        int expectedOutput=95;
        int actualOutput = relationalOperators.minimumOfTwoNumber(95,75);
        assertEquals(expectedOutput, actualOutput);
    }

}




