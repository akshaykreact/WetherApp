package com.test.wetherapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.test.wetherapp.constent.AppConstant;
import com.test.wetherapp.remote.model.Region1;
import com.test.wetherapp.remote.repository.WeatherRepository;


public class WeatherViewModel extends AndroidViewModel {

    private final WeatherRepository weatherRepository;
    private LiveData<Region1> weatherResponseLiveData;

    public WeatherViewModel(@NonNull Application application) {
        super(application);

        weatherRepository = new WeatherRepository();

    }

    public void getWeatherDetailsFromServer(String mRegionName) {
        this.weatherResponseLiveData = weatherRepository.getWeatherDetails(mRegionName, "metric", AppConstant.API_KEY);
    }

    public LiveData<Region1> getWeatherResponseLiveData() {
        return weatherResponseLiveData;
    }

}
