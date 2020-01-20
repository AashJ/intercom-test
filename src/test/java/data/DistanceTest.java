package data;

import intercom.data.Distance;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DistanceTest {
    @Test
    public void calculateDistanceZero() {
        double dist = Distance.calculateGreatCircleDistance(0, 0, 0, 0);
        assertEquals(0.0, dist);
    }

    @Test
    public void calculateDistance() {
        double dist = Distance.calculateGreatCircleDistance(37.788802, -122.4025067, 36.986375, 35.92893);
        assertEquals(11407.66, dist, 0.1);
    }
}
