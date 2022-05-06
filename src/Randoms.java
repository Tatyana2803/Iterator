import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final int min, max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return random
                        .ints(1, min, max + 1)
                        .findFirst()
                        .getAsInt();
            }
        };
    }
}

