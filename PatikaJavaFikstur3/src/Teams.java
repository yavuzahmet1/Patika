public class Teams {
    private String teamName;
    private int teamPuan;
    private int teamWin;
    private int teamDefeat;
    private int teamDraw;
    private String[] rounds;

    public Teams(String teamName,int teamPuan, int teamWin,int teamDefeat,int teamDraw){
        this.teamName=teamName;
        this.teamPuan=teamPuan;
        this.teamWin=teamWin;
        this.teamDefeat=teamDefeat;
        this.teamDraw=teamDraw;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamPuan() {
        return teamPuan;
    }

    public void setTeamPuan(int teamPuan) {
        this.teamPuan = teamPuan;
    }

    public int getTeamWin() {
        return teamWin;
    }

    public void setTeamWin(int teamWin) {
        this.teamWin = teamWin;
    }

    public int getTeamDefeat() {
        return teamDefeat;
    }

    public void setTeamDefeat(int teamDefeat) {
        this.teamDefeat = teamDefeat;
    }

    public int getTeamDraw() {
        return teamDraw;
    }

    public void setTeamDraw(int teamDraw) {
        this.teamDraw = teamDraw;
    }

    public String[] getRounds() {
        return rounds;
    }

    public void setRounds(String[] rounds) {
        this.rounds = rounds;
    }
}
