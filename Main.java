public class Main {
    public static void main(String[] args) {
        NewVehicle newCar = new NewVehicle();

        newCar.setVehicleSerialNumber("EL MS 16");
        newCar.setVehicleName("Mercedes");
        newCar.setVehicleModel("17626267");
        newCar.setYear("2000");
        newCar.setManufacturer("Mercedes");


      
      System.out.println("New Vehicle Information:");
        System.out.println("Serial Number: " + newCar.getVehicleSerialNumber());
        System.out.println("Name: " + newCar.getVehicleName());
        System.out.println("Model: " + newCar.getVehicleModel());
        System.out.println("Year: " + newCar.getYear());
        System.out.println("Manufacturer: " + newCar.getManufacturer());
    }
}
