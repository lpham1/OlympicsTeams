public class App {
    public static void main(String[] args) throws Exception {
        // create some teams
        CompositeTeam OlympicsTeam = new CompositeTeam("Olympics Teams");
        CompositeTeam AsiaTeam = new CompositeTeam("Asia Team");
        CompositeTeam ChinaTeam = new CompositeTeam("China Team");
        CompositeTeam AfgTeam = new CompositeTeam("Afghanistan Team");
        CompositeTeam EuropeTeam = new CompositeTeam("Europe Team");
        CompositeTeam AfricaTeam = new CompositeTeam("Africa Team");
        CompositeTeam SouthAmericaTeam = new CompositeTeam("South America Team");

        // add teams to olympics team
        OlympicsTeam.addTeam(AsiaTeam);
        OlympicsTeam.addTeam(EuropeTeam);
        OlympicsTeam.addTeam(AfricaTeam);
        OlympicsTeam.addTeam(SouthAmericaTeam);
        // add china and afg teams to asia-teams
        AsiaTeam.addTeam(ChinaTeam);
        AsiaTeam.addTeam(AfgTeam);

        CompositeTeam ChinaWomen = new CompositeTeam("China-Women");
        CompositeTeam ChinaMen = new CompositeTeam("China-Men");

        // add 2 teams to china-team
        ChinaTeam.addTeam(ChinaWomen);
        ChinaTeam.addTeam(ChinaMen);

        ChildTeam WomenTeakwondo = new ChildTeam("China-Women-Taekwondo", 10, 3);
        ChildTeam WomenWaterpolo = new ChildTeam("China-Women-Waterpolo", 7, 5);
        ChildTeam WomenGymnastic = new ChildTeam("China-Women-Gymnastics", 12, 4);
        // add teams to china-women-team
        ChinaWomen.addTeam(WomenTeakwondo);
        ChinaWomen.addTeam(WomenWaterpolo);
        ChinaWomen.addTeam(WomenGymnastic);

        ChildTeam MenSchooting = new ChildTeam("China-Men-Shooting", 8, 4);
        // add teams to china-men-team
        ChinaMen.addTeam(MenSchooting);

        CompositeTeam GermanyTeam = new CompositeTeam("Germany Team");
        CompositeTeam ItalyTeam = new CompositeTeam("Germany Team");

        // add teams to Europe team
        EuropeTeam.addTeam(GermanyTeam);
        EuropeTeam.addTeam(ItalyTeam);

        CompositeTeam GerWomen = new CompositeTeam("Germany-Women");
        CompositeTeam GerMen = new CompositeTeam("Germany-Men");

        GermanyTeam.addTeam(GerWomen);
        GermanyTeam.addTeam(GerMen);
        
        ChildTeam WomenCycling = new ChildTeam("Germany-Women-Cycling", 10, 3);
        ChildTeam WomenTennis = new ChildTeam("Germany-Women-Tennis", 7, 5);
        ChildTeam menTableTennisTeam = new ChildTeam("Germany-Men-Table-tennis", 12, 4);
        ChildTeam menFootballTeam = new ChildTeam("Germany-Men-Football", 12, 4);

        //add teams to germany-women-team
        GerWomen.addTeam(WomenCycling);
        GerWomen.addTeam(WomenTennis);

        //add teams to germany-men-team
        GerMen.addTeam(menTableTennisTeam);
        GerMen.addTeam(menFootballTeam);

        //create a visitor that prints the infos of teams
        Visitor v1 = new NameAndAthletePrinter();
        Visitor v2 = new NameAndMedalsPrinter();

        //task a
        System.out.println("Task a");
        GerMen.accept(v1);
        // task b
        System.out.println("Task b");
        GermanyTeam.accept(v2);
        // task c
        System.out.println("Task c");
        AsiaTeam.accept(v1);
        //task d
        System.out.println("Task d");
        OlympicsTeam.accept(v1);

    }
}
