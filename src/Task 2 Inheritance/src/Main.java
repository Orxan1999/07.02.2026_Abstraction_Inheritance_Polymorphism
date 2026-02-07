//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1=new Vehicle("Vehicle1",100,200 );

        Truck truck1=new Truck("Truck1",150,300);
        vehicle1.displayInfo();
        truck1.displayInfo();
        truck1.loadCargo(1000);
        Vehicle vehicle2=new Truck("Truck 2",10,20);
        vehicle2.displayInfo();
        Truck truck2=(Truck)vehicle2;
        truck2.displayInfo();

    }
}