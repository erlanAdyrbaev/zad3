import junit.framework.TestCase;

public class FindStringFilterTest extends TestCase {

    public void testApply() {
        String str = "Мама мыла раму";
        FindStringFilter filter1 = new FindStringFilter("Мама");
        FindStringFilter filter2 = new FindStringFilter("мыла");
        FindStringFilter filter3 = new FindStringFilter("раму");
        FindStringFilter filter4 = new FindStringFilter("Мыла");


        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        assertEquals(true,res1);
        assertEquals(true,res2);
        assertEquals(true, filter3.apply(str));
        assertFalse(filter4.apply(str));
    }
}