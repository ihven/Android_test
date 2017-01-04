/**
 * Created by admin on 04.01.2017.
 */
import java.util.concurrent.*;

public class RGB implements Comparable<RGB> {
    private static final short VALID_VALUES[] = {0, 51, 102, 153, 204, 255, 306, 357, 408};

    private short r;
    private short g;
    private short b;

    public RGB() {
        int index ;
        r = VALID_VALUES[Main.count];
        index = ThreadLocalRandom.current().nextInt(0, VALID_VALUES.length);
        g = VALID_VALUES[index];
        b = VALID_VALUES[8-Main.count];
        Main.count++;
    }

    @Override
    public int compareTo(RGB other) {
        if ((this.r > other.r) && (this.b <= other.b)) return 1;
        if ((this.r < other.r) && (this.b >= other.b)) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "RGB: {" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
