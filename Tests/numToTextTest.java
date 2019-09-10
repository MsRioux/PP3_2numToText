import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class numToTextTest
{

    @Test
    void change1ToText() throws Exception
    {
        numToText num1one = new numToText(1);
        assertEquals("one", num1one.changeNumToText());
    }

    @Test
    void change2ToText() throws Exception
    {
        numToText two = new numToText(2);
        assertEquals("two", two.changeNumToText());
    }

    @Test
    void change3ToText() throws Exception
    {
        numToText three = new numToText(3);
        assertEquals("three", three.changeNumToText());
    }

    @Test
    void change4ToText() throws Exception
    {
        numToText four = new numToText(4);
        assertEquals("four", four.changeNumToText());
    }

    @Test
    void change5ToText() throws Exception
    {
        numToText five = new numToText(5);
        assertEquals("five", five.changeNumToText());
    }
    @Test
    void change6ToText() throws Exception
    {
        numToText six = new numToText(6);
        assertEquals("six", six.changeNumToText());
    }
    @Test
    void change7ToText() throws Exception
    {
        numToText seven = new numToText(7);
        assertEquals("seven", seven.changeNumToText());
    }
    @Test
    void change8ToText() throws Exception
    {
        numToText eight = new numToText(8);
        assertEquals("eight", eight.changeNumToText());
    }
    @Test
    void change9ToText() throws Exception
    {
        numToText nine = new numToText(9);
        assertEquals("nine", nine.changeNumToText());
    }
    @Test
    void change0ToText() throws Exception
    {
        numToText zero = new numToText(0);
        assertEquals("zero", zero.changeNumToText());
    }
}