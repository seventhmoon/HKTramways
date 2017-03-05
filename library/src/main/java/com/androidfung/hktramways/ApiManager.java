package com.androidfung.hktramways;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by fung on 3/4/2017.
 */

public class ApiManager {


    private final String API_BASE_URL = "https://www.hktramways.com/";
//    private Retrofit mRetrofit;
    private TramwaysService mTramwayService;

    public ApiManager(){


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        mTramwayService = retrofit.create(TramwaysService.class);
    }

    public void getEtas(String stopId){
        
        mTramwayService.getEtaList(stopId);
    }
}
