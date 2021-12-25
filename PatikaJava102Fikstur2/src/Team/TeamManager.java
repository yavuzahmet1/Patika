package Team;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TeamManager {
    Set<Team> teams;
    public TeamManager(){
        teams = new HashSet<>();
        Scanner klavye = new Scanner(System.in);
        System.out.println("Takımlar");
        String satir = "";
        while (true){
            System.out.print("- ");
            satir = klavye.nextLine();
            if (satir.equals(".")){
                break;
            }
            teams.add(new Team(satir));
        }
    }

    public Set<Team> getTeams(){
        return this.teams;
    }


    public Team getRandomTeam(){
        if (this.teams.size() == 0){
            return null;
        }
        int randomTeam = (int)(Math.random() * (this.teams.size() - 1));
        return (Team) this.teams.toArray()[randomTeam];
    }

    public Team getRandomTeam(Set<Team> teams){
        if (teams.size() == 0){
            return null;
        }
        int randomTeam = (int)(Math.random() * (teams.size() - 1));
        return (Team) teams.toArray()[randomTeam];
    }


    public int getSize(){
        return this.teams.size();
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }

    public void printTeams(Set<Team> teams){
        for (Team t : teams){
            System.out.println(t);
        }
    }
    public void printTeams(){
        for (Team t : this.teams){
            System.out.println(t);
        }
    }
}
