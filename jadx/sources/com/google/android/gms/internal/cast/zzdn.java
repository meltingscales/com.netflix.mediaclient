package com.google.android.gms.internal.cast;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class zzdn implements Serializable {
    public static zzdn zzb(Object obj) {
        return obj == null ? zzdj.zza : new zzds(obj);
    }

    public abstract Object zza();
}
