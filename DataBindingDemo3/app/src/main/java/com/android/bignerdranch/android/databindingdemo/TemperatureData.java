package com.android.bignerdranch.android.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;
    private String url;

    public TemperatureData(String location, String celsius, String url) {
        this.location = location;
        this.celsius = celsius;
        this.url = url;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(com.android.bignerdranch.android.databindingdemo.BR.url);
    }

    public  void setLocation(String location){
        this.location = location;
        notifyPropertyChanged(com.android.bignerdranch.android.databindingdemo.BR.location);
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(com.android.bignerdranch.android.databindingdemo.BR.celsius);
    }

}