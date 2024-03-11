package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzqn extends zzqp {
    private zzqn() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqn(zzqm zzqmVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzqp
    public final void zza(Object obj, long j) {
        ((zzqb) zzsn.zzf(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzqp
    public final void zzb(Object obj, Object obj2, long j) {
        zzqb zzqbVar = (zzqb) zzsn.zzf(obj, j);
        zzqb zzqbVar2 = (zzqb) zzsn.zzf(obj2, j);
        int size = zzqbVar.size();
        int size2 = zzqbVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzqbVar.zzc()) {
                zzqbVar = zzqbVar.zzg(size2 + size);
            }
            zzqbVar.addAll(zzqbVar2);
        }
        if (size > 0) {
            zzqbVar2 = zzqbVar;
        }
        zzsn.zzs(obj, j, zzqbVar2);
    }
}
