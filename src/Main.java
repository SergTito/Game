public class Main {
    public static void main(String[] args) {
        TypeOfMotorsport formula1 = new Formula_1("Формула-1");
        TypeOfMotorsport circuitRacing = new CircuitRacing("Кольцевые гонки");
        TypeOfMotorsport rallyRacing = new RallyRacing("Ралли");

        Pilot pilotF1_1 = new Pilot("Sergey","Titanyan");
        Pilot pilotF1_2 = new Pilot("Oleg","Jukov");

        Pilot pilotRallyRacing1 = new Pilot("Ivan","Ivanov");
        Pilot pilotRallyRacing2 = new Pilot("Anna","Bagirova");

        Pilot pilotCircuitRacing1 = new Pilot("Jenya","Mahmedov");
        Pilot pilotCircuitRacing2 = new Pilot("Anastasia","Likova");

        Team teamF1_1 = new Team("Ferrari Team Formula-1");
        teamF1_1.addNewPilot(pilotF1_1,formula1);
        teamF1_1.addNewPilot(pilotF1_2,formula1);

        Team teamCircuitRacing1 = new Team("Ford Team Circuit");
        teamCircuitRacing1.addNewPilot(pilotCircuitRacing1,circuitRacing);
        teamCircuitRacing1.addNewPilot(pilotCircuitRacing2,circuitRacing);

        Team teamRallyRacing1 = new Team("Toyota Team Rally");
        teamRallyRacing1.addNewPilot(pilotRallyRacing1,rallyRacing);
        teamRallyRacing1.addNewPilot(pilotRallyRacing2,rallyRacing);

        Car car = new Car_Formula1("Buggati",450,1500);
        car.addPilotToTheCar(pilotF1_1,pilotF1_2,car);


    }
}