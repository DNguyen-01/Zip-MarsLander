import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimulationLanding() throws InterruptedException {
        int[] burns = {200, 200, 200, 200, 200, 200, 200, 200, 200,
                100, 100, 100, 100,
                150, 125, 120, 100, 100, 100, 103,
                100, 100, 100, 100};
        BurnStream burnSource = new BurnDataStream(burns);
        Simulation game = new Simulation(new Vehicle(5000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(okay, Vehicle.SUCCESS);
    }

    @Test
    public void runSimulationCrash() throws InterruptedException {
        int[] burns = {0,0,0,0,0};
        BurnStream burnSource = new BurnDataStream(burns);
        Simulation game = new Simulation(new Vehicle(5000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(Vehicle.CRASHED, okay);
    }

    @Test
    public void runSimulationComputer() throws InterruptedException {
        BurnStream burnSource = new OnBoardComputer();
        Simulation game = new Simulation(new Vehicle(10000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(okay, Vehicle.SUCCESS);
    }

    @Test
    public void runSimulationComputerRandom() throws InterruptedException {
        BurnStream burnSource = new OnBoardComputer();
        Simulation game = new Simulation(new Vehicle(Simulation.randomAltitude()));
        //Simulation game = new Simulation(new Vehicle(15000));
        int okay = game.runSimulation(burnSource);
        Assert.assertEquals(okay, Vehicle.SUCCESS);
    }

}