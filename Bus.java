public class Bus{
  public static Person[] seating;

  public Bus(){
    this.seating = new Person[10];
  }

  public int passengerCount(){
    int count = 0;
    for (Person person : seating){
      if(person != null) {
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return passengerCount() == seating.length;
  }

  public void takePassengers(Person person) {
    if (isBusFull()){
      return;
    }
    int passengerCount = passengerCount();
    seating[passengerCount()] = person;
  }





}













