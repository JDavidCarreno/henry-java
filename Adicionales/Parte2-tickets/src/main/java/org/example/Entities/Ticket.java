package org.example.Entities;

import lombok.Data;

@Data
public class Ticket {
    private static int number = 0;
    private final int id;
    private int row;
    private int sit;
    private String date;
    private String expiration_date;
    private double price;

    public Ticket(int row, int sit, String date, String expiration_date, double price){
        this.id = number;
        this.row = row;
        this.sit = sit;
        this.date = date;
        this.expiration_date = expiration_date;
        this.price = price;
        number++;
    }
}
