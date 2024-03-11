package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class zzl {
    private static final Logger zza = new Logger("FeatureUsageAnalytics");
    private static final String zzb = "21.1.0";
    private static zzl zzc;
    private final zzd zzd;
    private final SharedPreferences zze;
    private final String zzf;
    private final Runnable zzg;
    private final Handler zzh;
    private final Set zzi;
    private final Set zzj;
    private long zzk;

    private zzl(SharedPreferences sharedPreferences, zzd zzdVar, String str) {
        this.zze = sharedPreferences;
        this.zzd = zzdVar;
        this.zzf = str;
        HashSet hashSet = new HashSet();
        this.zzi = hashSet;
        HashSet hashSet2 = new HashSet();
        this.zzj = hashSet2;
        this.zzh = new zzcv(Looper.getMainLooper());
        this.zzg = new Runnable() { // from class: com.google.android.gms.internal.cast.zzk
            @Override // java.lang.Runnable
            public final void run() {
                zzl.zzc(zzl.this);
            }
        };
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.zzk = 0L;
        if (!zzb.equals(string) || !str.equals(string2)) {
            HashSet hashSet3 = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet3.add(str2);
                }
            }
            hashSet3.add("feature_usage_last_report_time");
            zzg(hashSet3);
            this.zze.edit().putString("feature_usage_sdk_version", zzb).putString("feature_usage_package_name", this.zzf).apply();
            return;
        }
        this.zzk = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long zzi = zzi();
        HashSet hashSet4 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j = this.zze.getLong(str3, 0L);
                if (j == 0 || zzi - j <= 1209600000) {
                    if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                        zzkk zze = zze(str3.substring(41));
                        this.zzj.add(zze);
                        this.zzi.add(zze);
                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                        this.zzi.add(zze(str3.substring(41)));
                    }
                } else {
                    hashSet4.add(str3);
                }
            }
        }
        zzg(hashSet4);
        Preconditions.checkNotNull(this.zzh);
        Preconditions.checkNotNull(this.zzg);
        zzh();
    }

    public static zzl zza(SharedPreferences sharedPreferences, zzd zzdVar, String str) {
        zzl zzlVar;
        synchronized (zzl.class) {
            if (zzc == null) {
                zzc = new zzl(sharedPreferences, zzdVar, str);
            }
            zzlVar = zzc;
        }
        return zzlVar;
    }

    @VisibleForTesting
    static String zzb(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static /* synthetic */ void zzc(zzl zzlVar) {
        if (zzlVar.zzi.isEmpty()) {
            return;
        }
        long j = true != zzlVar.zzj.equals(zzlVar.zzi) ? 86400000L : 172800000L;
        long zzi = zzi();
        long j2 = zzlVar.zzk;
        if (j2 == 0 || zzi - j2 >= j) {
            zza.d("Upload the feature usage report.", new Object[0]);
            zzkz zza2 = zzla.zza();
            zza2.zzb(zzb);
            zza2.zza(zzlVar.zzf);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(zzlVar.zzi);
            zzkt zza3 = zzku.zza();
            zza3.zza(arrayList);
            zza3.zzb((zzla) zza2.zzp());
            zzlj zzc2 = zzlk.zzc();
            zzc2.zzc((zzku) zza3.zzp());
            zzlVar.zzd.zzb((zzlk) zzc2.zzp(), 243);
            SharedPreferences.Editor edit = zzlVar.zze.edit();
            if (!zzlVar.zzj.equals(zzlVar.zzi)) {
                zzlVar.zzj.clear();
                zzlVar.zzj.addAll(zzlVar.zzi);
                for (zzkk zzkkVar : zzlVar.zzj) {
                    String num = Integer.toString(zzkkVar.zza());
                    String zzf = zzlVar.zzf(num);
                    String zzb2 = zzb("feature_usage_timestamp_reported_feature_", num);
                    if (!TextUtils.equals(zzf, zzb2)) {
                        long j3 = zzlVar.zze.getLong(zzf, 0L);
                        edit.remove(zzf);
                        if (j3 != 0) {
                            edit.putLong(zzb2, j3);
                        }
                    }
                }
            }
            zzlVar.zzk = zzi;
            edit.putLong("feature_usage_last_report_time", zzi).apply();
        }
    }

    public static void zzd(zzkk zzkkVar) {
        zzl zzlVar = zzc;
        if (zzlVar == null) {
            return;
        }
        zzlVar.zze.edit().putLong(zzlVar.zzf(Integer.toString(zzkkVar.zza())), zzi()).apply();
        zzlVar.zzi.add(zzkkVar);
        zzlVar.zzh();
    }

    private static zzkk zze(String str) {
        try {
            return zzkk.zzb(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return zzkk.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    @RequiresNonNull({"sharedPreferences"})
    private final String zzf(String str) {
        String zzb2 = zzb("feature_usage_timestamp_reported_feature_", str);
        return this.zze.contains(zzb2) ? zzb2 : zzb("feature_usage_timestamp_detected_feature_", str);
    }

    private final void zzg(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.zze.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    @RequiresNonNull({"handler", "reportFeatureUsageRunnable"})
    private final void zzh() {
        this.zzh.post(this.zzg);
    }

    private static final long zzi() {
        return DefaultClock.getInstance().currentTimeMillis();
    }
}
