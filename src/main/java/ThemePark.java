import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ThemePark {

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;

    private CandyflossStall candyFlossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;

    private ArrayList<IReviewed> reviewedAttractions;


    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster, CandyflossStall candyFlossStall, IceCreamStall iceCreamStall, TobaccoStall tobaccoStall) {
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.rollerCoaster = rollerCoaster;
        this.candyFlossStall = candyFlossStall;
        this.iceCreamStall = iceCreamStall;
        this.tobaccoStall = tobaccoStall;
        this.reviewedAttractions = new ArrayList<IReviewed>();
    }

    public void addReviewed(IReviewed attraction) {
        this.reviewedAttractions.add(attraction);
    }


    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewedAttractions;
    }

    public void visit(Attraction attraction, Visitor visitor) {
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }

    public HashMap<String, Integer> getAllReviews() {
        HashMap<String, Integer> reviews = new HashMap<String, Integer>();

        for (IReviewed attraction : reviewedAttractions) {
            String name = attraction.getName();
            Integer rating = attraction.getRating();
            reviews.put(name, rating);
        }

        return reviews;

    }
}
