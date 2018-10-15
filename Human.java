public class Human {
    public boolean died;
    private String name;
    private int thingsCanDo;

    public Human(String name){
        this.name = name;
        this.thingsCanDo = Integer.parseInt(Long.toString(Math.round((Math.random() * 10) + 10)));
    }

    public String getName(){
        return this.name;
    }
    
    public Human mother(){
        return new Human("Human");
    }
}
