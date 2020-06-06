package com.traveloffice;

import java.time.LocalDate;
import java.util.Objects;

public class Offer {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private double price;
    private String description;
    private String country;
    private String city;

    public Offer(String name, int startYear, int startMonth, int startDay,
                 int endYear, int endMonth, int endDay, double price,
                 String description, String country, String city) {
        this.name = name;
        this.startDate = LocalDate.of(startYear, startMonth, startDay);
        this.endDate = LocalDate.of(endYear, endMonth, endDay);
        this.price = price;
        this.description = description;
        this.country = country;
        this.city = city;
        validateDate();
    }

    @Override
    public boolean equals(Object o) {
        Offer e = (Offer) o;
        return (this.name.equals(e.name)) && (this.startDate.equals(e.startDate)) && (this.endDate.equals(e.endDate))
                && (this.price == e.price) && (this.description.equals(e.description))
                && (this.country.equals(e.country)) && (this.city.equals(e.city));
    }

    @Override
    public String toString() {
        return name + " " + startDate + " - " + endDate + ". " + country + ", " + city + ". Price: " + price + " PLN";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, endDate, price, description, country, city);
    }

    private void validateDate() {
        if (!startDate.isBefore(endDate)) {
            System.out.println("Wrong dates. Start date: " + startDate + ", end date: " + endDate);
        }
    }

    public void showDetails() {
        System.out.println("========== OFFER " + name + " DETAILS ==========");
        System.out.println("Start date: " + startDate);
        System.out.println("End date: " + endDate);
        System.out.println("Price: " + price + " PLN");
        System.out.println("Location: " + country + ", " + city);
        System.out.println("Description: " + description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
