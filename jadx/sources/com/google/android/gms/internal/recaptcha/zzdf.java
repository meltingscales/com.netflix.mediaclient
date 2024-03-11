package com.google.android.gms.internal.recaptcha;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzdf {
    private static volatile zzdf zzc;
    private static final zzdf zzd = new zzdf(true);
    private final Map<Object, Object<?, ?>> zze;

    public static zzdf zza() {
        zzdf zzdfVar = zzc;
        if (zzdfVar == null) {
            synchronized (zzdf.class) {
                zzdfVar = zzc;
                if (zzdfVar == null) {
                    zzdfVar = zzd;
                    zzc = zzdfVar;
                }
            }
        }
        return zzdfVar;
    }

    zzdf() {
        this.zze = new HashMap();
    }

    private zzdf(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
