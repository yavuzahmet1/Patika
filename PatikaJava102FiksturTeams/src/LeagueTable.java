import java.util.ArrayList;
import java.util.List;

public class LeagueTable {
    private List<FootballTeam> footballTeams;
    private int teamSize;
    private ArrayList<ArrayList<String>> round;

    public LeagueTable(List<FootballTeam> footballTeams){
        this.footballTeams=footballTeams;
        this.teamSize=footballTeams.size();
    }
    public List<FootballTeam> getFootballTeams(){
        return this.footballTeams;
    }
    public void setFootballTeams(List<FootballTeam> footballTeams){
        this.footballTeams=footballTeams;
    }
}
