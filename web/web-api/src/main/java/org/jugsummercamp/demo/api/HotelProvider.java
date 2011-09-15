package org.jugsummercamp.demo.api;

import java.util.Collection;
import java.util.Date;

public interface HotelProvider {

    String getCountry();

    Collection<Hotel> hotels();
    
    boolean book(String id, Date checkin, 
            Date checkout, Integer beds, 
            Boolean smocking, String cardNumber, 
            String cardName, String cardMonth, 
            String cardYear);
}
