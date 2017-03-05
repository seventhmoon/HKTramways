package com.androidfung.hktramways;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.androidfung.hktramways.model.Eta;
import com.androidfung.hktramways.model.Metadata;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.util.List;
import com.androidfung.hktramways.app.R;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class BasicActivity extends AppCompatActivity {
    private final String TAG = BasicActivity.class.getSimpleName();
    private final String API_BASE_URL = "https://www.hktramways.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendRequest();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        sendRequest();
    }

    private void sendRequest(){
        OkHttpClient client = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor()).build();


        TramwaysService tramwaysService = ApiManager.getTramwaysService(client);

//        try {
        Call<Eta> call = tramwaysService.getEtaList("KTT");
        call.enqueue(new Callback<Eta>() {
            @Override
            public void onResponse(Call<Eta> call, Response<Eta> response) {
//                Log.d(TAG, call.toString());
                Log.d(TAG, response.toString());
                List<Metadata> etas = response.body().getMetadata();

                ((TextView) findViewById(com.androidfung.hktramways.app.R.id.text_view)).setText(etas==null?"No Info":etas.toString());
            }

            @Override
            public void onFailure(Call<Eta> call, Throwable t) {
                Log.d(TAG, t.toString());

            }
        });

    }
}
