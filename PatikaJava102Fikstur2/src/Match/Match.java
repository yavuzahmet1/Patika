package Match;

import Team.Team;

public class Match {
    private Team team1;
    private Team team2;
    public Match(Team team1, Team team2){
        this.team1 = team1;
        this.team2 = team2;
    }


    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    @Override
    public String toString() {
        return this.team1 + " vs " + this.team2;
    }
}
