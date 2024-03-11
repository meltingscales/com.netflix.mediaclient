package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzs {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallInfoProvider");
    private final Context zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(Context context) {
        this.zzc = context;
        this.zzd = context.getPackageName();
    }

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set zzf(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : zzh(packageInfo)) {
            if (!zze(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final PackageInfo zzg() {
        try {
            return this.zzc.getPackageManager().getPackageInfo(this.zzd, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            zzb.zzb("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    private static final Set zzh(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zzb.zza("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            zzb.zza("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            zzb.zza("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        zzq zza2 = zzr.zza();
        if (zza2 != null) {
            hashSet.addAll(zza2.zza());
        }
        return hashSet;
    }

    public final zzk zza(Bundle bundle) {
        if (bundle == null) {
            zzb.zze("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            zzb.zze("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            zzk zza2 = zzbg.zza(this.zzc.getResources().getXml(i), new zzi());
            if (zza2 == null) {
                zzb.zze("Can't parse languages metadata.", new Object[0]);
            }
            return zza2;
        } catch (Resources.NotFoundException unused) {
            zzb.zze("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set zzc() {
        PackageInfo zzg = zzg();
        if (zzg == null || zzg.applicationInfo == null) {
            return new HashSet();
        }
        return zzf(zzg);
    }

    public final Set zzd() {
        ApplicationInfo applicationInfo;
        PackageInfo zzg = zzg();
        HashSet hashSet = null;
        if (zzg != null && (applicationInfo = zzg.applicationInfo) != null) {
            zzk zza2 = zza(applicationInfo.metaData);
            if (zza2 == null) {
                return null;
            }
            hashSet = new HashSet();
            Set zzh = zzh(zzg);
            zzh.add("");
            Set zzf = zzf(zzg);
            zzf.add("");
            for (Map.Entry entry : zza2.zza(zzf).entrySet()) {
                if (zzh.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
