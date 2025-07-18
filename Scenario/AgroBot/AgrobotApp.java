package Scenario.AgroBot;
// SensorReadable interface for sensor integration
interface SensorReadable {
    void readSensorData();
}

// Abstract class for irrigation units
abstract class IrrigationUnit implements SensorReadable {
    private double calibrationFactor;

    // Constructor for calibration setup (Constructor Chaining)
    public IrrigationUnit() {
        this(1.0); // default calibration
    }

    public IrrigationUnit(double calibrationFactor) {
        this.calibrationFactor = calibrationFactor;
    }

    // Abstract method to be overridden
    public abstract void startWatering();

    // Internal method (protected - restricted access)
    protected void calibrate() {
        System.out.println("Calibrating with factor: " + calibrationFactor);
    }

    // Public method to control access to calibration
    public void performCalibration() {
        calibrate();
    }
}

// Sprinkler system implementation
class Sprinkler extends IrrigationUnit {
    public Sprinkler() {
        super(1.2); // specific calibration
    }

    @Override
    public void startWatering() {
        System.out.println("Sprinkler started watering.");
    }

    @Override
    public void readSensorData() {
        System.out.println("Sprinkler reading humidity sensor...");
    }
}

// Drip system implementation
class DripSystem extends IrrigationUnit {
    public DripSystem() {
        super(0.8); // specific calibration
    }

    @Override
    public void startWatering() {
        System.out.println("Drip system started watering.");
    }

    @Override
    public void readSensorData() {
        System.out.println("Drip system reading soil moisture sensor...");
    }
}

// Main application
public class AgrobotApp {
    public static void main(String[] args) {
        IrrigationUnit unit1 = new Sprinkler(); // Polymorphism
        IrrigationUnit unit2 = new DripSystem(); // Polymorphism

        unit1.performCalibration();
        unit1.readSensorData();
        unit1.startWatering();

        System.out.println();

        unit2.performCalibration();
        unit2.readSensorData();
        unit2.startWatering();
    }
}
