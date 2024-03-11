package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ManufacturerUtils {
    public static boolean isMeizuDevice() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
}
