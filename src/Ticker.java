import java.util.concurrent.TimeUnit;

/**
 * Simple utility class to measure time intervals.
 *
 * @author kovrik
 */
public class Ticker {

    private long lastTick;

    public Ticker() {
        this.lastTick = System.nanoTime(); // NOT currentTimeMillis() !
    }

    /**
     * Return elapsed time in MILLISECONDS.
     * @return
     */
    public long tick() {
        return tick(TimeUnit.MILLISECONDS);
    }

    /**
     * Return elapsed time in provided TimeUnit.
     * @param resultTimeUnit
     * @return
     * @throws IllegalArgumentException
     */
    public long tick(TimeUnit resultTimeUnit) throws IllegalArgumentException {
        if (resultTimeUnit == null) {
            throw new IllegalArgumentException("TimeUnit cannot be null!");
        }
        long now  = System.nanoTime();
        long duration = now - lastTick;
        this.lastTick = now;
        return resultTimeUnit.convert(duration, TimeUnit.NANOSECONDS);
    }

    @Override
    public String toString() {
        return "Ticker{" + "lastTick=" + lastTick + '}';
    }
}
