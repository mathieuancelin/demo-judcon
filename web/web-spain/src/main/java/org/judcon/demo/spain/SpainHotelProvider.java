package org.judcon.demo.spain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.weld.environment.osgi.api.annotation.Publish;
import org.judcon.demo.api.Hotel;
import org.judcon.demo.api.HotelProvider;

@Publish @ApplicationScoped
public class SpainHotelProvider implements HotelProvider {

    private static final Collection<Hotel> hotels;
    
    static {
        hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("Catalonia Plaza Mayor", "Madrid", "Spain", "1234", new Double(100)));
        hotels.add(new Hotel("Emperador", "Madrid", "Spain", "6754", new Double(200)));
        hotels.add(new Hotel("Il Castillas hotel", "Madrid", "Spain", "3245", new Double(200)));
        hotels.add(new Hotel("Ada Palace", "Madrid", "Spain", "0000", new Double(500)));
        hotels.add(new Hotel("Palafox Central Suites", "Madrid", "Spain", "9857", new Double(600)));
    }
    
    @Override
    public Collection<Hotel> hotels() {
        return hotels;
    }

    @Override
    public String getCountry() {
        return "Spain";
    }

    @Override
    public boolean book(String id, Date checkin, Date checkout, Integer beds, Boolean smocking, String cardNumber, String cardName, String cardMonth, String cardYear) {
        return true;
    }
}
