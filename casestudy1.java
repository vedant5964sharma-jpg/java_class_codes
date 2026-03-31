abstract class Robot {
    private String robotId;
    private double batteryLevel;

    public Robot(String robotId, double batteryLevel) {
        this.robotId = robotId;
        this.batteryLevel = batteryLevel;
    }

    public String getRobotId() {
        return robotId;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public abstract double performTask();
}

class PickerRobot extends Robot {
    public PickerRobot(String robotId, double batteryLevel) {
        super(robotId, batteryLevel);
    }

    public double performTask() {
        double required = 10;
        if (getBatteryLevel() < required) {
            System.out.println("PickerRobot: Not enough battery!");
            return getBatteryLevel();
        }
        return getBatteryLevel() - required;
    }
}

class LoaderRobot extends Robot {
    public LoaderRobot(String robotId, double batteryLevel) {
        super(robotId, batteryLevel);
    }

    public double performTask() {
        double required = 20;
        if (getBatteryLevel() < required) {
            System.out.println("LoaderRobot: Not enough battery!");
            return getBatteryLevel();
        }
        return getBatteryLevel() - required;
    }
}

class InspectorRobot extends Robot {
    public InspectorRobot(String robotId, double batteryLevel) {
        super(robotId, batteryLevel);
    }

    public double performTask() {
        double required = 5;
        if (getBatteryLevel() < required) {
            System.out.println("InspectorRobot: Not enough battery!");
            return getBatteryLevel();
        }
        return getBatteryLevel() - required;
    }
}

public class casestudy1 {
    public static void executeTask(Robot r) {
        System.out.println("Robot ID: " + r.getRobotId());
        System.out.println("Initial Battery: " + r.getBatteryLevel());
        double remainingBattery = r.performTask();
        System.out.println("Remaining Battery: " + remainingBattery);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Robot r1 = new PickerRobot("R101", 100);
        Robot r2 = new LoaderRobot("R202", 80);
        Robot r3 = new InspectorRobot("R303", 50);
        Robot r4 = new LoaderRobot("R404", 10);
        Robot r5 = new InspectorRobot("R505", 3);

        executeTask(r1);
        executeTask(r2);
        executeTask(r3);
        executeTask(r4);
        executeTask(r5);
    }
}