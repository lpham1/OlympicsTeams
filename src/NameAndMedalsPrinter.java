public class NameAndMedalsPrinter implements Visitor{

    @Override
    public void visitCompositeTeam(CompositeTeam e) {
        // TODO Auto-generated method stub
        String info = "Team: " + e.getName();
        System.out.println(info);
    }

    @Override
    public void visitChildTeam(ChildTeam e) {
        // TODO Auto-generated method stub
        String info = "Team: " + e.getName() + ". Number of Gold Medals: " + e.getNrOfGoldMedals();
        System.out.println(info);
    }
    
}
