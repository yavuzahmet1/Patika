import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {

        ArrayList<FootballTeam> teams=new ArrayList<>();
        teams.add(new FootballTeam("Fenerbahçe"));
        teams.add(new FootballTeam("Galatasaray"));
        teams.add(new FootballTeam("Adana Demirspor"));
        teams.add(new FootballTeam("Adanaspor"));
        teams.add(new FootballTeam("Beşiktaş"));
        teams.get(0);
        System.out.println("aaa"+teams.get(3));

        for (FootballTeam t:teams){
            System.out.println(t.getTeamName());

        }
        System.out.println("**************");
        System.out.println(teams.size());




    }
}
