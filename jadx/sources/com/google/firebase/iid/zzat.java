package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzat {
    private final SharedPreferences zza;
    private final Context zzb;
    private final zzq zzc;
    private final Map<String, zzs> zzd;

    public zzat(Context context) {
        this(context, new zzq());
    }

    private zzat(Context context, zzq zzqVar) {
        this.zzd = new ArrayMap();
        this.zzb = context;
        this.zza = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzc = zzqVar;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || zzc()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            zzb();
            FirebaseInstanceId.getInstance().zze();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final String zza() {
        String string;
        synchronized (this) {
            string = this.zza.getString("topic_operation_queue", "");
        }
        return string;
    }

    public final void zza(String str) {
        synchronized (this) {
            this.zza.edit().putString("topic_operation_queue", str).apply();
        }
    }

    private final boolean zzc() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.zza.getAll().isEmpty();
        }
        return isEmpty;
    }

    private static String zzc(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final void zzb() {
        synchronized (this) {
            this.zzd.clear();
            zzq.zza(this.zzb);
            this.zza.edit().clear().commit();
        }
    }

    public final zzas zza(String str, String str2, String str3) {
        zzas zza;
        synchronized (this) {
            zza = zzas.zza(this.zza.getString(zzc(str, str2, str3), null));
        }
        return zza;
    }

    public final void zza(String str, String str2, String str3, String str4, String str5) {
        synchronized (this) {
            String zza = zzas.zza(str4, str5, System.currentTimeMillis());
            if (zza == null) {
                return;
            }
            SharedPreferences.Editor edit = this.zza.edit();
            edit.putString(zzc(str, str2, str3), zza);
            edit.commit();
        }
    }

    public final zzs zzb(String str) {
        zzs zzb;
        synchronized (this) {
            zzs zzsVar = this.zzd.get(str);
            if (zzsVar != null) {
                return zzsVar;
            }
            try {
                zzb = this.zzc.zza(this.zzb, str);
            } catch (zzt unused) {
                Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                FirebaseInstanceId.getInstance().zze();
                zzb = this.zzc.zzb(this.zzb, str);
            }
            this.zzd.put(str, zzb);
            return zzb;
        }
    }

    public final void zzc(String str) {
        synchronized (this) {
            String concat = String.valueOf(str).concat("|T|");
            SharedPreferences.Editor edit = this.zza.edit();
            for (String str2 : this.zza.getAll().keySet()) {
                if (str2.startsWith(concat)) {
                    edit.remove(str2);
                }
            }
            edit.commit();
        }
    }
}
