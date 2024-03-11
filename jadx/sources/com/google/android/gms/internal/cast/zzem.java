package com.google.android.gms.internal.cast;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class zzem extends zzee {
    final /* synthetic */ zzen zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzem(zzen zzenVar) {
        this.zza = zzenVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzdr.zza(i, i2, "index");
        zzen zzenVar = this.zza;
        int i3 = i + i;
        objArr = zzenVar.zzb;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzenVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
