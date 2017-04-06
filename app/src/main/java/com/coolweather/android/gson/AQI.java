package com.coolweather.android.gson;

/**
 * Created by OPP on 2017/4/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
