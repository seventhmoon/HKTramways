# HKTramways-Android
Library using Retrofit2 to obtain the ETA of the Hong Kong Tramways.

[![Build Status](https://travis-ci.org/seventhmoon/HKTramways-Android.svg?branch=master)](https://travis-ci.org/seventhmoon/HKTramways-Android)
[![](https://jitpack.io/v/seventhmoon/HKTramways-Android.svg)](https://jitpack.io/#seventhmoon/HKTramways-Android)


## How-to
        TramwaysService tramwaysService = ApiManager.getTramwaysService();
        Call<Eta> call = tramwaysService.getEtaList(TramwaysService.STOP_EAST_KTT); //Getting the ETA for Stop KTT
        call.enqueue(new Callback<Eta>() {
            @Override
            public void onResponse(Call<Eta> call, Response<Eta> response) {
                List<Metadata> etas = response.body().getMetadata(); //Obtain the ETA of Trams
                ((TextView) findViewById(com.androidfung.hktramways.app.R.id.text_view)).setText(etas==null?"No Info":etas.toString());
            }

            @Override
            public void onFailure(Call<Eta> call, Throwable t) {
                Log.d(TAG, t.toString());
            }
        });
