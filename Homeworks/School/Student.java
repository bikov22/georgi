public class Student extends Person {
    public int points;
    public int money;

    public Student() {
        super("Student");
    }
    public void addPoints(int points){
        this.points += points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
