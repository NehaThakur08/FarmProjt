package com.neha.farmingproject.ui;
import android.graphics.Bitmap;
import com.neha.farmingproject.model.WeatherData;

public interface MainFragmentView {

    void showProgress();
    void hideProgress();
    void checkSharedPrefs();
    void updateViews(WeatherData weatherData);
    void setImage(Bitmap responseObject);
}
