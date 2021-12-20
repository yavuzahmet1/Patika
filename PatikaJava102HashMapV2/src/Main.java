import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> country=new HashMap<>();
        country.put("TR","Türkiye");
        country.put("USA","Amerika Birleşik Devletleri");
        country.put("BAE","Birleşik Arap Emirlikleri");
        country.put("UK","Birleşik Krallık");
        System.out.println(country.get("USA"));
        System.out.println(country.size());
        country.remove("USA");
        System.out.println(country.size());
        for (String key: country.keySet()){
            System.out.println(key);
        }
        for (String values: country.values()){
            System.out.println(values);
        }
    }
}
