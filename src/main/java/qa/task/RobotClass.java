package qa.task;

public class RobotClass implements Robot {

    @Override
    public void clean() {

    }
    @Override
    public void charge() {

    }

    @Override
    public boolean step() {
        return Math.random() < 0.6;
    }
}
