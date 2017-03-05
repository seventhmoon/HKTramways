package com.androidfung.hktramways.model;

import android.support.annotation.NonNull;

import com.google.common.collect.ComparisonChain;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.util.Date;

/**
 * Created by fung on 3/4/2017.
 */

@Root(name = "metadata")
public class Metadata implements Comparable<Metadata>{

//      <metadata arrive_in_minute="5" arrive_in_second="228" is_arrived="0" stop_code="16W" seq="1" tram_id="46" eat="Mar 4 2017 10:42PM" dest_stop_code="WMT" tram_dest_tc="上環 (西港城) 總站" tram_dest_en="Western Market Terminus" is_last_tram="0"/>

    @Attribute(name="arrive_in_minute")
    private int arrivalInMinute;

    @Attribute(name="arrive_in_second")
    private int arriveInSecond;

    @Attribute(name="is_arrived")
    private boolean arrived;

    @Attribute(name="stop_code")
    private String stopCode;

    @Attribute(name="eat")
    private String eta;

    @Attribute(name="tram_id")
    private String tramId;

    @Attribute(name="dest_stop_code")
    private String destCode;

    @Attribute(name="tram_dest_tc")
    private String destDescHant;

    @Attribute(name="tram_dest_en")
    private String destDescEn;

    @Attribute(name="is_last_tram")
    private boolean lastTram;

    @Attribute(name="seq")
    private int sequence;

    @Override
    public String toString() {
        return "Metadata{" +
                "arrivalInMinute=" + arrivalInMinute +
                ", arriveInSecond=" + arriveInSecond +
                ", arrived=" + arrived +
                ", stopCode='" + stopCode + '\'' +
                ", eta=" + eta +
                ", tramId='" + tramId + '\'' +
                ", destCode='" + destCode + '\'' +
                ", destDescHant='" + destDescHant + '\'' +
                ", destDescEn='" + destDescEn + '\'' +
                ", lastTram=" + lastTram +
                ", sequence=" + sequence +
                '}';
    }

    public int getArrivalInMinute() {
        return arrivalInMinute;
    }

    public void setArrivalInMinute(int arrivalInMinute) {
        this.arrivalInMinute = arrivalInMinute;
    }

    public int getArriveInSecond() {
        return arriveInSecond;
    }

    public void setArriveInSecond(int arriveInSecond) {
        this.arriveInSecond = arriveInSecond;
    }

    public boolean isArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getTramId() {
        return tramId;
    }

    public void setTramId(String tramId) {
        this.tramId = tramId;
    }

    public String getDestCode() {
        return destCode;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setDestCode(String destCode) {
        this.destCode = destCode;
    }

    public String getDestDescHant() {
        return destDescHant;
    }

    public void setDestDescHant(String destDescHant) {
        this.destDescHant = destDescHant;
    }

    public String getDestDescEn() {
        return destDescEn;
    }

    public void setDestDescEn(String destDescEn) {
        this.destDescEn = destDescEn;
    }

    public boolean isLastTram() {
        return lastTram;
    }

    public void setLastTram(boolean lastTram) {
        this.lastTram = lastTram;
    }

    @Override
    public int compareTo(@NonNull Metadata eta) {

        return ComparisonChain.start()
                .compare(this.sequence, eta.getSequence())
//                .compare(this.eta, eta.getEta())
                .compare(this.tramId, eta.tramId)
                .result();
    }
}
