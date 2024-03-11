package com.netflix.mediaclient.net;

/* loaded from: classes.dex */
public enum NetworkSpeedType {
    NoLimit("No Limit", 0, -1),
    GPRS("GPRS", 1, 128000),
    EDGE("EDGE", 2, 256000),
    DSL_512("DSL 512", 3, 512000),
    UMTS_1MBPS("UMTS 1mpbs", 4, 1000000),
    LTE_4G_BASIC("LTE/4G basic", 5, 3000000),
    WIFI_SPEED1("WiFi low", 6, 5000000),
    WIFI_SPEED2("WiFi medium", 7, 8000000),
    WIFI_SPEED3("WiFi high", 8, 16000000);
    
    private final int l;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13191o;

    public long b() {
        return this.n;
    }

    public int c() {
        return this.l;
    }

    NetworkSpeedType(String str, int i, long j2) {
        this.f13191o = str;
        this.l = i;
        this.n = j2;
    }

    public static NetworkSpeedType d(int i) {
        NetworkSpeedType[] values;
        for (NetworkSpeedType networkSpeedType : values()) {
            if (networkSpeedType.c() == i) {
                return networkSpeedType;
            }
        }
        return NoLimit;
    }
}
