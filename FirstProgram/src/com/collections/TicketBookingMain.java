package com.collections;

import java.util.PriorityQueue;

public class TicketBookingMain {
    public static void main(String args[]){
        PriorityQueue<TicketBooking> tickets=new PriorityQueue<TicketBooking>();
        tickets.add(new TicketBooking("John",System.currentTimeMillis()+1000));
        tickets.add(new TicketBooking("kavya",System.currentTimeMillis()-1000));
        tickets.add(new TicketBooking("James",System.currentTimeMillis()-200));
        tickets.add(new TicketBooking("Adams",System.currentTimeMillis()-4000));
        while(!tickets.isEmpty()){
            TicketBooking ticket=tickets.poll();
            System.out.println(ticket);

        }



    }
}
