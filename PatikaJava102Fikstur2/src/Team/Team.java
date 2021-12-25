package Team;

public class Team {
    private String teamName;
    private int score;
    public Team(String teamName){
        this.teamName = teamName;
        this.score = 0;
    }
    public void addScore(int score){
        this.score += score;
    }

    public void setName(String newName){
        this.teamName = newName;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    public String toString(){
        return this.teamName;
    }
}
