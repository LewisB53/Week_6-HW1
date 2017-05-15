import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;
  BusStop busStop;

  @Before 
  public void before() {
    bus = new Bus();
    person = new Person();
    busStop = new BusStop();
  }

  @Test
  public void seatsStartsEmpty(){
    assertEquals(0,bus.passengerCount());
  }

  @Test
  public void canTakePassengers(){
    bus.takePassengers(person);
    assertEquals(1,bus.passengerCount());
  }

  @Test
  public void canNotTakeAnyMorePassengers(){
    for(int i=0; i<11; i++){
      bus.takePassengers(person);
    }
    assertEquals(10,bus.passengerCount());
  }


// BusStop Tests

  @Test
  public void BusStopHasPeople(){
    assertEquals(0,busStop.pedestriansWaiting());
  }

  @Test
  public void canHoldPedestrians(){
    busStop.holdPedestrians(person);
    assertEquals(1,busStop.pedestriansWaiting());
  }

  @Test
  public void canMoveToBus(){
    busStop.add(person);
    busStop.loadBus(person);
    assertEquals(0,busStop.pedestriansWaiting());
    assertEquals(10,bus.passengerCount());
  }




}
