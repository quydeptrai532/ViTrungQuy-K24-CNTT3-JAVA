package ex06;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {

    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public Ticket issueTicket(String time) {
        currentNumber++;
        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.offer(t);
        return t;
    }

    public Ticket callNext() {
        return ticketQueue.poll();
    }
}