public class Truck extends Vehicle{


    public Truck(String model, int maxSpeed, int capacity) {
        super(model, maxSpeed, capacity);
        this.capacity=capacity;
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    public void loadCargo(double weight){
        System.out.println(weight +" kg cargo loaded");
    }
    @Override
    public void displayInfo(){
        System.out.println("Model: "+model+" | Max speed: "+maxSpeed+" | Capacity: "+capacity);
    }
}
