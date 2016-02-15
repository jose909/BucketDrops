package com.example.jose.bucketdrops;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by jose on 15/2/2016.
 */
public class AppBucketDrops extends Application {
	@Override
	public void onCreate(){
		super.onCreate();
		RealmConfiguration configuration = new RealmConfiguration.Builder(this).build();
		Realm.setDefaultConfiguration(configuration);
	}
}
