package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzec extends zzdv {
    private final zzee zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzee zzeeVar, int i) {
        super(zzeeVar.size(), i);
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdv
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
