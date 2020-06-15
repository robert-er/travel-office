package com.traveloffice;

import org.junit.*;

public class BookingTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests of class " + Offer.class);
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    private Booking generateBooking() {
        return new Booking(11,22);
    }

    @Test
    public void testConfirm() {
        //Given
        Booking booking = generateBooking();
        //When
        booking.confirm();
        //Then
        Assert.assertEquals(1, booking.getStatus());
    }

    @Test
    public void testPay() {
        //Given
        Booking booking = generateBooking();
        booking.confirm();
        //When
        booking.pay();
        //Then
        Assert.assertEquals(2, booking.getStatus());
    }

    @Test
    public void testCancel() {
        //Given
        Booking booking = generateBooking();
        //When
        booking.cancel();
        //Then
        Assert.assertEquals(3, booking.getStatus());
    }

    @Test
    public void testGetUserId() {
        //Given
        Booking booking = generateBooking();
        //When
        int id = booking.getUserId();
        //Then
        Assert.assertEquals(11, id);
    }

    @Test
    public void testSetUserId() {
        //Given
        Booking booking = generateBooking();
        int newId = 55;
        //When
        booking.setUserId(newId);
        //Then
        Assert.assertEquals(newId, booking.getUserId());
    }

    @Test
    public void testGetOfferId() {
        //Given
        Booking booking = generateBooking();
        //When
        int id = booking.getOfferId();
        //Then
        Assert.assertEquals(22, id);
    }

    @Test
    public void testSetOfferId() {
        //Given
        Booking booking = generateBooking();
        int newId = 66;
        //When
        booking.setOfferId(newId);
        //Then
        Assert.assertEquals(newId, booking.getOfferId());
    }

    @Test
    public void testGetBookingId() {
        //Given
        Booking booking = generateBooking();
        //When
        int id = booking.getBookingId();
        //Then
        Assert.assertEquals(0, id);
    }

    @Test
    public void testSetBookingId() {
        //Given
        Booking booking = generateBooking();
        int newId = 122;
        //When
        booking.setBookingId(newId);
        //Then
        Assert.assertEquals(newId, booking.getBookingId());
    }

    @Test
    public void testGetStatus() {
        //Given
        Booking booking = generateBooking();
        //When
        int status = booking.getStatus();
        //Then
        Assert.assertEquals(0,status);
    }

    @Test
    public void testGetStatusStringBooked() {
        //Given
        Booking booking = generateBooking();
        //When
        String statusString = booking.getStatusString();
        //Then
        Assert.assertEquals("booked", statusString);
    }

    @Test
    public void testGetStatusStringConfirmed() {
        //Given
        Booking booking = generateBooking();
        booking.confirm();
        //When
        String statusString = booking.getStatusString();
        //Then
        Assert.assertEquals("confirmed", statusString);
    }

    @Test
    public void testGetStatusStringPaid() {
        //Given
        Booking booking = generateBooking();
        booking.confirm();
        booking.pay();
        //When
        String statusString = booking.getStatusString();
        //Then
        Assert.assertEquals("paid", statusString);
    }

    @Test
    public void testGetStatusStringCanceled() {
        //Given
        Booking booking = generateBooking();
        booking.cancel();
        //When
        String statusString = booking.getStatusString();
        //Then
        Assert.assertEquals("canceled", statusString);
    }
}
