import java.util.concurrent.TimeUnit;

public class OnBoardComputer implements BurnStream {


//    Hint: `a = (speed * speed)/(2 * altitude)`



    @Override
    public int getNextBurn(DescentEvent status) throws InterruptedException {
        int burn = 0;
        if(status.getAltitude() < 20000 && status.getVelocity() > 10)
            burn = 200;
        
        System.out.println(burn); /*hack!*/
        TimeUnit.SECONDS.sleep(1);
        System.out.println(burn);
        return burn;
    }

}
