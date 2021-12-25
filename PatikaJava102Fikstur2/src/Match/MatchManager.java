package Match;

import Team.Team;
import Team.TeamManager;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MatchManager {
    private TeamManager teams;
    private Set<Round> rounds;
    public MatchManager(TeamManager teams){
        this.teams = teams;
        this.rounds = new TreeSet<>();
        if (teams.getSize() % 2 != 0){
            teams.addTeam(new Team("bay"));
        }
    }
    public void calculateAllRounds(){
        /*
            2 takım 2 roundda bitirir
            4 takım 6 roundda bitirir
            6 takım 1o roundda bitirir
            Formul:
         */
        int matchamount = 0;
        for (int i = teams.getSize() - 1; i >= 1; i--){
            matchamount += i;
        }
        matchamount *= 2; //2 matches per team

        int roundAmount = matchamount / (teams.getSize()/2);

        for (int i = 1; i <= roundAmount; i++){
            calculateRound(i);
        }
    }

    public void printAllRounds(){
        calculateAllRounds();
        System.out.println("Tüm maçlar hesaplanıldı...");
        for (Round r : rounds){
            System.out.println(r);
        }
    }

    public Round calculateRound(int round){
        Round currentRound = new Round(round);
        Set<Team> tempTeams = new HashSet<>();
        tempTeams.addAll(teams.getTeams());

        Set<Match> allMatches = getAllMatches();

        while (!tempTeams.isEmpty()){
            Team t1 = teams.getRandomTeam(tempTeams);
            tempTeams.remove(t1);
            Team t2;
            do{
                t2 = teams.getRandomTeam(tempTeams);
            } while (allMatches.contains(t2));
            tempTeams.remove(t2);
            currentRound.addMatch(new Match(t1, t2));
        }
        rounds.add(currentRound);
        return currentRound;
    }

    public Set<Match> getAllMatches(){
        Set<Match> result = new HashSet<>();
        for (Round r : rounds){
            result.addAll(r.getMatches());
        }
        return result;
    }


    public TeamManager getTeams() {
        return teams;
    }
}
