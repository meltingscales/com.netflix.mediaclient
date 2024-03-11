package com.google.android.gms.internal.recaptcha;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzcj implements Comparator<zzch> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzch zzchVar, zzch zzchVar2) {
        int zzb;
        int zzb2;
        zzch zzchVar3 = zzchVar;
        zzch zzchVar4 = zzchVar2;
        zzcm zzcmVar = (zzcm) zzchVar3.iterator();
        zzcm zzcmVar2 = (zzcm) zzchVar4.iterator();
        while (zzcmVar.hasNext() && zzcmVar2.hasNext()) {
            zzb = zzch.zzb(zzcmVar.zza());
            zzb2 = zzch.zzb(zzcmVar2.zza());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzchVar3.zza(), zzchVar4.zza());
    }
}
