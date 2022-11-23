public class ChildTeam implements OlympicsTeam {
    private String name;
    private int nrOfAthletes, nrOfGoldMedals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfAthletes() {
        return nrOfAthletes;
    }

    public void setNrOfAthletes(int nrOfAthletes) {
        this.nrOfAthletes = nrOfAthletes;
    }

    public int getNrOfGoldMedals() {
        return nrOfGoldMedals;
    }

    public void setNrOfGoldMedals(int nrOfGoldMedals) {
        this.nrOfGoldMedals = nrOfGoldMedals;
    }

    public ChildTeam(String name, int x, int y){
        this.name= name;
        this.nrOfAthletes=x;
        this.nrOfGoldMedals=y;
}

    @Override
    public void accept(Visitor v) {
        // TODO Auto-generated method stub
        v.visitChildTeam(this);
    }


    
}
