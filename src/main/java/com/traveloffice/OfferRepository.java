package com.traveloffice;

import java.util.HashSet;
import java.util.Set;

public class OfferRepository {

    private Set<Offer> offerSet = new HashSet<>();
    private int offerCounter = 100;

    public void addOffer(Offer offer) {
        offerCounter++;
        offer.setOfferId(offerCounter);
        offerSet.add(offer);
    }

    public Set getAll() {
        return offerSet;
    }

    public Offer getOfferByName(String name) {
        for (Offer offer : offerSet) {
            if (offer.getName().equals(name)) {
                return offer;
            }
        }
        return null;
    }

    public Offer getOfferById(int id) {
        for (Offer offer : offerSet) {
            if (offer.getOfferId() == id) {
                return offer;
            }
        }
        return null;
    }

}
