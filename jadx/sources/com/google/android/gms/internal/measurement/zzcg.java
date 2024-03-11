package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzcg implements zzcb {
    private static zzcg zza;
    private final Context zzb;
    private final ContentObserver zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcg zza(Context context) {
        zzcg zzcgVar;
        synchronized (zzcg.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzcg(context) : new zzcg();
            }
            zzcgVar = zza;
        }
        return zzcgVar;
    }

    private zzcg(Context context) {
        this.zzb = context;
        zzci zzciVar = new zzci(this, null);
        this.zzc = zzciVar;
        context.getContentResolver().registerContentObserver(zzbw.zza, true, zzciVar);
    }

    private zzcg() {
        this.zzb = null;
        this.zzc = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcb
    /* renamed from: zzc */
    public final String zza(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzce.zza(new zzcd(this, str) { // from class: com.google.android.gms.internal.measurement.zzcf
                private final zzcg zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzcd
                public final Object zza() {
                    return this.zza.zzb(this.zzb);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        Context context;
        synchronized (zzcg.class) {
            zzcg zzcgVar = zza;
            if (zzcgVar != null && (context = zzcgVar.zzb) != null && zzcgVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzbw.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
