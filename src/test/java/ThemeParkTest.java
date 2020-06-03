import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;

    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private ParkingSpot parkingSpot;
    private TobaccoStall tobaccoStall;

    private ThemePark themePark;

    private Visitor teenageVisitor;

    @Before
    public void setup() {
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);

        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);

        teenageVisitor = new Visitor(14, 180, 10);

        themePark = new ThemePark(dodgems, park, playground, rollerCoaster, candyflossStall, iceCreamStall, tobaccoStall);
    }

    @Test
    public void canGetAllReviewedAttractions() {
        themePark.addReviewed(dodgems);
        themePark.addReviewed(park);
        themePark.addReviewed(playground);
        themePark.addReviewed(rollerCoaster);
        assertEquals(4, themePark.getAllReviewed().size());
    }

    @Test
    public void canRecordVisits() {
        themePark.visit(park, teenageVisitor);
        assertEquals(1, park.getVisitCount());
        assertEquals(1, teenageVisitor.getVisitedAttractions().size());
    }

    @Test
    public void getAllReviews() {
        themePark.addReviewed(dodgems);
        themePark.addReviewed(park);
        themePark.addReviewed(playground);
        themePark.addReviewed(rollerCoaster);
        HashMap<String, Integer> reviews = themePark.getAllReviews();
        Integer value = reviews.get("Bumper Cars");
        assertEquals
    }
}
