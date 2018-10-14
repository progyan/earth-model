public class Human {
    public boolean died;
    private String name;
    private int thingsCanDo;

    public Human(String name){
        this.name = name;
        this.thingsCanDo = Integer.parseInt(Long.toString(Math.round((Math.random() * 10) + 10)));
    }

    public String getName(){
        if(!this.died)
            return this.name;
        else
            return null;
    }

    public void die(){
         this.died = true;
    }
}
