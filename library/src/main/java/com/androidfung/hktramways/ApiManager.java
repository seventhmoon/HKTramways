package com.androidfung.hktramways;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by fung on 3/4/2017.
 */

public class ApiManager {


    private static final String API_BASE_URL = "https://www.hktramways.com/";



    public static TramwaysService getTramwaysService(OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        return retrofit.create(TramwaysService.class);

    }



    public static TramwaysService getTramwaysService(){

        return getTramwaysService(new OkHttpClient());

    }


}
