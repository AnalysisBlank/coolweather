package com.example.yao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yao on 2017/11/2.
 */

public class ForeCast {

    public String data;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
