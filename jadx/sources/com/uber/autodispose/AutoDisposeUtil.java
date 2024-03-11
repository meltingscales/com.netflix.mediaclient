package com.uber.autodispose;

/* loaded from: classes5.dex */
final class AutoDisposeUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
