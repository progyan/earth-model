import java.util.ArrayList;

public class World {
    public static void main(String[] args){
        ArrayList<Continent> continents = new ArrayList<Continent>();
        for(int i = 0; i < 7; i++)
            continents.add(new Continent());
        Earth earth = new Earth(continents);
    }
}
