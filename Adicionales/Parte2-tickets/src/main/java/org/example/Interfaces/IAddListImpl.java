package org.example.Interfaces;

import org.example.Entities.Ticket;

import java.util.ArrayList;
import java.util.List;

public class IAddListImpl implements IAddList {
    @Override
    public double addPrices(List<Ticket> tickets) {
        double counter = 0;
        for (Ticket ticket : tickets) {
            counter += ticket.getPrice();
        }
        return counter;
    }

    @Override
    public List<Ticket> ticketsByRow(List<Ticket> tickets, int row) {
        List<Ticket> filteredTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getRow() == row){
                filteredTickets.add(ticket);
            }
        }
        return filteredTickets;
    }
}
