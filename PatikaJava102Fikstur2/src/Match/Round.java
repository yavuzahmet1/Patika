package Match;

import java.util.HashSet;
import java.util.Set;

public class Round implements Comparable<Round>{

    private int round;
    private Set<Match> matches;

    public Round(int round, Match ... matches){
        this.round = round;
        this.matches = new HashSet<>();
        for (Match m : matches){
            this.matches.add(m);
        }
    }

    @Override
    public String toString(){
        return "Round " + this.round + "\n" + getMatchesAsString();
    }

    public void addMatch(Match match){
        matches.add(match);
    }




    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Set<Match> getMatches() {
        return matches;
    }

    public String getMatchesAsString(){
        String result = "";
        for (Match m : matches){
            result += m + "\n";
        }
        return result;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }

    @Override
    public int compareTo(Round compareTo) {
        return this.round > compareTo.getRound() ? 1 : -1;
    }
}
