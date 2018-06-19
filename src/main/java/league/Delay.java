package league;

public class Delay {
    public Delay() {
    }

    public void setDelay(){                     //method timeout for game
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }
}
