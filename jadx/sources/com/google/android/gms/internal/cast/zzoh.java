package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzoh {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!zzoh$$ExternalSyntheticBackportWithForwarding0.m(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
