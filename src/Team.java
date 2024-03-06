import java.util.ArrayList;
import java.util.List;

public class Team {

    private final String name;
    private final List<Pilot> pilot = new ArrayList<>();
    private final List<TypeOfMotorsport> type = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewPilot(Pilot p, TypeOfMotorsport t) {
        pilot.add(p);
        type.add(t);
        System.out.println("По дистанции " + t.getNameOfType() + " В команду гоншиков " + getName() +
                " добавлен новый пилот " + p.toString());
    }

    public String getName() {
        return "'"+name+"'";

    }
}
