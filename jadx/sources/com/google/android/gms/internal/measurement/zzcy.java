package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class zzcy<T> implements Serializable {
    public static <T> zzcy<T> zzc() {
        return zzcw.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> zzcy<T> zza(T t) {
        return new zzda(zzcx.zza(t));
    }
}
