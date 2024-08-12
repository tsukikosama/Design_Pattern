package org.ccsama.Singleton.Practice;

import org.ccsama.Factory.Idcard.IDCardFactory;

public class main {
    public static void main(String[] args) {
//        TicketMaker ticketMaker = TicketMaker.getIntance();
//        TicketMaker ticketMaker2 = TicketMaker.getIntance();
//        ticketMaker.getNextTicketNumber();
//        ticketMaker.getNextTicketNumber();
//        ticketMaker2.getNextTicketNumber();
//
//        if (ticketMaker == ticketMaker2){
//            System.out.println("同一个");
//        }else{
//            System.out.println("不是同一个");
//        }

        Triple triple1 = Triple.getInstance();
        Triple triple2 = Triple.getInstance();
        Triple triple3 = Triple.getInstance();

        for (int i = 0; i < 10 ; i++) {
            if (Triple.getInstance(i%3) == triple2){
                System.out.println("相同");
            }
        }
    }
}
