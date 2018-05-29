package com.android.bignerdranch.android.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius) {
        this.location = location;
        this.celsius = celsius;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
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