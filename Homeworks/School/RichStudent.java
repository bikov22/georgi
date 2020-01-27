public class RichStudent extends Person{
    public int points;
    public int money;

    public RichStudent() {
        super("RichStudent");
    }

    public void addPoints(int points){
        this.points += points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
