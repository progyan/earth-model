import java.util.ArrayList;

public class World {
    public static void main(String[] args){
        ArrayList<Continent> continents = new ArrayList<Continent>();
        ArrayList<Human> continentHumans;
        String[] continentNames = {"Europe", "Asia", "Antarctica", "North America", "South America", "Africa", "Australia"};
        for (int i = 0; i < 7; i++) {
            continentHumans = new ArrayList<>();
            for (int j = 0; j < 1000; j++) {
                continentHumans.add(new Human("Human"));
            }
            continents.add(new Continent(continentNames[i], continentHumans));
            System.out.println("Continent named " + continents.get(i).getName() + ": " + continents.get(i));
        }
        Earth earth = new Earth(continents);
    }
}
