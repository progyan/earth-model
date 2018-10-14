import java.util.ArrayList;

public class World {
    public static void main(String[] args){
        ArrayList<Continent> continents = new ArrayList<Continent>();
        ArrayList<Human> continentHumans;
        String[] continentNames = {"Europe", "Asia", "Antarctica", "North America", "South America", "Africa", "Australia"};
        int[] continentPopulation = {739, 4436, 1, 579, 423, 1216, 40};
        for (int i = 0; i < 7; i++) {
            continentHumans = new ArrayList<>();
            for (int j = 0; j < continentPopulation[i]; j++) {
                continentHumans.add(new Human("Human"));
            }
            continents.add(new Continent(continentNames[i], continentHumans));
            System.out.println("Continent named " + continents.get(i).getName() + ": " + continents.get(i) + ", its population equals to " + continents.get(i).getPopulation() + " humans.");
        }
        Earth earth = new Earth(continents);
    }
}
