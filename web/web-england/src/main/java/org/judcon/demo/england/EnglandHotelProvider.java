package org.judcon.demo.england;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.weld.environment.osgi.api.annotation.Publish;
import org.judcon.demo.api.Hotel;
import org.judcon.demo.api.HotelProvider;

@Publish
@ApplicationScoped
public class EnglandHotelProvider implements HotelProvider {

    private static final Collection<Hotel> hotels;
    
    static {
        hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("The Montcalm", "London", "England", "9999", new Double(100)));
        hotels.add(new Hotel("The Berkeley", "London", "England", "3333", new Double(200)));
    }
    
    @Override
    public Collection<Hotel> hotels() {
        return hotels;
    }

    @Override
    public String getCountry() {
        return "England";
    }

    @Override
    public boolean book(String id, Date checkin, Date checkout, Integer beds, Boolean smocking, String cardNumber, String cardName, String cardMonth, String cardYear) {
        return true;
    }
}
