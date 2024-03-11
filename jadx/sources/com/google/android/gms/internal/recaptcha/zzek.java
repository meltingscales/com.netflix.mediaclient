package com.google.android.gms.internal.recaptcha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzek extends zzei {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzek() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzei
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgn.zzf(obj, j);
        if (list instanceof zzej) {
            unmodifiableList = ((zzej) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzfl) && (list instanceof zzdz)) {
                zzdz zzdzVar = (zzdz) list;
                if (zzdzVar.zza()) {
                    zzdzVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgn.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzeg zzegVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzej) {
                arrayList = new zzeg(i);
            } else if ((zzc instanceof zzfl) && (zzc instanceof zzdz)) {
                arrayList = ((zzdz) zzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzgn.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzgn.zza(obj, j, arrayList2);
            zzegVar = arrayList2;
        } else if (zzc instanceof zzgm) {
            zzeg zzegVar2 = new zzeg(zzc.size() + i);
            zzegVar2.addAll((zzgm) zzc);
            zzgn.zza(obj, j, zzegVar2);
            zzegVar = zzegVar2;
        } else if ((zzc instanceof zzfl) && (zzc instanceof zzdz)) {
            zzdz zzdzVar = (zzdz) zzc;
            if (zzdzVar.zza()) {
                return zzc;
            }
            zzdz zza2 = zzdzVar.zza(zzc.size() + i);
            zzgn.zza(obj, j, zza2);
            return zza2;
        } else {
            return zzc;
        }
        return zzegVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzei
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzgn.zza(obj, j, zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzgn.zzf(obj, j);
    }
}
