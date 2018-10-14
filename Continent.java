import java.util.ArrayList;

public class Continent {
    private String name;
    private long population;
    private ArrayList humans = new ArrayList();
    
    public Continent(String name, ArrayList<Human> humans){
        this.name = name;
        this.population = humans.size();
        this.humans = humans;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public ArrayList getHumans() {
        return humans;
    }
}
