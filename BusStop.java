public class BusStop{
  public static Person[] waiting;

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

 public void add(Person person) {
   int pedestriansWaiting = pedestriansWaiting();
   waiting[pedestriansWaiting()] = person;
 }

 public void loadBus(Person person) {
  for (int i = 0; i<waiting.length; i++){
    waiting[i] = null;
    Bus.seating[i] = person;
    System.out.println(person);
 }

}







}