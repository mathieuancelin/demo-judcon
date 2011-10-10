package org.judcon.demo.france;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.weld.environment.osgi.api.annotation.Publish;
import org.judcon.demo.api.Hotel;
import org.judcon.demo.api.HotelProvider;

@Publish
@ApplicationScoped
public class FranceHotelProvider implements HotelProvider {

    private static final Collection<Hotel> hotels;
    
    static {
        hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("Au bon Hotel", "Paris", "France", "2222", new Double(100)));
        hotels.add(new Hotel("Hotel California", "Paris", "France", "4444", new Double(200)));
        hotels.add(new Hotel("Hotel Claridge", "Paris", "France", "1234", new Double(300)));
    }
    
    @Override
    public Collection<Hotel> hotels() {
        return hotels;
    }

    @Override
    public String getCountry() {
        return "France";
    }
    
    @Override
    public boolean book(String id, Date checkin, Date checkout, Integer beds, Boolean smocking, String cardNumber, String cardName, String cardMonth, String cardYear) {
        return true;
    }
}
