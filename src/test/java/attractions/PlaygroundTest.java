package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor teenageVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        teenageVisitor = new Visitor(14, 180, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorUnder15NotAllowedToVisit() {
        assertEquals(false, playground.isAllowedTo(teenageVisitor));
    }
}
