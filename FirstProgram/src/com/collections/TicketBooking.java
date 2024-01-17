package com.collections;
import java.util.Date;

public class TicketBooking implements Comparable<TicketBooking> {
    private String passengerName;
    private long timeStamp;

    public TicketBooking(String passengerName,long timeStamp){
        super();
        this.passengerName=passengerName;
        this.timeStamp=timeStamp;
    }

    public void setPassengerName(String passengerName){
        this.passengerName=passengerName;
    }

    public String getPassengerName(){
        return passengerName;
    }

    public void setTimeStamp(long timeStamp){
        this.timeStamp=timeStamp;
    }

    public long getTimeStamp(){
        return timeStamp;
    }

    @Override
    public String toString(){
        return "PassengerName: "+this.passengerName+" "+"TimeStamp :"+new Date(this.timeStamp);
    }

    @Override
    public int compareTo(TicketBooking ob){
        return Long.compare(this.timeStamp,ob.timeStamp);
    }

}
