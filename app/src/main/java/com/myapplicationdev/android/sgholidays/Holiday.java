package com.myapplicationdev.android.sgholidays;

public class Holiday {

    private String name;
    private boolean christmas;
    private boolean cny;
    private boolean deepavali;
    private boolean goodFriday;
    private boolean haji;
    private boolean puasa;
    private boolean labour;
    private boolean nationalDay;
    private boolean newYear;
    private boolean vesak;

    public Holiday(String name, boolean christmas, boolean cny, boolean deepavali, boolean goodFriday, boolean haji, boolean puasa, boolean labour, boolean nationalDay, boolean newYear, boolean vesak) {
        this.name = name;
        this.christmas = christmas;
        this.cny = cny;
        this.deepavali = deepavali;
        this.goodFriday = goodFriday;
        this.haji = haji;
        this.puasa = puasa;
        this.labour = labour;
        this.nationalDay = nationalDay;
        this.newYear = newYear;
        this.vesak = vesak;
    }

    public String getName() {
        return name;
    }

    public boolean isChristmas() {
        return christmas;
    }

    public boolean isCny() {
        return cny;
    }

    public boolean isDeepavali() {
        return deepavali;
    }

    public boolean isGoodFriday() {
        return goodFriday;
    }

    public boolean isHaji() {
        return haji;
    }

    public boolean isPuasa() {
        return puasa;
    }

    public boolean isLabour() {
        return labour;
    }

    public boolean isNationalDay() {
        return nationalDay;
    }

    public boolean isNewYear() {
        return newYear;
    }

    public boolean isVesak() {
        return vesak;
    }
}
