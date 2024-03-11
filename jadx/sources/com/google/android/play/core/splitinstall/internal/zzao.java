package com.google.android.play.core.splitinstall.internal;

import android.os.Build;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes.dex */
public final class zzao {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzan zza() {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return new zzaz();
            case 25:
                return new zzba();
            case 26:
                return new zzbd();
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new zzbe();
                }
                break;
        }
        return new zzbg();
    }
}
