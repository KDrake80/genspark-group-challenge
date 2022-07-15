import Project.Extract_Int_Value;
import Project.SortInput;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Authors: Affan Fareed, Alonso del Arte, Jacob Stout, Kevin Drake, Steven Lofquist
 * 7/11/22
 * Test Class for Project.Extract_Int_Value
 */
class Group_Project_TEST {
    /**
     * Created with static methods, Do not need to make an Instance of the class.
     */
            List<String> list;
    @BeforeEach
    void setUp() throws IOException {
        list = SortInput.sortInput("TextInput");
    }

    /**
     * Test 1: Tests a single-word numeric value
     * Test 2: Tests a multi-word numeric value
     * Param: String value of Integer
     * @return Integer, the number from the String value of the number.
     * @throws IOException
     */
//    @Test
//    void testHTMLExtractInt() throws IOException {
//        /**
//         * One Method to get the Integer-Value of the String-Numeric-Value in the Text-File.
//         */
//        assertEquals(10, Extract_Int_Value.extract_html("ten"), "Extract Int Test 1: Failed");
//        assertEquals(501, Extract_Int_Value.extract_html("Five hundred and one"), "Extract Int Test 2: Failed");
//    }

    /**
     * Test One: Checks to see if list is not null
     * Test Two: Checks to see if list contains same element as expected
     * Test Three: Checks file size
     * @throws IOException
     */
    @Test
    void testSortInputMethod() throws IOException {
        assertEquals(true, SortInput.sortInput("TextInput") != null, "Sorted test one: failed");
        assertEquals("Eleven", SortInput.sortInput("TextInput").get(2), "Sorted test two: failed");
        assertEquals(20, SortInput.sortInput("TextInput").size(), "Sorted test three: failed");
//        assertEquals(20, SortInput.sortInput().size(), "Sort Input Test 1: Failed");
//        Object[] strings = SortInput.sortInput().toArray();
//        assertEquals("One", SortInput.sortInput().get(0), "Sort Test 2: Failed");
//        assertEquals("Six", SortInput.sortInput().get(5), "Sort Test 3: Failed");
//        assertEquals("Twenty", SortInput.sortInput().get(SortInput.sortInput().size() - 1), "Test 4: Failed");
    }


    @AfterEach
    void tearDown() {
    }

}