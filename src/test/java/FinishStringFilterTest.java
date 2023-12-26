import junit.framework.TestCase;

public class FinishStringFilterTest extends TestCase {

    public void testApply() {
        String str = "Мама мыла раму";
        FinishStringFilter filter1 = new FinishStringFilter("раму");
        FinishStringFilter filter2 = new FinishStringFilter("мыла");

        assertTrue(filter1.apply(str));
        assertFalse(filter2.apply(str));
    }
}