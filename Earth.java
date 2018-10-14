import java.util.ArrayList;

public class Earth {
    private ArrayList<Continent> continents;

    public Earth(ArrayList<Continent> continents){
        this.continents = continents;
    }

    public ArrayList<Continent> getContinents(){
        return this.continents;
    }
}
