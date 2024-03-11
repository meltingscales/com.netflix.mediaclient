package org.chromium.base;

import android.content.Context;

/* loaded from: classes5.dex */
public class ApiCompatibilityUtils {
    public static int checkPermission(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }
}
