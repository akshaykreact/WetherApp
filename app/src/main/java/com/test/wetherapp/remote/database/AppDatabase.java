package com.test.wetherapp.remote.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.test.wetherapp.remote.database.model.WeatherCityDao;
import com.test.wetherapp.remote.database.model.WeatherCityModel;


// adding annotation for our database entities and db version.
@Database(entities = {WeatherCityModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;
    public static AppDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "weatherappDB")
                    .build();
        }
        return instance;
    }

    public abstract WeatherCityDao weatherCityDao();
}