package intercom.data;

import com.google.gson.annotations.SerializedName;

public class Customer {
    private double latitude;
    private double longitude;

    @SerializedName(value = "user_id")
    private int userId;
    private String name;

    public Customer(double latitude, double longitude, int userId, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.userId = userId;
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromIntercom() {
        return Distance.calculateGreatCircleDistance(latitude, longitude, Distance.INTERCOM_LAT, Distance.INTERCOM_LON);
    }
}
