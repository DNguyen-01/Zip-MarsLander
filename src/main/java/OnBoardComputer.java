import java.util.concurrent.TimeUnit;

public class OnBoardComputer implements BurnStream {


//    Hint: `a = (speed * speed)/(2 * altitude)`



    @Override
    public int getNextBurn(DescentEvent status) throws InterruptedException {
        int burn = 0;
        if(status.getAltitude() <= 20000 && status.getVelocity() > 200) {
            burn = 200;
        }else{
            if(status.getAltitude() <= 1000 && status.getVelocity() > 100){
                burn = 100;
            }

        }

        
        System.out.println(burn); /*hack!*/
        TimeUnit.SECONDS.sleep(1);
        System.out.println(burn);
        return burn;
    }

}
