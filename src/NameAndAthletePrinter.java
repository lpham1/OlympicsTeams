public class NameAndAthletePrinter implements Visitor{

    @Override
    public void visitCompositeTeam(CompositeTeam e) {
        // TODO Auto-generated method stub
        String info = "Team: " + e.getName();
        System.out.println(info);
        
    }

    @Override
    public void visitChildTeam(ChildTeam e) {
        // TODO Auto-generated method stub
        String info = "Team: " + e.getName() + ". Number of Athletes: " + e.getNrOfAthletes();
        System.out.println(info);
    }
    
}
