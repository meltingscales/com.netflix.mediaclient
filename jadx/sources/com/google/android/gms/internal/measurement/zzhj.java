package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzhj extends zzhp {
    private final /* synthetic */ zzhi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzhj(zzhi zzhiVar) {
        super(zzhiVar, null);
        this.zza = zzhiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new zzhk(this.zza, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhj(zzhi zzhiVar, zzhh zzhhVar) {
        this(zzhiVar);
    }
}
