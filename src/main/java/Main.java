import qa.task.RobotClass;
import qa.task.RobotDispatcher;

public class Main {
    public static void main(String[] args) {
        RobotDispatcher yellowRobotDispatcher = new RobotDispatcher();
        RobotClass vasyaVasya = new RobotClass();
        yellowRobotDispatcher.stepUp(vasyaVasya,5);
    }
}
