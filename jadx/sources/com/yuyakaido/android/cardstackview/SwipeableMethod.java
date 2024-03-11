package com.yuyakaido.android.cardstackview;

/* loaded from: classes5.dex */
public enum SwipeableMethod {
    AutomaticAndManual,
    Automatic,
    Manual,
    None;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this == AutomaticAndManual || this == Automatic;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this == AutomaticAndManual || this == Manual;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return b() || e();
    }
}
