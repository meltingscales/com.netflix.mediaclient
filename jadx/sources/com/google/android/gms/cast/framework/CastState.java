package com.google.android.gms.cast.framework;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class CastState {
    public static String toString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.format(Locale.ROOT, "UNKNOWN_STATE(%d)", Integer.valueOf(i)) : "CONNECTED" : "CONNECTING" : "NOT_CONNECTED" : "NO_DEVICES_AVAILABLE";
    }
}
