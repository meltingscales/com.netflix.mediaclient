package com.google.android.gms.common.util;

import android.util.Base64;

/* loaded from: classes5.dex */
public final class Base64Utils {
    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
