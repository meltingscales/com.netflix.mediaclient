package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzic implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzia zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzic(zzia zziaVar) {
        zzfv zzfvVar;
        this.zzb = zziaVar;
        zzfvVar = zziaVar.zza;
        this.zza = zzfvVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }
}
