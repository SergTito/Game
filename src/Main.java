public class Main {
    public static void main(String[] args) {

        TypeOfMotorsport formula1 = new Formula_1("Формула-1");
        TypeOfMotorsport circuitRacing = new CircuitRacing("Кольцевые гонки");
        Pilot pilot1 = new Pilot("Sergey","Titanyan");
        Team teamF1  = new Team("Гончи F1");
        teamF1.addNewPilot(pilot1,formula1);


    }
}