public class Vehicle {

  String  model;
  int maxSpeed;
  int capacity;

  public Vehicle(String  model, int maxSpeed, int capacity){
      this.capacity=capacity;
      this.maxSpeed=maxSpeed;
      this.model=model;
  }

    public void displayInfo(){
        System.out.println("Model: "+model+" | Max speed: "+maxSpeed);
    }
}
