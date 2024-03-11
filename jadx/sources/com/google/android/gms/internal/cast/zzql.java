package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzql extends zzqp {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzql() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzql(zzqk zzqkVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzqp
    public final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzsn.zzf(obj, j);
        if (list instanceof zzqj) {
            unmodifiableList = ((zzqj) list).zzd();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzri) || !(list instanceof zzqb)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzqb zzqbVar = (zzqb) list;
                if (zzqbVar.zzc()) {
                    zzqbVar.zzb();
                    return;
                }
                return;
            }
        }
        zzsn.zzs(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zzqp
    public final void zzb(Object obj, Object obj2, long j) {
        zzqi zzqiVar;
        List list = (List) zzsn.zzf(obj2, j);
        int size = list.size();
        List list2 = (List) zzsn.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzqj) {
                list2 = new zzqi(size);
            } else if (!(list2 instanceof zzri) || !(list2 instanceof zzqb)) {
                list2 = new ArrayList(size);
            } else {
                list2 = ((zzqb) list2).zzg(size);
            }
            zzsn.zzs(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzsn.zzs(obj, j, arrayList);
                zzqiVar = arrayList;
            } else if (list2 instanceof zzsi) {
                zzqi zzqiVar2 = new zzqi(list2.size() + size);
                zzqiVar2.addAll(zzqiVar2.size(), (zzsi) list2);
                zzsn.zzs(obj, j, zzqiVar2);
                zzqiVar = zzqiVar2;
            } else if ((list2 instanceof zzri) && (list2 instanceof zzqb)) {
                zzqb zzqbVar = (zzqb) list2;
                if (!zzqbVar.zzc()) {
                    list2 = zzqbVar.zzg(list2.size() + size);
                    zzsn.zzs(obj, j, list2);
                }
            }
            list2 = zzqiVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzsn.zzs(obj, j, list);
    }
}
