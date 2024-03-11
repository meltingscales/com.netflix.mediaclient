package org.chromium.net;

/* loaded from: classes6.dex */
public final class HttpUtil {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        boolean isAllowedHeader(String str, String str2);
    }

    public static boolean isAllowedHeader(String str, String str2) {
        return HttpUtilJni.get().isAllowedHeader(str, str2);
    }
}
