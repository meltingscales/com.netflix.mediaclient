package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzsh implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzsi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsh(zzsi zzsiVar) {
        zzqj zzqjVar;
        this.zzb = zzsiVar;
        zzqjVar = zzsiVar.zza;
        this.zza = zzqjVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
