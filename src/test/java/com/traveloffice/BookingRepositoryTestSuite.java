package com.traveloffice;

import org.junit.*;

import java.util.HashSet;
import java.util.Set;

public class BookingRepositoryTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests of class " + BookingRepository.class);
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
    public void testAddBooking() {
        //Given
        BookingRepository bookingRepository = new BookingRepository();
        Booking booking = generateBooking();
        //When
        bookingRepository.addBooking(booking);
        //Then
        Assert.assertTrue(bookingRepository.getAll().contains(booking));
    }

    @Test
    public void testGetAll() {
        //Given
        BookingRepository bookingRepository = new BookingRepository();
        Booking booking = generateBooking();
        bookingRepository.addBooking(booking);
        //When
        Set<Booking> bookingSet = bookingRepository.getAll();
        //Then
        Assert.assertEquals(1, bookingSet.size());
        Assert.assertTrue(bookingSet.contains(booking));
    }
}
