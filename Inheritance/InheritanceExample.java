class Vehicle{
     String brand;
     int speed;

     Vehicle(){
          System.out.println("Default constructor of vehicle is called!");
     }

     Vehicle(String brand, int speed){
          this.brand = brand;
          this.speed = speed;
     }

     void start(){
          System.out.println("Vehicle is starting...");
     }

     void displayInfo(){
          System.out.println("Brand: " + brand + " Speed: " + speed  );
     }
}

class Car extends Vehicle{
     int gear;

     Car(){

     }

     Car(String brand, int speed, int gear){
          super(brand, speed);
          this.gear = gear;

     }

     void start(){
          System.out.println("Car is starting...");
     }

     void changeGear(int gear){
          this.gear = gear;
     }

     void displayInfo(){
          super.displayInfo();
          System.out.println("Currently on Gear " + gear);

     }
}

public class InheritanceExample{
     public static void main(String args[]){
          // Create a Car object using constructor chaining
        Car myCar = new Car("Tesla", 100, 1);

        // Start the car (demonstrates method overriding and 'super')
        myCar.start();

        // Change the gear of the car
        myCar.changeGear(3);

        // Display the information of the car (demonstrates method overriding)
        myCar.displayInfo();
     }
}