package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgo implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgo(zzgm zzgmVar) {
        zzej zzejVar;
        this.zzb = zzgmVar;
        zzejVar = zzgmVar.zza;
        this.zza = zzejVar.iterator();
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
