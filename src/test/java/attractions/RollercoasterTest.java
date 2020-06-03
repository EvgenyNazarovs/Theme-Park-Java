package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(18, 205, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void eligibleVisitorCanVisit() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void getDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.1);
    }

    @Test
    public void getDoublePriceForVisitorsOver200Cm() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.1);
    }
}
