package com.example.gatetes.Clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Weight {

    @SerializedName("imperial")
    @Expose
    private String imperial;
    @SerializedName("metric")
    @Expose
    private String metric;


    public Weight(String imperial, String metric) {
        super();
        this.imperial = imperial;
        this.metric = metric;
    }

    public String getImperial() {
        return imperial;
    }

    public void setImperial(String imperial) {
        this.imperial = imperial;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

}
