package Code.DesignPatterns.Factory.BSP_VehikelFactory;

public class VehicleFactory {
    
    public Vehicle getVehicle(String vehicleType) throws NoSuchVehicle{
        if(vehicleType == null) return null;
        if(vehicleType.equalsIgnoreCase("AUTO")) return new Auto();
        if(vehicleType.equalsIgnoreCase("FAHRRAD")) return new Fahrrad();
        if(vehicleType.equalsIgnoreCase("E-Sooter")) return new EScooter();
        throw new NoSuchVehicle("Kein passendes Fahrzeug verfügbar!");
    }
}
