package com.google.android.gms.internal.recaptcha;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class zzai {
    public static String zza(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.recaptcha.internal.VERIFICATION_HISTORY_FILE_KEY", 0);
        String zza = zza(str);
        return sharedPreferences.contains(zza) ? sharedPreferences.getString(zza, "") : "";
    }

    private static String zza(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "verification_history_token_key:".concat(valueOf) : new String("verification_history_token_key:");
    }
}
