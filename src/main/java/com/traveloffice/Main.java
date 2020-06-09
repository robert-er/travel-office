package com.traveloffice;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        System.out.println("Welcome in TRAVEL OFFICE");

        OfferRepository offerRepository = new OfferRepository();
        //Offer constructor: String name, int startYear, int startMonth, int startDay,
        //                 int endYear, int endMonth, int endDay, double price,
        //                 String description, String country, String city
        offerRepository.addOffer(new Offer("Winter Camp", 2020, 12, 8,
                2020, 12, 16, 1659.89,
                "Amazing week in French Alps", "France", "Isola2000"));
        offerRepository.addOffer(new Offer("ReLaax", 2021, 1, 13,
                2020, 1, 20, 3057.11,
                "Feel the pow in Swiss resort", "Switzerland", "Laax"));
        offerRepository.addOffer(new Offer("Family Days", 2021, 2, 11,
                2021, 2, 25, 5408.01,
                "Get relax with all your family", "Austria", "Dachstein"));
        offerRepository.addOffer(new Offer("Snow Fesival",2021, 3, 8,
                2021, 3, 16, 4200.0,
                "The biggerst music event in Italy", "Italy", "Livigno"));
        offerRepository.addOffer(new Offer("Summer Surf Jam", 2020, 8, 23,
                2020, 8, 31, 4859.99,
                "Kite & Windsurfing extreme camp", "Spain", "Fuerteventura"));

        System.out.println("======================  OFFERS LIST ======================");
        Utils.printSet(offerRepository.getAll());

        Utils.printOfferDetails(offerRepository.getOfferByName("ReLaax"));

        //User constructor: String email, String name, String surname,
        //                  String address, String phone
        User user1 = new User("a.kowalski@wp.pl", "Adam", "Kowalski",
                "ul. Woronicza 17,00-999 Warszawa", "658412587");
        User user2 = new User("kejti22@o2.pl", "Katarzyna", "Mroz",
                "ul. Trzebnicka 34/12, 54-888 Wrocław", "654312154");
        User user3 = new User("tomasz.kot@transbud.pl", "Tomasz", "Kot",
                "ul. Lipowa 45, 45-225 Lipno", "878204152");

        Utils.printUserDetails(user1);

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(new User("tomcat@weapon.com", "Tomisław", "Wybuchowy",
                                "ul. Okopowa 21, 78-221 Ozimek", "999888777"));

        System.out.println("======================  USERS LIST ======================");
        Utils.printSet(userRepository.getAll());

        BookingRepository bookingRepository = new BookingRepository();

        Booking booking11 = new Booking(1,101);
        Booking booking12 = new Booking(1, 102);
        Booking booking22 = new Booking(2, 102);
        Booking booking21 = new Booking(2, 101);
        Booking booking31 = new Booking( 3, 101);
        Booking booking32 = new Booking( 3, 101);
        Booking booking14 = new Booking(4, 101);

        bookingRepository.addBooking(booking11);
        bookingRepository.addBooking(booking12);
        bookingRepository.addBooking(booking22);
        bookingRepository.addBooking(booking21);
        bookingRepository.addBooking(booking31);
        bookingRepository.addBooking(booking32);
        bookingRepository.addBooking(booking14);

        booking11.confirm();
        booking11.pay();
        booking21.confirm();
        booking31.cancel();

        Utils.printOfferUsers(101, offerRepository, userRepository, bookingRepository);
        Utils.printOfferUsers(102, offerRepository, userRepository, bookingRepository);

    }

}
