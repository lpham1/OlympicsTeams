import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements OlympicsTeam {
    private String name;

    public CompositeTeam(String name) {
        this.name = name;
        ChildTeams = new ArrayList<OlympicsTeam>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<OlympicsTeam> ChildTeams;

    public List<OlympicsTeam> getChildTeams() {
        return ChildTeams;
    }

    public void setChildTeams(List<OlympicsTeam> childTeams) {
        ChildTeams = childTeams;
    }

    public void addTeam(OlympicsTeam team) {
        ChildTeams.add(team);
    }

    public void removeTeam(OlympicsTeam team) {
        ChildTeams.remove(team);
    }

    @Override
    public void accept(Visitor v) {
        v.visitCompositeTeam(this);
        for (OlympicsTeam team : this.ChildTeams) {
            team.accept(v);
        }

    }

}
