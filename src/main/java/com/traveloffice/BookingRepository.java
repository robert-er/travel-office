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

    public Set<Booking> getAll() {
        return bookingSet;
    }

}
