package com.traveloffice;

import java.util.Set;

public class Utils {

    public static void printSet(Set set) {
        for (Object object : set) {
            System.out.println(object);
        }
    }

    public static void printOfferUsers(int offerId, OfferRepository offerRepository, UserRepository userRepository,
                               BookingRepository bookingRepository) {
        System.out.println("================= USER LIST for trip "
                + offerRepository.getOfferById(offerId).getName()
                + " =================");

        for(Booking booking : bookingRepository.getAll()) {
            if (booking.getOfferId() == offerId) {
                System.out.println(userRepository.getUserById(booking.getUserId()) + " - " + booking.getStatusString());
            }
        }
    }

    public static void printUserDetails(User user) {
        System.out.println("========== USER DETAILS ==========");
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("E-mail: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone: " + user.getPhone());
    }

    public static void printOfferDetails(Offer offer) {
        System.out.println("========== OFFER " + offer.getName() + " DETAILS ==========");
        System.out.println("Start date: " + offer.getStartDate());
        System.out.println("End date: " + offer.getEndDate());
        System.out.println("Price: " + offer.getPrice() + " PLN");
        System.out.println("Location: " + offer.getCountry() + ", " + offer.getCity());
        System.out.println("Description: " + offer.getDescription());
    }

}
