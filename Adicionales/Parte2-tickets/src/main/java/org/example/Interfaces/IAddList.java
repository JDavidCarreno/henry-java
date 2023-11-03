package org.example.Interfaces;

import org.example.Entities.Ticket;

import java.util.List;

public interface IAddList {
    double addPrices(List<Ticket> tickets);
    List<Ticket> ticketsByRow(List<Ticket> tickets, int row);

}
