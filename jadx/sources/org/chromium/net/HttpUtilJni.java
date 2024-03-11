package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.HttpUtil;

/* loaded from: classes6.dex */
class HttpUtilJni implements HttpUtil.Natives {
    public static final JniStaticTestMocker<HttpUtil.Natives> TEST_HOOKS = new JniStaticTestMocker<HttpUtil.Natives>() { // from class: org.chromium.net.HttpUtilJni.1
    };
    private static HttpUtil.Natives testInstance;

    HttpUtilJni() {
    }

    @Override // org.chromium.net.HttpUtil.Natives
    public boolean isAllowedHeader(String str, String str2) {
        return GEN_JNI.org_chromium_net_HttpUtil_isAllowedHeader(str, str2);
    }

    public static HttpUtil.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            HttpUtil.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.HttpUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new HttpUtilJni();
    }
}
