package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15) {
            return true;
        } else {
            return false;
        }
    }
}



//Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:
//
//Playground implements ISecurity because it has a maximum age of 15
//TobaccoStall implements ISecurity because it has a minimum age of 18
//Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age
//All Stalls and Attractions implement IReviewed.
//Note: Starting prices are:
//£8.40 for Rollercoaster
//£4.50 for Dodgems
//Rollercoaster implements ITicketed and charges tall people over 200cm double fee
//Dodgems implements ITicketed and charge half price to children under 12 years old
//Extensions
//Create a ThemePark class to manage the attractions and stalls.
//
//ThemePark stores all Attractions and Stalls in it.
//ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.
//Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions and a method to add an attraction to the list.
//ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.
//Advanced Extensions
//ThemePark has a method that can return a new HashMap<String, Integer> with all reviews. The HashMap will have a key of the name and value of review.
//ThemePark has a method getAllAllowedFor(Visitor) which takes a Visitor and returns an ArrayList of IReviewed that the visitor is allowed to go on.
