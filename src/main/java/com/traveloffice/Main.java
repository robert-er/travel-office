package com.traveloffice;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        System.out.println("Welcome in TRAVEL OFFICE");

        Set<Offer> offerSet = new HashSet<>();
        //Offer constructor: String name, int startYear, int startMonth, int startDay,
        //                 int endYear, int endMonth, int endDay, double price,
        //                 String description, String country, String city
        offerSet.add(new Offer("Winter Camp", 2020, 12, 8,
                2020, 12, 16, 1659.89,
                "Amazing week in French Alps", "France", "Isola2000"));
        offerSet.add(new Offer("ReLaax", 2021, 1, 13,
                2020, 1, 20, 3057.11,
                "Feel the pow in Swiss resort", "Switzerland", "Laax"));
        offerSet.add(new Offer("Family Days", 2021, 2, 11,
                2021, 2, 25, 5408.01,
                "Get relax with all your family", "Austria", "Dachstein"));
        offerSet.add(new Offer("Snow Fesival",2021, 3, 8,
                2021, 3, 16, 4200.0,
                "The biggerst music event in Italy", "Italy", "Livigno"));
        offerSet.add(new Offer("Summer Surf Jam", 2020, 8, 23,
                2020, 8, 31, 4859.99,
                "Kite & Windsurfing extreme camp", "Spain", "Fuerteventura"));

        Utils.showOffers(offerSet);
        Utils.searchOfferByName(offerSet, "ReLaax").showDetails();

        //User constructor: String email, String name, String surname,
        //                  String address, String phone
        User user1 = new User("a.kowalski@wp.pl", "Adam", "Kowalski",
                "ul. Woronicza 17,00-999 Warszawa", "658412587");
        User user2 = new User("kejti22@o2.pl", "Katarzyna", "Mroz",
                "ul. Trzebnicka 34/12, 54-888 Wrocław", "654312154");
        User user3 = new User("tomasz.kot@transbud.pl", "Tomasz", "Kot",
                "ul. Lipowa 45, 45-225 Lipno", "878204152");

        user1.showDetails();

        Map<Offer, User> offerUserMap = new HashMap<>();
        offerUserMap.put(Utils.searchOfferByName(offerSet, "ReLaax"), user1);
        offerUserMap.put(Utils.searchOfferByName(offerSet, "ReLaax"), user2);
        offerUserMap.put(Utils.searchOfferByName(offerSet, "ReLaax"), user3);
        offerUserMap.put(Utils.searchOfferByName(offerSet, "Summer Surf Jam"), user1);

        Utils.showOfferUsers(offerUserMap, Utils.searchOfferByName(offerSet, "ReLaax"));
    }
}
