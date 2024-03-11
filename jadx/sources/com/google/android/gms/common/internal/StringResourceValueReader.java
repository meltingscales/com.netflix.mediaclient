package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.Base64;
import com.google.android.gms.common.R;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public class StringResourceValueReader {
    private static int a = 0;
    private static int d = 1;
    private static byte e$ss2$33 = 24;
    private final Resources zza;
    private final String zzb;

    public StringResourceValueReader(Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public String getString(String str) {
        int i = 2 % 2;
        int i2 = a + 79;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.zza.getIdentifier(str, "string", this.zzb);
            obj.hashCode();
            throw null;
        }
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        String string = this.zza.getString(identifier);
        if (string.startsWith("'!#+")) {
            int i3 = d + 13;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            b(string.substring(4), objArr2);
            ((String) objArr2[0]).intern();
            obj.hashCode();
            throw null;
        }
        return string;
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$33);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
