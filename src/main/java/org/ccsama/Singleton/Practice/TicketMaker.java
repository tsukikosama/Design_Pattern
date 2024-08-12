package org.ccsama.Singleton.Practice;

public class TicketMaker {

    public static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker(){

    }
    private int ticket = 1000;

    public synchronized int getNextTicketNumber(){
        System.out.println(ticket);
        return ticket++;
    }

    public static TicketMaker getIntance(){
        return ticketMaker;
    }
}
