package com.traveloffice;

import org.junit.*;

import java.util.HashSet;
import java.util.Set;

public class OfferRepositoryTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests of class " + OfferRepository.class);
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
    public void testAddOffer() {
        //Given
        OfferRepository offerRepository = new OfferRepository();
        Offer offer = generateOffer();
        //When
        offerRepository.addOffer(offer);
        //Then
        Assert.assertTrue(offerRepository.getAll().contains(offer));
    }

    @Test
    public void testGetAll() {
        //Given
        OfferRepository offerRepository = new OfferRepository();
        Offer offer = generateOffer();
        offerRepository.addOffer(offer);
        Set<Offer> expectedSet = new HashSet<>();
        expectedSet.add(offer);
        //When
        Set offerSet = offerRepository.getAll();
        //Then
        Assert.assertEquals(expectedSet, offerSet);
    }

    @Test
    public void testGetOfferByName() {
        //Given
        OfferRepository offerRepository = new OfferRepository();
        Offer offer = generateOffer();
        offerRepository.addOffer(offer);
        //When
        Offer gainedOffer = offerRepository.getOfferByName("OfferName");
        //Then
        Assert.assertEquals(offer, gainedOffer);
    }

    @Test
    public void testGetOfferById() {
        //Given
        OfferRepository offerRepository = new OfferRepository();
        Offer offer = generateOffer();
        offerRepository.addOffer(offer);
        //When
        Offer gainedOffer = offerRepository.getOfferById(101);
        //Then
        Assert.assertEquals(offer, gainedOffer);
    }
}
