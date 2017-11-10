package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017/11/8.
 */

public class Suggestion {
    public Comfort comf;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        public String txt;
    }
    public class CarWash{
        public String txt;
    }
    public class Sport{
        public String txt;
    }
}
