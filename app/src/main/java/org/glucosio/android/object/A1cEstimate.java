package org.glucosio.android.object;

import org.glucosio.android.tools.GlucosioConverter;

public class A1cEstimate {
    private double value;
    private String month;

    public A1cEstimate(double value, String month) {
        this.value = value;
        this.month = month;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getGlucoseAverage() {
        GlucosioConverter conveter = new GlucosioConverter();
        return conveter.a1cToGlucose(value) + "";
    }
}
