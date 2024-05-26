package models;

public class MuseumModel {
    private String name;
    private String openingTime;
    private String closingTime;
    private double ticketPrice;
    private String address;

    public MuseumModel(String name, String openingTime, String closingTime, double ticketPrice, String address) {
        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
        this.address = address;
    }
    public MuseumModel() { }

    public String getName() {
        return name;
    }
    public MuseumModel setName(String name) {
        this.name = name;
        return this;
    }
    public MuseumModel setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return openingTime;
    }
    public MuseumModel setClosingTime(String closingTime) {
        this.closingTime = closingTime;
        return this;
    }
    public String getClosingTime() {
        return closingTime;
    }
    public MuseumModel setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        return this;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public MuseumModel setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return address;
    }
}