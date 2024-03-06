import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private final String name;
    private final int maxSpeed;
    private final double maxKg;
    private final List<Pilot> pilot = new ArrayList<>();
    private final List<Car> car = new ArrayList<>();

    public Car(String name, int maxSpeed, double maxKg) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxKg = maxKg;
    }

    public  void addPilotToTheCar(Pilot p1,Pilot p2, Car c){
        car.add(c);
        pilot.add(p1);
        pilot.add(p2);
        System.out.println("В машине " +c.getName() + "Сидят "+ p1.toString()+p2.toString());
    }




    public String getName() {
        return name;
    }

    public double getMaxKg() {
        return maxKg;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
