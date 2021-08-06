package com.example.locationhelperx;

import android.location.Location;

public class LocationHelper {
    public static float getDistanceInKM(double startLatitude, double startLongitude, double endtLatitude, double endtLongitude){
        float [] result = new float[0];
        Location.distanceBetween(startLatitude,startLongitude,endtLatitude,endtLongitude,result);

        return result[0] / 1000;
    }
}
