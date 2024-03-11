package org.chromium.net;

/* loaded from: classes6.dex */
public final class GURLUtils {

    /* loaded from: classes6.dex */
    public interface Natives {
        String getOrigin(String str);
    }

    public static String getOrigin(String str) {
        return GURLUtilsJni.get().getOrigin(str);
    }
}
