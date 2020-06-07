package com.traveloffice;

import java.util.HashSet;
import java.util.Set;

public class BookingRepository {

    private Set<Booking> bookingSet = new HashSet<>();
    private int bookingCounter = 1000;

    public void addBooking(Booking booking) {
        bookingCounter++;
        booking.setBookingId(bookingCounter);
        bookingSet.add(booking);
    }

    public void showOfferUsers(int offerId, OfferRepository offerRepository, UserRepository userRepository) {
        System.out.println("================= USER LIST for trip " + offerRepository.getOfferById(offerId).getName() + " =================");

        for(Booking booking : bookingSet) {
            if (booking.getOfferId() == offerId) {
                System.out.println(userRepository.getUserById(booking.getUserId()) + " - " + booking.getStatusString());
            }
        }
    }

}
