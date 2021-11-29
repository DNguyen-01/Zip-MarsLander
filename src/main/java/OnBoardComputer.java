import java.util.concurrent.TimeUnit;

public class OnBoardComputer implements BurnStream {


//    Hint: `a = (speed * speed)/(2 * altitude)`
    // if current altitude > 10000 = maintain velocity
    // if current altitude > 3000 || current altitude > 1000
        //reduce velocity between 10-20 m/s
    //once current altitude >= 1000
        //reduce velocity to between 5-10 m/s
    //current altitude >= 300
        //reduce velocity to 2-3 m/s


    @Override
    public int getNextBurn(DescentEvent status) throws InterruptedException {
        int burn = 0;

        if(status.getAltitude() < 12000 && status.getVelocity() > 1000) {
            burn = 200;
        }if(status.getAltitude() < 10000 && status.getVelocity() > 1000) {
            burn = 150;
        }if(status.getAltitude() < 8000 && status.getVelocity() > 200){
            burn = 200;
        }if(status.getAltitude() < 5000 && status.getVelocity() < 100){
            burn = 250;
        }




        System.out.println(burn); /*hack!*/
        TimeUnit.SECONDS.sleep(1);
        System.out.println(burn);
        return burn;

    }

}
