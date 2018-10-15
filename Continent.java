import java.util.ArrayList;

public class Continent {
    private String name;
    private long population;
    private ArrayList<Human> humans;

    public Continent(String name, ArrayList<Human> humans) throws InterruptedException{
        this.name = name;
        this.population = humans.size();
        this.humans = humans;
        iterate();
    }

    public String getName() {
        return name;
    }

    public void iterateNTimes(int n) throws InterruptedException {
        for(int i = 0; i < n; i++){
            iterate();
        }
    }

    public long getPopulation() {
        return population;
    }

    public ArrayList getHumans() {
        return humans;
    }

    private void iterate() throws InterruptedException{
        ArrayList<Human> humansToAdd = new ArrayList<Human>();
        for(Human human : humans){
            if(Math.random() > 0.25)
                humansToAdd.add(human.mother());
        }
        humans.addAll(humansToAdd);
        Thread.sleep(100);
    }
}
