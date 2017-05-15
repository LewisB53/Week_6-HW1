public class BusStop{
  private Person[] waiting;

  public BusStop(){
    this.waiting = new Person[10];
  }

  public int pedestriansWaiting(){
    int count = 0;
    for (Person person : waiting){
      if(person != null) {
        count++;
      }
    }
    return count;
  }


  public void holdPedestrians(Person person) {
    int pedestriansWaiting = pedestriansWaiting();
    waiting[pedestriansWaiting()] = person;
  }





}