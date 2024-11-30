public class Tiger extends Animal implements Walk {


    public Tiger(){
        super("Tiger");
    }
    private int numberOfStripes, speed, roar;


    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return roar;
    }

    public void setSoundLevel(int roar) {
        this.roar = roar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + getSpeed());

    }
}
