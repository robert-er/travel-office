package com.traveloffice;

import java.util.Objects;

public class Booking {

    private int userId;
    private int offerId;
    private int bookingId;
    private int status; // 0-booked, 1-confirmed, 2-paid, 3-canceled

    public Booking(int userId, int offerId) {
        this.userId = userId;
        this.offerId = offerId;
    }

    @Override
    public boolean equals(Object o) {
    Booking e = (Booking) o;
    return (this.userId == e.userId) && (this.offerId == e.offerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, offerId);
    }

    public void confirm() {
        status = 1;
    }

    public void pay() {
        if (status == 1 ) {
            status =2;
        }
    }

    public void cancel() {
        status = 3;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusString() {
        switch (status) {
            case 0 :
                return "booked";
            case 1:
                return "confirmed";
            case 2:
                return "paid";
            case 3 :
                return "canceled";
            default:
                return "unknown";
        }
    }
}
