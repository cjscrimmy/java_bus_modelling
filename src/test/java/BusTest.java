import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal", 50);
        passenger = new Person();
    }

    @Test
    public void hasDestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void numberOfPassengers(){
      assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.getPassengerCount());
    }

}
