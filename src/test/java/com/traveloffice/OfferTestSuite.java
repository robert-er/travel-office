package com.traveloffice;

import org.junit.*;

import java.time.LocalDate;

public class OfferTestSuite {
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

    private Offer generateOffer() {
        return new Offer("OfferName", 2020, 01, 01,
                2020, 02, 02, 5487.48, "offer description",
                "Offer country", "Offer city");
    }

    @Test
    public void testGetOfferId() {
        //Given
        Offer offer = generateOffer();
        //When
        int id = offer.getOfferId();
        //Then
        Assert.assertEquals(0, id);
    }

    @Test
    public void testSetOfferId() {
        //Given
        Offer offer = generateOffer();
        int id = 5;
        //When
        offer.setOfferId(id);
        //Then
        Assert.assertEquals(id, offer.getOfferId());
    }

    @Test
    public void testGetName() {
        //Given
        Offer offer = generateOffer();
        //When
        String name = offer.getName();
        //Then
        Assert.assertEquals("OfferName", name);
    }

    @Test
    public void testSetName() {
        //Given
        Offer offer = generateOffer();
        String newName = "newOfferName";
        //When
        offer.setName(newName);
        //Then
        Assert.assertEquals(newName,offer.getName());
    }

    @Test
    public void testGetStartDate() {
        //Given
        Offer offer = generateOffer();
        //When
        LocalDate startDate = offer.getStartDate();
        LocalDate expectedDate = LocalDate.of(2020, 01, 01);
        //Then
        Assert.assertEquals(expectedDate, startDate);
    }

    @Test
    public void testSetStartDate() {
        //Given
        Offer offer = generateOffer();
        LocalDate expectedDate = LocalDate.of(2025, 05, 05);
        //When
        offer.setStartDate(expectedDate);
        //Then
        Assert.assertEquals(expectedDate, offer.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        //Given
        Offer offer = generateOffer();
        //When
        LocalDate endDate = offer.getEndDate();
        LocalDate expectedDate = LocalDate.of(2020, 02, 02);
        //Then
        Assert.assertEquals(expectedDate, endDate);
    }

    @Test
    public void testSetEndDate() {
        //Given
        Offer offer = generateOffer();
        LocalDate expectedDate = LocalDate.of(2025, 06, 06);
        //When
        offer.setEndDate(expectedDate);
        //Then
        Assert.assertEquals(expectedDate, offer.getEndDate());
    }

    @Test
    public void testGetPrice() {
        //Given
        Offer offer = generateOffer();
        //When
        double price = offer.getPrice();
        //Then
        Assert.assertEquals(5487.48, price, 0.0);
    }

    @Test
    public void testSetPrice() {
        //Given
        Offer offer = generateOffer();
        double newPrice = 999.9;
        //When
        offer.setPrice(newPrice);
        //Then
        Assert.assertEquals(newPrice, offer.getPrice(), 0.0);
    }

    @Test
    public void testGetDescription() {
        //Given
        Offer offer = generateOffer();
        //When
        String description = offer.getDescription();
        //Then
        Assert.assertEquals("offer description", description);
    }


    @Test
    public void testSetDescription() {
        //Given
        Offer offer = generateOffer();
        String newDescription = "new description";
        //When
        offer.setDescription(newDescription);
        //Then
        Assert.assertEquals(newDescription, offer.getDescription());
    }

    @Test
    public void testGetCountry() {
        //Given
        Offer offer = generateOffer();
        //When
        String country = offer.getCountry();
        //Then
        Assert.assertEquals("Offer country", country);
    }


    @Test
    public void testSetCountry() {
        //Given
        Offer offer = generateOffer();
        String newCountry = "new country";
        //When
        offer.setCountry(newCountry);
        //Then
        Assert.assertEquals(newCountry, offer.getCountry());
    }

    @Test
    public void testGetCity() {
        //Given
        Offer offer = generateOffer();
        //When
        String city = offer.getCity();
        //Then
        Assert.assertEquals("Offer city", city);
    }


    @Test
    public void testSetCity() {
        //Given
        Offer offer = generateOffer();
        String newCity = "new city";
        //When
        offer.setCity(newCity);
        //Then
        Assert.assertEquals(newCity, offer.getCity());
    }
}
