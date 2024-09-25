class Vehicle {

     static int Counter;

     String licensePlate;
     double rentalPrice;
     boolean isRented;


     Vehicle(String licensePlate, double rentalPrice, boolean isRented) {
          this.licensePlate = licensePlate;
          this.rentalPrice = rentalPrice;
          this.isRented = isRented;
     }

     void rent() {
          isRented = !isRented;
          System.out.println("The Rental Price: " + rentalPrice);

     }

     void calculateRentalPrice() {

     }
}

class Car extends Vehicle {

     String fuelType;

     Car(String licensePlate, double rentalPrice, boolean isRented, String fuelType) {
          super(licensePlate, rentalPrice, isRented);
          this.fuelType = fuelType;
     }

     void calculateRentalPrice() {
          if (fuelType == "diesel") {
               rentalPrice += 2000;
          } else if (fuelType == "petrol") {
               rentalPrice += 3500;
          } else if (fuelType == "cng") {
               rentalPrice += 1200;
          }
     }
}

class Motorcycle extends Vehicle {

     Motorcycle(String licensePlate, double rentalPrice, boolean isRented) {
          super(licensePlate, rentalPrice, isRented);

     }

     void calculateRentalPrice() {

     }
}

class Bicycle extends Vehicle {
     double timeRentedFor;

     Bicycle(String licensePlate, double rentalPrice, boolean isRented, double timeRentedFor) {
          super(licensePlate, rentalPrice, isRented);
          this.timeRentedFor = timeRentedFor;
     }

     void calculateRentalPrice() {
          rentalPrice = timeRentedFor * timeRentedFor;
     }
}

public class VehicleRentalSystem {
     public static void main(String args[]) {
          Car rentCar = new Car("BG-250-W1", 3000, false, "petrol");
          
          // Initially not rented
          System.out.println("Car rented: " + rentCar.isRented);
          
          // Rent the car
          rentCar.rent();
          System.out.println("Car rented: " + rentCar.isRented);

          // Calculate rental price for the car
          rentCar.calculateRentalPrice();
          System.out.println("Final Rental Price for Car: " + rentCar.rentalPrice);
          
          // Renting a Bicycle
          Bicycle rentBicycle = new Bicycle("BX-567-Y2", 100, false, 3);
          rentBicycle.calculateRentalPrice();
          System.out.println("Final Rental Price for Bicycle: " + rentBicycle.rentalPrice);
     }
}
