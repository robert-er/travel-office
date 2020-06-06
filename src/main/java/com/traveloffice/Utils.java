package com.traveloffice;

import java.util.Map;
import java.util.Set;

public class Utils {

    public static void showOffers(Set<Offer> offerSet) {
        System.out.println("======================  OFFER LIST ======================");
        for (Offer offer : offerSet) {
            System.out.println(offer);
        }
    }

    public static Offer searchOfferByName(Set<Offer> offerSet, String name) {
        for (Offer offer : offerSet) {
            if (offer.getName().equals(name)) {
                return offer;
            }
        }
        return null;
    }

    public static void showOfferUsers(Map<Offer, User> offerUserMap, Offer offer) {
        System.out.println("================= USER LIST for trip " + offer.getName() + " =================");
        for(Map.Entry<Offer, User> entry : offerUserMap.entrySet()) {
            if (entry.getKey().equals(offer)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
