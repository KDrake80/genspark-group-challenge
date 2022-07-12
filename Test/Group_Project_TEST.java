import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Authors: Affan Fareed, Alonso del Arte, Jacob Stout, Kevin Drake, Steven Lofquist
 * 7/11/22
 * Test Class for Extract_Int_Value
 */
class Group_Project_TEST {
    /**
     * Created with static methods, Do not need to make an Instance of the class.
     */
    @BeforeEach
    void setUp() {
    }

    /**
     * Test 1: Tests a single-word numeric value
     * Test 2: Tests a multi-word numeric value
     * Param: String value of Integer
     * @return Integer, the number from the String value of the number.
     * @throws IOException
     */
    @Test
    void testHTMLExtractInt() throws IOException {
        /**
         * One Method to get the Integer-Value of the String-Numeric-Value in the Text-File.
         */
        assertEquals(10, Extract_Int_Value.extract_html("ten"), "Extract Int Test 1: Failed");
        assertEquals(501, Extract_Int_Value.extract_html("Five hundred and one"), "Extract Int Test 2: Failed");
    }

    /**
     *
     */
    @AfterEach
    void tearDown() {
    }

}