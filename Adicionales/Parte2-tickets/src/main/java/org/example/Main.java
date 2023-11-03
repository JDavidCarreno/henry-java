package org.example;

import org.example.Entities.Ticket;
import org.example.Interfaces.IAddList;
import org.example.Interfaces.IAddListImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Ticket> tickets = getTickets();

        IAddList addList = new IAddListImpl();

        System.out.println("-------------ALL TICKETS-------------");
        System.out.println(tickets);
        System.out.println("-------------TOTAL PRICE-------------");
        System.out.println(addList.addPrices(tickets));
        System.out.println(" ");
        System.out.println("-------------Enter a row to see all the tickets that belong to that row-------------");
        int row = scanner.nextInt();
        System.out.println(addList.ticketsByRow(tickets, row));
    }

    private static List<Ticket> getTickets() {
        Ticket ticket1 = new Ticket(1, 1, "12/12/2023", "02/02/2023", 200);
        Ticket ticket2 = new Ticket(1, 2, "01/01/2023", "02/02/2023", 200);
        Ticket ticket3 = new Ticket(1, 3, "13/12/2023", "02/02/2023", 200);
        Ticket ticket4 = new Ticket(2, 5, "16/12/2023", "02/02/2023", 200);
        Ticket ticket5 = new Ticket(2, 6, "27/12/2023", "02/02/2023", 200);

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        return tickets;
    }
}