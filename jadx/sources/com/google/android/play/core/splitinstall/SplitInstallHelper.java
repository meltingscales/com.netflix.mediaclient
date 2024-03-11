package com.google.android.play.core.splitinstall;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    public static void loadLibrary(Context context, String str) {
        synchronized (zzn.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (new File(str2).exists()) {
                    System.load(str2);
                } else {
                    throw e;
                }
            }
        }
    }
}
