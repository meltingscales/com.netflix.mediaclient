package com.google.android.gms.internal.recaptcha;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzgi extends RuntimeException {
    private final List<String> zza;

    public zzgi(zzey zzeyVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }
}
