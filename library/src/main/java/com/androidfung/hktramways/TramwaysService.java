package com.androidfung.hktramways;

import android.support.annotation.StringDef;

import com.androidfung.hktramways.model.Eta;

import java.lang.annotation.Retention;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by fung on 3/4/2017.
 */

public interface TramwaysService {
    @Retention(SOURCE)
    @StringDef({
            STOP_WEST_SKT,
            STOP_WEST_02W,
            STOP_WEST_04W,
            STOP_WEST_06W,
            STOP_WEST_08W,
            STOP_WEST_10W,
            STOP_WEST_12W,
            STOP_WEST_14W,
            STOP_WEST_16W,
            STOP_WEST_18W,
            STOP_WEST_20W,
            STOP_WEST_22W,
            STOP_WEST_24W,
            STOP_WEST_26W,
            STOP_WEST_28W,
            STOP_WEST_30W,
            STOP_WEST_NPT,
            STOP_WEST_32W,
            STOP_WEST_34W,
            STOP_WEST_36W,
            STOP_WEST_38W,
            STOP_WEST_40W,
            STOP_WEST_42W,
            STOP_WEST_44W,
            STOP_WEST_CBT,
            STOP_WEST_46W,
            STOP_WEST_48W,
            STOP_WEST_105,
            STOP_WEST_106,
            STOP_WEST_107,
            STOP_WEST_108,
            STOP_WEST_HVT_K,
            STOP_WEST_109,
            STOP_WEST_110,
            STOP_WEST_111,
            STOP_WEST_112,
            STOP_WEST_50W,
            STOP_WEST_52W,
            STOP_WEST_54W,
            STOP_WEST_56W,
            STOP_WEST_58W,
            STOP_WEST_60W,
            STOP_WEST_62W,
            STOP_WEST_64W,
            STOP_WEST_66W,
            STOP_WEST_68W,
            STOP_WEST_70W,
            STOP_WEST_72W,
            STOP_WEST_74W,
            STOP_WEST_76W,
            STOP_WEST_WM,
            STOP_WEST_78W,
            STOP_WEST_80W,
            STOP_WEST_82W,
            STOP_WEST_84W,
            STOP_WEST_86W,
            STOP_WEST_88W,
            STOP_WEST_90W,
            STOP_WEST_92W,
            STOP_WEST_94W,
            STOP_WEST_96W,
            STOP_WEST_98W,
            STOP_WEST_100W,
            STOP_WEST_102W,
            STOP_WEST_104W,
            STOP_EAST_KTT,
            STOP_EAST_01E,
            STOP_EAST_03E,
            STOP_EAST_05E,
            STOP_EAST_07E,
            STOP_EAST_WST,
            STOP_EAST_09E,
            STOP_EAST_11E,
            STOP_EAST_13E,
            STOP_EAST_15E,
            STOP_EAST_17E,
            STOP_EAST_19E,
            STOP_EAST_WMT,
            STOP_EAST_21E,
            STOP_EAST_23E,
            STOP_EAST_25E,
            STOP_EAST_27E,
            STOP_EAST_29E,
            STOP_EAST_31E,
            STOP_EAST_33E,
            STOP_EAST_35E,
            STOP_EAST_37E,
            STOP_EAST_39E,
            STOP_EAST_41E,
            STOP_EAST_43E,
            STOP_EAST_45E,
            STOP_EAST_47E,
            STOP_EAST_49E,
            STOP_EAST_105,
            STOP_EAST_106,
            STOP_EAST_107,
            STOP_EAST_108,
            STOP_EAST_HVT_B,
            STOP_EAST_109,
            STOP_EAST_110,
            STOP_EAST_111,
            STOP_EAST_112,
            STOP_EAST_51E,
            STOP_EAST_53E,
            STOP_EAST_55E,
            STOP_EAST_57E,
            STOP_EAST_59E,
            STOP_EAST_61E,
            STOP_EAST_63E,
            STOP_EAST_65E,
            STOP_EAST_67E,
            STOP_EAST_69E,
            STOP_EAST_71E,
            STOP_EAST_73E,
            STOP_EAST_75E,
            STOP_EAST_77E,
            STOP_EAST_79E,
            STOP_EAST_81E,
            STOP_EAST_83E,
            STOP_EAST_85E,
            STOP_EAST_87E,
            STOP_EAST_89E,
            STOP_EAST_91E,
            STOP_EAST_93E,
            STOP_EAST_95E,
            STOP_EAST_97E,
            STOP_EAST_99E,
            STOP_EAST_101E,
    })

    public @interface StopCode {
    }
    public static final String STOP_WEST_SKT = "SKT";
    public static final String STOP_WEST_02W = "02W";
    public static final String STOP_WEST_04W = "04W";
    public static final String STOP_WEST_06W = "06W";
    public static final String STOP_WEST_08W = "08W";
    public static final String STOP_WEST_10W = "10W";
    public static final String STOP_WEST_12W = "12W";
    public static final String STOP_WEST_14W = "14W";
    public static final String STOP_WEST_16W = "16W";
    public static final String STOP_WEST_18W = "18W";
    public static final String STOP_WEST_20W = "20W";
    public static final String STOP_WEST_22W = "22W";
    public static final String STOP_WEST_24W = "24W";
    public static final String STOP_WEST_26W = "26W";
    public static final String STOP_WEST_28W = "28W";
    public static final String STOP_WEST_30W = "30W";
    public static final String STOP_WEST_NPT = "NPT";
    public static final String STOP_WEST_32W = "32W";
    public static final String STOP_WEST_34W = "34W";
    public static final String STOP_WEST_36W = "36W";
    public static final String STOP_WEST_38W = "38W";
    public static final String STOP_WEST_40W = "40W";
    public static final String STOP_WEST_42W = "42W";
    public static final String STOP_WEST_44W = "44W";
    public static final String STOP_WEST_CBT = "CBT";
    public static final String STOP_WEST_46W = "46W";
    public static final String STOP_WEST_48W = "48W";
    public static final String STOP_WEST_105 = "105";
    public static final String STOP_WEST_106 = "106";
    public static final String STOP_WEST_107 = "107";
    public static final String STOP_WEST_108 = "108";
    public static final String STOP_WEST_HVT_K = "HVT_K";
    public static final String STOP_WEST_109 = "109";
    public static final String STOP_WEST_110 = "110";
    public static final String STOP_WEST_111 = "111";
    public static final String STOP_WEST_112 = "112";
    public static final String STOP_WEST_50W = "50W";
    public static final String STOP_WEST_52W = "52W";
    public static final String STOP_WEST_54W = "54W";
    public static final String STOP_WEST_56W = "56W";
    public static final String STOP_WEST_58W = "58W";
    public static final String STOP_WEST_60W = "60W";
    public static final String STOP_WEST_62W = "62W";
    public static final String STOP_WEST_64W = "64W";
    public static final String STOP_WEST_66W = "66W";
    public static final String STOP_WEST_68W = "68W";
    public static final String STOP_WEST_70W = "70W";
    public static final String STOP_WEST_72W = "72W";
    public static final String STOP_WEST_74W = "74W";
    public static final String STOP_WEST_76W = "76W";
    public static final String STOP_WEST_WM = "WM";
    public static final String STOP_WEST_78W = "78W";
    public static final String STOP_WEST_80W = "80W";
    public static final String STOP_WEST_82W = "82W";
    public static final String STOP_WEST_84W = "84W";
    public static final String STOP_WEST_86W = "86W";
    public static final String STOP_WEST_88W = "88W";
    public static final String STOP_WEST_90W = "90W";
    public static final String STOP_WEST_92W = "92W";
    public static final String STOP_WEST_94W = "94W";
    public static final String STOP_WEST_96W = "96W";
    public static final String STOP_WEST_98W = "98W";
    public static final String STOP_WEST_100W = "100W";
    public static final String STOP_WEST_102W = "102W";
    public static final String STOP_WEST_104W = "104W";
    public static final String STOP_EAST_KTT = "KTT";
    public static final String STOP_EAST_01E = "01E";
    public static final String STOP_EAST_03E = "03E";
    public static final String STOP_EAST_05E = "05E";
    public static final String STOP_EAST_07E = "07E";
    public static final String STOP_EAST_WST = "WST";
    public static final String STOP_EAST_09E = "09E";
    public static final String STOP_EAST_11E = "11E";
    public static final String STOP_EAST_13E = "13E";
    public static final String STOP_EAST_15E = "15E";
    public static final String STOP_EAST_17E = "17E";
    public static final String STOP_EAST_19E = "19E";
    public static final String STOP_EAST_WMT = "WMT";
    public static final String STOP_EAST_21E = "21E";
    public static final String STOP_EAST_23E = "23E";
    public static final String STOP_EAST_25E = "25E";
    public static final String STOP_EAST_27E = "27E";
    public static final String STOP_EAST_29E = "29E";
    public static final String STOP_EAST_31E = "31E";
    public static final String STOP_EAST_33E = "33E";
    public static final String STOP_EAST_35E = "35E";
    public static final String STOP_EAST_37E = "37E";
    public static final String STOP_EAST_39E = "39E";
    public static final String STOP_EAST_41E = "41E";
    public static final String STOP_EAST_43E = "43E";
    public static final String STOP_EAST_45E = "45E";
    public static final String STOP_EAST_47E = "47E";
    public static final String STOP_EAST_49E = "49E";
    public static final String STOP_EAST_105 = "105";
    public static final String STOP_EAST_106 = "106";
    public static final String STOP_EAST_107 = "107";
    public static final String STOP_EAST_108 = "108";
    public static final String STOP_EAST_HVT_B = "HVT_B";
    public static final String STOP_EAST_109 = "109";
    public static final String STOP_EAST_110 = "110";
    public static final String STOP_EAST_111 = "111";
    public static final String STOP_EAST_112 = "112";
    public static final String STOP_EAST_51E = "51E";
    public static final String STOP_EAST_53E = "53E";
    public static final String STOP_EAST_55E = "55E";
    public static final String STOP_EAST_57E = "57E";
    public static final String STOP_EAST_59E = "59E";
    public static final String STOP_EAST_61E = "61E";
    public static final String STOP_EAST_63E = "63E";
    public static final String STOP_EAST_65E = "65E";
    public static final String STOP_EAST_67E = "67E";
    public static final String STOP_EAST_69E = "69E";
    public static final String STOP_EAST_71E = "71E";
    public static final String STOP_EAST_73E = "73E";
    public static final String STOP_EAST_75E = "75E";
    public static final String STOP_EAST_77E = "77E";
    public static final String STOP_EAST_79E = "79E";
    public static final String STOP_EAST_81E = "81E";
    public static final String STOP_EAST_83E = "83E";
    public static final String STOP_EAST_85E = "85E";
    public static final String STOP_EAST_87E = "87E";
    public static final String STOP_EAST_89E = "89E";
    public static final String STOP_EAST_91E = "91E";
    public static final String STOP_EAST_93E = "93E";
    public static final String STOP_EAST_95E = "95E";
    public static final String STOP_EAST_97E = "97E";
    public static final String STOP_EAST_99E = "99E";
    public static final String STOP_EAST_101E = "101E";


    @GET("nextTram/geteat.php")
    Call<Eta> getEtaList(@Query("stop_code") @StopCode String stopCode);

}
