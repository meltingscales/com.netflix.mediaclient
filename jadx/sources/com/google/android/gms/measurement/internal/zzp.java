package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzmj;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzp {
    private String zza;
    private boolean zzb;
    private zzbr.zzi zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzn zzh;

    private zzp(zzn zznVar, String str) {
        this.zzh = zznVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzp(zzn zznVar, String str, zzbr.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zznVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zziVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzu zzuVar) {
        int zza = zzuVar.zza();
        Boolean bool = zzuVar.zzc;
        if (bool != null) {
            this.zze.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzuVar.zzd;
        if (bool2 != null) {
            this.zzd.set(zza, bool2.booleanValue());
        }
        if (zzuVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzuVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzuVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzmj.zzb() && this.zzh.zzt().zzd(this.zza, zzap.zzbs) && zzuVar.zzb()) {
                list.clear();
            }
            list.add(Long.valueOf(zzuVar.zzf.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbr.zza zza(int i, List<Integer> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        zzbr.zza.C0041zza zzh = zzbr.zza.zzh();
        zzh.zza(i);
        zzh.zza(this.zzb);
        zzbr.zzi zziVar = this.zzc;
        if (zziVar != null) {
            zzh.zza(zziVar);
        }
        zzbr.zzi.zza zza = zzbr.zzi.zzi().zzb(zzki.zza(this.zzd)).zza(zzki.zza(this.zze));
        Map<Integer, Long> map = this.zzf;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer num : this.zzf.keySet()) {
                int intValue = num.intValue();
                arrayList.add((zzbr.zzb) ((com.google.android.gms.internal.measurement.zzfd) zzbr.zzb.zze().zza(intValue).zza(this.zzf.get(Integer.valueOf(intValue)).longValue()).zzu()));
            }
        }
        zza.zzc(arrayList);
        Map<Integer, List<Long>> map2 = this.zzg;
        if (map2 == null) {
            arrayList2 = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzg.keySet()) {
                zzbr.zzj.zza zza2 = zzbr.zzj.zze().zza(num2.intValue());
                List<Long> list2 = this.zzg.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zza2.zza(list2);
                }
                arrayList3.add((zzbr.zzj) ((com.google.android.gms.internal.measurement.zzfd) zza2.zzu()));
            }
            arrayList2 = arrayList3;
        }
        if ((!zzmj.zzb() || !this.zzh.zzt().zzd(this.zza, zzap.zzbs)) && zzh.zza()) {
            List<zzbr.zzj> zzg = zzh.zzb().zzg();
            if (!zzg.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(arrayList2);
                ArrayMap arrayMap = new ArrayMap();
                for (zzbr.zzj zzjVar : zzg) {
                    if (zzjVar.zza() && zzjVar.zzd() > 0) {
                        arrayMap.put(Integer.valueOf(zzjVar.zzb()), Long.valueOf(zzjVar.zza(zzjVar.zzd() - 1)));
                    }
                }
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    zzbr.zzj zzjVar2 = (zzbr.zzj) arrayList4.get(i2);
                    Long l = (Long) arrayMap.remove(zzjVar2.zza() ? Integer.valueOf(zzjVar2.zzb()) : null);
                    if (l != null && (list == null || !list.contains(Integer.valueOf(zzjVar2.zzb())))) {
                        ArrayList arrayList5 = new ArrayList();
                        if (l.longValue() < zzjVar2.zza(0)) {
                            arrayList5.add(l);
                        }
                        arrayList5.addAll(zzjVar2.zzc());
                        arrayList4.set(i2, (zzbr.zzj) ((com.google.android.gms.internal.measurement.zzfd) zzjVar2.zzbm().zza().zza(arrayList5).zzu()));
                    }
                }
                for (Integer num3 : arrayMap.keySet()) {
                    arrayList4.add((zzbr.zzj) ((com.google.android.gms.internal.measurement.zzfd) zzbr.zzj.zze().zza(num3.intValue()).zza(((Long) arrayMap.get(num3)).longValue()).zzu()));
                }
                arrayList2 = arrayList4;
            }
        }
        zza.zzd(arrayList2);
        zzh.zza(zza);
        return (zzbr.zza) ((com.google.android.gms.internal.measurement.zzfd) zzh.zzu());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzn zznVar, String str, zzbr.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzq zzqVar) {
        this(zznVar, str, zziVar, bitSet, bitSet2, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzn zznVar, String str, zzq zzqVar) {
        this(zznVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ BitSet zza(zzp zzpVar) {
        return zzpVar.zzd;
    }
}
