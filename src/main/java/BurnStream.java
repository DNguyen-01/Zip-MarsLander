public interface BurnStream {
    int getNextBurn(DescentEvent status) throws InterruptedException;
}
