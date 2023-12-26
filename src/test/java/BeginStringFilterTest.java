import junit.framework.TestCase;

public class BeginStringFilterTest extends TestCase {

    public void testApply() {
        String str = "Мама мыла раму";
        Filter filter1 = new BeginStringFilter("Мама");
        Filter filter2 = new BeginStringFilter("мыла");

        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        assertEquals(true,res1);
        assertFalse(res2);
    }
}