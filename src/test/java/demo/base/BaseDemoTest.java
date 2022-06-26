package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();
        String expected = "Hello World";
        assertEquals(expected, baseDemo.print());
        assertEquals(8, baseDemo.sum(3,5));
        assertEquals(4, baseDemo.sum(9,-5));
    }
}
