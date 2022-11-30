package test;

import org.junit.jupiter.api.Test;
import org.zubarev.hermes.app.infra.exception.flow.InvalidParameterException;
import org.zubarev.hermes.app.infra.util.Checks;

import static org.junit.jupiter.api.Assertions.*;

class ChecksTest {

    @Test
    void testCheckParameterGetException() {
        try {
            Checks.checkParameter(false,"test");
        } catch (Exception e){
            assertSame(e.getClass(), InvalidParameterException.class);
            assertEquals(e.getMessage(),"test");
        }

    }
    @Test
    public void testCheckParameterNoException() {

        Checks.checkParameter(true, "test");

        assertTrue(true);

    }
}