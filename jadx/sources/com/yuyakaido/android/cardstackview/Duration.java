package com.yuyakaido.android.cardstackview;

/* loaded from: classes5.dex */
public enum Duration {
    Fast(100),
    Normal(200),
    Slow(500);
    
    public final int c;

    public static Duration b(int i) {
        return i < 1000 ? Slow : i < 5000 ? Normal : Fast;
    }

    Duration(int i) {
        this.c = i;
    }
}
