package com.android.bignerdranch.android.databindingdemo;

public interface MainActivityContract {
    interface Presenter {
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    interface View {
        void showData(TemperatureData temperatureData);
    }

}