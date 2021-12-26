import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Teams> teamList = new ArrayList<>();
        teamList.add(new Teams("Fenerbahçe", 0, 0, 0, 0));
        teamList.add(new Teams("Beşiktaş", 0, 0, 0, 0));
        teamList.add(new Teams("Galatasaray", 0, 0, 0, 0));
        teamList.add(new Teams("Trabzonspor", 0, 0, 0, 0));
        teamList.add(new Teams("Adana Spor", 0, 0, 0, 0));
        teamList.add(new Teams("Adana Demir Spor", 0, 0, 0, 0));
        teamList.add(new Teams("Karabük Spor", 0, 0, 0, 0));
        teamList.add(new Teams("İstanbul Spor", 0, 0, 0, 0));
        teamList.add(new Teams("Konya Spor", 0, 0, 0, 0));

        System.out.println("Çift Takım Senaryosu");
        System.out.println("####################");
        Fikstur fikstur = new Fikstur(teamList);
        fikstur.fiksturCek();
        fikstur.fiksturPrint();

        System.out.println("Tek Takım Senaryosu");
        System.out.println("###################");
        teamList.add(new Teams("Kayseri Spor", 0, 0, 0, 0));
        teamList.add(new Teams("BAY", 0, 0, 0, 0));
        Fikstur fikstur1 = new Fikstur(teamList);
        fikstur1.fiksturCek();
        fikstur1.fiksturPrint();
    }
}
