package com.google.android.gms.internal.recaptcha;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzdy extends IOException {
    private zzey zza;

    public zzdy(String str) {
        super(str);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdy zza() {
        return new zzdy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdy zzb() {
        return new zzdy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeb zzf() {
        return new zzeb("Protocol message tag had invalid wire type.");
    }
}
