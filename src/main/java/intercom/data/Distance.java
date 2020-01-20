package intercom.data;


public class Distance {
    final static double EARTH_RADIUS = 6371;
    final static double INTERCOM_LAT = 37.788802;
    final static double INTERCOM_LON = -122.4025067;

    public static double calculateGreatCircleDistance(double lat1, double lon1, double lat2, double lon2) {
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        double deltaA = Math.acos(Math.sin(lat1Rad)*Math.sin(lat2Rad) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.cos(Math.abs(lon1Rad - lon2Rad)));
        return deltaA * EARTH_RADIUS;
    }
}
