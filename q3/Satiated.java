package q3;

public class Satiated implements HungerState {

    @Override
    public void doAction(Fish swimi) {
        swimi.setState(this);
    }

    @Override
    public String toString() {
        return "Satiated";
    }

}
