package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
final class zzga extends zzfy {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzga() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfy
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfy
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzib.zzf(obj, j);
        if (list instanceof zzfv) {
            unmodifiableList = ((zzfv) list).g_();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzha) && (list instanceof zzfl)) {
                zzfl zzflVar = (zzfl) list;
                if (zzflVar.zza()) {
                    zzflVar.h_();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzib.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzfw zzfwVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzfv) {
                arrayList = new zzfw(i);
            } else if ((zzc instanceof zzha) && (zzc instanceof zzfl)) {
                arrayList = ((zzfl) zzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzib.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzib.zza(obj, j, arrayList2);
            zzfwVar = arrayList2;
        } else if (zzc instanceof zzia) {
            zzfw zzfwVar2 = new zzfw(zzc.size() + i);
            zzfwVar2.addAll((zzia) zzc);
            zzib.zza(obj, j, zzfwVar2);
            zzfwVar = zzfwVar2;
        } else if ((zzc instanceof zzha) && (zzc instanceof zzfl)) {
            zzfl zzflVar = (zzfl) zzc;
            if (zzflVar.zza()) {
                return zzc;
            }
            zzfl zza2 = zzflVar.zza(zzc.size() + i);
            zzib.zza(obj, j, zza2);
            return zza2;
        } else {
            return zzc;
        }
        return zzfwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfy
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
        zzib.zza(obj, j, zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzib.zzf(obj, j);
    }
}
