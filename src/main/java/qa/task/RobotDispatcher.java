package qa.task;

public class RobotDispatcher {
   public int actualIndex = 0;
    public int chargeNumber = 10;
    public int errorAttempts = 0;

    public void stepUp(Robot robot, int stepIndex) {

        while (actualIndex < stepIndex) {
            if(chargeNumber < 1) {
                robot.charge();
                chargeNumber = chargeNumber + 1;
            }
            chargeNumber = chargeNumber - 1 ;
            if(errorAttempts == 2) {
                robot.clean();
                errorAttempts = 0;
            }
            boolean resultStep = robot.step();
            if (resultStep) {
                errorAttempts = 0;
                actualIndex = actualIndex + 1;
            } else {
                errorAttempts = errorAttempts + 1;
                if (actualIndex > 0) {
                    actualIndex = actualIndex - 1;
                } else {
                    actualIndex = 0;
                }
            }
        }
    }



    }


