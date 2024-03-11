package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Logger {
    protected final String zza;
    private final boolean zzb;
    private boolean zzc;
    private String zzd;

    public Logger(String str) {
        Preconditions.checkNotEmpty(str, "The log tag cannot be null or empty.");
        this.zza = str;
        this.zzb = str.length() <= 23;
        this.zzc = false;
    }

    public void d(String str, Object... objArr) {
        if (zzd()) {
            Log.d(this.zza, zza(str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        Log.e(this.zza, zza(str, objArr));
    }

    public void i(String str, Object... objArr) {
        Log.i(this.zza, zza(str, objArr));
    }

    public void w(String str, Object... objArr) {
        Log.w(this.zza, zza(str, objArr));
    }

    protected final String zza(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.zzd)) {
            return str;
        }
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final void zzc(String str) {
        this.zzd = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
    }

    public final boolean zzd() {
        return this.zzc || (this.zzb && Log.isLoggable(this.zza, 3));
    }

    public void e(Throwable th, String str, Object... objArr) {
        Log.e(this.zza, zza(str, objArr), th);
    }

    public void w(Throwable th, String str, Object... objArr) {
        Log.w(this.zza, zza(str, objArr), th);
    }

    public void d(Throwable th, String str, Object... objArr) {
        if (zzd()) {
            Log.d(this.zza, zza(str, objArr), th);
        }
    }
}
