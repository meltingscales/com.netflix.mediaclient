package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzcu implements zzcb {
    private static final Map<String, zzcu> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private final Object zzd;
    private volatile Map<String, ?> zze;
    private final List<zzcc> zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcu zza(Context context, String str) {
        zzcu zzcuVar;
        SharedPreferences sharedPreferences;
        if (!zzby.zza() || str.startsWith("direct_boot:") || zzby.zza(context)) {
            synchronized (zzcu.class) {
                Map<String, zzcu> map = zza;
                zzcuVar = map.get(str);
                if (zzcuVar == null) {
                    if (str.startsWith("direct_boot:")) {
                        if (zzby.zza()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    zzcuVar = new zzcu(sharedPreferences);
                    map.put(str, zzcuVar);
                }
            }
            return zzcuVar;
        }
        return null;
    }

    private zzcu(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzct
            private final zzcu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.zza.zza(sharedPreferences2, str);
            }
        };
        this.zzc = onSharedPreferenceChangeListener;
        this.zzd = new Object();
        this.zzf = new ArrayList();
        this.zzb = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final Object zza(String str) {
        Map<String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                map = this.zze;
                if (map == null) {
                    map = this.zzb.getAll();
                    this.zze = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        synchronized (zzcu.class) {
            for (zzcu zzcuVar : zza.values()) {
                zzcuVar.zzb.unregisterOnSharedPreferenceChangeListener(zzcuVar.zzc);
            }
            zza.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzd) {
            this.zze = null;
            zzcl.zza();
        }
        synchronized (this) {
            for (zzcc zzccVar : this.zzf) {
                zzccVar.zza();
            }
        }
    }
}
