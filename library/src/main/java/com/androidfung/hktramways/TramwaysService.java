package com.androidfung.hktramways;

import com.androidfung.hktramways.model.Eta;
import com.androidfung.hktramways.model.Metadata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by fung on 3/4/2017.
 */

public interface TramwaysService {

    @GET("nextTram/geteat.php")
    Call<Eta> getEtaList(@Query("stop_code") String stopCode);

    @GET("nextTram/geteat.php?stop_code=16W")
    Call<Eta> getEtaList();
}
