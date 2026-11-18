import java.time.LocalDateTime;
public class Arive_To {


        private static int nextId = 1;

        private final int id;
        private final LocalDateTime dateTime;
        private final double amount;      // стоимость поездки
        private final VehicleType vehicleType;

        public Arive_To(double amount, VehicleType vehicleType)
        {
            this.id = nextId++;
            this.dateTime = LocalDateTime.now();
            this.amount = amount;
            this.vehicleType = vehicleType;
        }

        public int getId() { return id; }
        public LocalDateTime getDateTime() { return dateTime; }
        public double getAmount() { return amount; }
        public VehicleType getVehicleType() { return vehicleType; }

}
