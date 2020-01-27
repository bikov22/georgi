public class Professor extends Person{
    public int points;
    public int money;

    public Professor() {
        super("Professor");
    }


    public void addPoints(int points){
        this.points += points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
