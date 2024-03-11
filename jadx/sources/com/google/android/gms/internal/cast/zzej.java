package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzej extends zzeu {
    boolean zza;
    final /* synthetic */ Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzej(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
